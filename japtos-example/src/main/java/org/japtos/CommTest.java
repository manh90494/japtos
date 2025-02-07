package org.japtos;

import okhttp3.Response;
import org.japtos.enums.ModeEnum;
import org.japtos.rest.AptosRestApi;

/**
 * @Author happyboy
 * @Description comm test
 * @Date 2024/6/27 04:10
 **/
public class CommTest {
    public static void main(String[] args) {
        // test call rest api
        Response r1 = AptosRestApi.build(ModeEnum.DEV).spec();
        // test call rest api
        Response r2 = AptosRestApi.build(ModeEnum.DEV).estimateGasPrice();
        System.out.println(r2);
    }
}
