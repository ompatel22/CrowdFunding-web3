# Blockchain-based Crowdfunding Platform

## Table of Contents

- [Project Overview]
- [Technologies Used]
- [Features]
- [Installation]
- [Usage]
- [Smart Contract Design]
- [How Blockchain Enhances Crowdfunding]
- [Security Features]

---

## Project Overview

### What is Crowd Funding?

Crowd funding refers to the process of raising funds for a specific cause or project from a large number of people, typically via an online platform. These platforms allow individuals to contribute small amounts toward a common goal. However, most existing platforms are centralized, which can sometimes lead to issues with trust, transparency, and high fees.

### Introduction to the Project

This project uses blockchain technology to build a decentralized crowd funding platform. By leveraging Ethereum blockchain and smart contracts, we provide a more transparent, secure, and decentralized way to raise funds. The project allows campaign creators to post campaigns and receive donations in Ether (ETH) directly, while ensuring that all transactions are immutable and transparent.

## Problems with Current Crowdfunding Platforms

The major problems we wanted to solve with our platform are:

### 1. **Security**
As the funds become larger, they need to be heavily secured. Although stringent measures such as symmetric encryption are in place to make e-payments safe, they are still vulnerable to hacking. **Blockchain** — which has never been compromised yet — can provide that level of security. 

<!-- ![Blockchain Security](https://img.shields.io/badge/-Security-05122A?style=flat&logo=security) -->

### 2. **Transparency and Anti-Fraud**
We have seen, and continue to see, a lot of crowdfunding scams happening. There is no way to see where the funds are being used. We wanted to make the entire flow of funds transparent at every stage, so there is no possibility of the money being misused. 

<!-- ![Transparency](https://img.shields.io/badge/-Transparency-05122A?style=flat&logo=Transparency) -->

### 3. **Global Contribution**
Some platforms are country-specific, making it difficult for people from other countries to contribute to various campaigns. Using blockchain, anyone in the world can contribute to the campaign. Transactions are quick and convenient.

<!-- ![Global Contribution](https://img.shields.io/badge/-Global_Contribution-05122A?style=flat&logo=globe) -->

---

## Technologies Used

- **Frontend**: 
  - **React** for building the user interface.
  - **Vite** for faster, optimized development builds and integration with **Thirdweb** for blockchain interactions.
- **Blockchain**: Ethereum (Sapolia Testnet for testing).
- **Smart Contracts**: Written in **Solidity** to handle campaign creation, donations, and fund distribution.
- **Crypto**: **Ether (ETH)** as the native cryptocurrency for transactions.
- **Web3 Integration**: **Web3.js** is used to interact with Ethereum from the frontend.
- **Database**: **IPFS (InterPlanetary File System)** for storing campaign data and media files in a decentralized manner.
- **Deployment**: **Thirdweb** for deploying smart contracts and handling web3 integrations.

---

## Features

### 1. **Campaign Creation**
   - Users can create campaigns by specifying:
     - Title, description, funding goal, and deadline.
     - Media files (images/videos) uploaded via IPFS for decentralized storage.
   - Campaign details are stored and managed via smart contracts on the Ethereum blockchain, ensuring transparency and security.

### 2. **Donation System**
   - Users can donate **ETH** to support campaigns.
   - Donations are automatically recorded on the blockchain for traceability.
   - Contributors receive immediate confirmation of their donations through the frontend interface.

### 3. **Smart Contract Integration**
   - Smart contracts, written in **Solidity**, automatically manage funds:
     - Campaigns only receive funds if the goal is met by the deadline.
     - If the goal is not reached, donors can be refunded automatically.
   - The smart contract ensures that there is no possibility of misuse of funds.

### 4. **Transparency and Trust**
   - Every donation is recorded on the **Ethereum blockchain**.
   - Campaign progress, donations, and updates are available in real-time for all users.
   - Campaign details, including media files, are stored on **IPFS**, ensuring data integrity and transparency.

### 5. **Real-time Tracking**
   - The platform allows users to track the amount raised in real-time, with automatic updates.
   - Campaign owners can post updates to backers directly on the platform.

### 6. **Security Features**
   - The **Ethereum blockchain** ensures that all transactions are secure, transparent, and immutable.
   - Smart contracts control fund distribution automatically, reducing human errors or manipulation.

### 7. **Low Fees**
   - Using **Ethereum** ensures low fees, compared to traditional crowdfunding platforms.

---

## Installation

### Prerequisites

Before setting up the project, ensure the following are installed:

- **Metamask** (browser extension for interacting with Ethereum blockchain)
- **Thirdweb** (for deploying smart contracts and frontend integration)
- **npm** (Node Package Manager)
- **Vite** (for building the frontend)

### Setup Steps

1. Clone the repository:

  ```bash
  git clone https://github.com/yash-sojitra-20/CrowdFunding-web3.git
  cd CrowdFunding-web3
  ```

3. Install dependencies :

  ```bash
  cd client
  npm install
  ```

3. Start the Frontend

  ```bash
  npm run dev
  ```

4. Open your browser and go to http://localhost:3000 to interact with the platform.

---

## Usage

1. **Create a Campaign**:
   - After connecting your Ethereum wallet via **Metamask**, you can create a new crowdfunding campaign.
   - Provide the campaign title, description, funding goal, and campaign deadline.
   - Upload media (images, videos) to be stored on **IPFS**.

2. **Donate to a Campaign**:
   - Browse through active campaigns and contribute ETH to the campaigns you support.
   - Your donations are securely recorded on the Ethereum blockchain, providing full transparency.

3. **Track Campaign Progress**:
   - Campaign creators and contributors can view real-time updates about donations and the overall campaign status.

4. **Refunds and Fund Distribution**:
   - If the funding goal is not met, the smart contract automatically refunds contributors after the campaign deadline.
   - If the campaign is successful, funds are released to the campaign creator.

---

## How Blockchain Enhances Crowdfunding

Blockchain technology provides several significant advantages over traditional crowdfunding models:

1. **Decentralization**: The platform is fully decentralized, and there is no central authority controlling the funds.
2. **Transparency**: Every donation is publicly recorded on the Ethereum blockchain, making the platform fully transparent.
3. **Security**: Ethereum’s blockchain and cryptographic properties ensure that all funds are secure from manipulation or fraud.
4. **Immutability**: Once data is recorded on the blockchain, it is permanent and cannot be altered.
5. **Low Fees**: Blockchain transactions generally incur lower fees compared to traditional crowdfunding platforms.

---

## Contributing

We welcome contributions to this project! If you’d like to improve the code, please follow the steps below:

1. Fork the repository.
2. Create a new branch (`git checkout -b feature-name`).
3. Commit your changes (`git commit -am 'Add new feature'`).
4. Push your changes to the branch (`git push origin feature-name`).
5. Create a pull request.

---
