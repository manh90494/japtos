package org.japtos.wallet;

import org.japtos.init.AptosClient;

/**
 * @Author happyboy
 * @Description aptos wallet
 * @Date 2024/6/27 03:40
 **/
public class AptosWallet {
    /**
     * aptos client
     */
    private AptosClient aptosClient;

    /**
     * wallet private key
     */
    private String walletPrivateKey;

    public AptosWallet(AptosClient aptosClient, String walletPrivateKey) {
        this.aptosClient = aptosClient;
        this.walletPrivateKey = walletPrivateKey;
    }

    public static AptosWallet createAptosWallet(AptosClient aptosClient, String walletPrivateKey) {
        return new AptosWallet(aptosClient, walletPrivateKey);
    }

    /**
     * create a new wallet
     */
    public AptosWallet createNewWallet() {
        //TODO
        return null;
    }

    public AptosClient getAptosClient() {
        return aptosClient;
    }

    public void setAptosClient(AptosClient aptosClient) {
        this.aptosClient = aptosClient;
    }
}
