package org.japtos.init;

/**
 * @Author happyboy
 * @Description aptos client
 * @Date 2024/6/27 03:35
 **/
public class AptosClient {
    /**
     * aptos node url
     */
    private String aptosNodeUrl;

    public AptosClient(String aptosNodeUrl) {
        this.aptosNodeUrl = aptosNodeUrl;
    }

    public AptosClient createAptosClient(String aptosNodeUrl) {
        return new AptosClient(aptosNodeUrl);
    }

    public String getAptosNodeUrl() {
        return aptosNodeUrl;
    }

    public void setAptosNodeUrl(String aptosNodeUrl) {
        this.aptosNodeUrl = aptosNodeUrl;
    }
}
