// require("@matterlabs/hardhat-zksync-solc");
// require("@matterlabs/hardhat-zksync-verify");
// require("@nomicfoundation/hardhat-toolbox");
// require("dotenv").config(); // Load environment variables

// /** @type import('hardhat/config').HardhatUserConfig */
// module.exports = {
//   zksolc: {
//     version: "1.4.1",
//     compilerSource: "binary",
//     settings: {
//       optimizer: {
//         enabled: true,
//       },
//     },
//   },
//   defaultNetwork: "sepolia",
//   networks: {
//     hardhat: {
//     },
//     sepolia: {
//       url: "",
//       accounts:[`0x${process.env.PRIVATE_KEY}`],
//     }
//   },
//   networks: {
//     zkSyncSepoliaTestnet: {
//       url: "https://sepolia.era.zksync.dev",
//       // accounts: [`0x${process.env.PRIVATE_KEY}`],
//       ethNetwork: "sepolia",
//       zksync: true,
//       chainId: 300,
//       verifyURL:
//         "https://explorer.sepolia.era.zksync.dev/contract_verification",
//     },
//     zkSyncMainnet: {
//       url: "https://mainnet.era.zksync.io",
//       // accounts: [`0x${process.env.PRIVATE_KEY}`],
//       ethNetwork: "mainnet",
//       zksync: true,
//       chainId: 324,
//       verifyURL:
//         "https://zksync2-mainnet-explorer.zksync.io/contract_verification",
//     },
//   },
//   paths: {
//     artifacts: "./artifacts-zk",
//     cache: "./cache-zk",
//     sources: "./contracts",
//     tests: "./test",
//   },
//   solidity: {
//     version: "0.8.23",
//     settings: {
//       optimizer: {
//         enabled: true,
//         runs: 200,
//       },
//     },
//   },
// };

//2nd

// module.exports = {
//   solidity: "0.8.9",
//   networks: {
//     sepolia: {
//       url: "https://rpc.thirdweb.com/eth-sepolia", // ThirdWeb RPC URL
//       accounts: [`0x${process.env.PRIVATE_KEY}`], // Private key from .env
//       chainId: 11155111,
//     },
//   },
// };

//3rd

// module.exports = {
//   solidity: {
//     version: '0.8.28',
//     defaultNetwork: 'sepolia',
//     networks: {
//       hardhat: {},
//       sepolia: {
//         url: 'https://rpc.thirdweb.com/eth-sepolia',
//         accounts: [`0x${process.env.PRIVATE_KEY}`],
//         chainId: 11155111,
//       }
//     },
//     settings: {
//       optimizer: {
//         enabled: true,
//         runs: 200,
//       },
//     },
//   },
// }

/** @type import('hardhat/config').HardhatUserConfig */
require("dotenv").config();
require("@nomicfoundation/hardhat-toolbox");

module.exports = {
  defaultNetwork: "sepolia",
  solidity: {
    version: "0.8.9",
    settings: {
      optimizer: {
        enabled: true,
        runs: 200,
      },
    },
  },
  networks: {
    hardhat: {},
    sepolia: {
      url: "https://sepolia.rpc.thirdweb.com",
      accounts: [`0x${process.env.PRIVATE_KEY}`],
    },
  },
};
