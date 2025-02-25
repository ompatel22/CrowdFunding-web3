import React from "react";
import { createRoot } from "react-dom/client";
import { BrowserRouter as Router } from 'react-router-dom';
import App from "./App";

import {StateContextProvider} from './context';
import { Sepolia } from "@thirdweb-dev/chains";
import { ThirdwebProvider } from "@thirdweb-dev/react";
// import "./styles/globals.css";

// This is the chain your dApp will work on.
// Change this to the chain your app is built for.
// You can also import additional chains from `@thirdweb-dev/chains` and pass them directly.
import './index.css';

const container = document.getElementById("root");
const root = createRoot(container);
root.render(
  <React.StrictMode>
    <ThirdwebProvider
      clientId='d54aa09b4052abe1db0ecdcaede65096'
      activeChain={Sepolia}
    >
      <Router>
        <StateContextProvider>
      <App />
      </StateContextProvider>
      </Router>
    </ThirdwebProvider>
  </React.StrictMode>
);
