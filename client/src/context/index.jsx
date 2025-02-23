import React, { useContext, createContext } from 'react';
import { useAddress, useContract, useConnect, useContractWrite } from '@thirdweb-dev/react';
import { ethers } from 'ethers';

const StateContext = createContext();

export const StateContextProvider = ({ children }) => {
  const { contract } = useContract('0x606de6b8fe89fa5099ec7a0063053aa2443bd610');
  const { mutateAsync: createCampaign } = useContractWrite(contract, 'createCampaign');
  const address = useAddress();
  const connect = useConnect();

  const publishCampaign = async (form) => {
    try {
      const data = await createCampaign({
        args: [
          address, 
          form.title,
          form.description,
          form.target,
					new Date(form.deadline).getTime(), // ✅ Convert to Unix timestamp
          form.image
        ]
      });
      console.log("Contract call success", data);
    } catch (error) {
      console.error("Contract call failure", error);
    }
  };

  const getCampaigns = async () => {
    const campaigns = await contract.call('getCampaigns');
    const parsedCampaigns = campaigns.map((campaign, i) => ({
      owner: campaign.owner,
      title: campaign.title,
      description: campaign.description,
      target: ethers.utils.formatEther(campaign.target.toString()),
      deadline: campaign.deadline.toNumber(),
      amountCollected: ethers.utils.formatEther(campaign.amountCollected.toString()),
      image: campaign.image,
      pId: i
    }));
    return parsedCampaigns;
  };

  const getUserCampaigns = async () => {
    const allCampaigns = await getCampaigns();
    return allCampaigns.filter(campaign => campaign.owner === address);
  };

  const donate = async (pId, amount) => {
    const data = await contract.call('donateToCampaign', [pId], {
      value: ethers.utils.parseEther(amount)
    });
    return data;
  };

  const getDonations = async (pId) => {
    const donations = await contract.call('getDonators', [pId]);
    const parsedDonations = donations[0].map((donator, i) => ({
      donator,
      donation: ethers.utils.formatEther(donations[1][i].toString())
    }));
    return parsedDonations;
  };

  return (
    <StateContext.Provider
      value={{ 
        address,
        contract,
        connect,
        createCampaign: publishCampaign,
        getCampaigns,
        getUserCampaigns,
        donate,
        getDonations
      }}
    >
      {children}
    </StateContext.Provider>
  );
};

export const useStateContext = () => useContext(StateContext);
