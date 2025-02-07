package org.japtos.rest;

import okhttp3.Request;
import okhttp3.Response;
import org.japtos.enums.ModeEnum;
import org.japtos.utils.HttpUtil;

/**
 * @Author happyboy
 * @Description aptos rest api
 * @Date 2024/7/8 09:17
 **/
public class AptosRestApi {
    private ModeEnum mode;

    public AptosRestApi(ModeEnum mode) {
        this.mode = mode;
    }

    public static AptosRestApi build(ModeEnum mode) {
        return new AptosRestApi(mode);
    }

    public ModeEnum getMode() {
        return mode;
    }

    public void setMode(ModeEnum mode) {
        this.mode = mode;
    }

    /**
     * spec
     */
    public Response spec() {
        String url = this.mode.getUrl() + "/spec";
        return HttpUtil.get(url, null);
    }

    /**
     * healthy
     */
    public Response healthy() {
        String url = this.mode.getUrl() + "/healthy";
        return HttpUtil.get(url, null);
    }

    /**
     * estimate gas price
     */
    public Response estimateGasPrice() {
        String url = this.mode.getUrl() + "/estimate_gas_price";
        return HttpUtil.get(url, null);
    }
}
