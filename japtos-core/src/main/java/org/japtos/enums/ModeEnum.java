package org.japtos.enums;

import org.japtos.config.CommonConstants;

/**
 * @Author happyboy
 * @Description client working mode enum
 * @Date 2024/7/8 09:23
 **/
public enum ModeEnum {
    DEV(0, "dev network", CommonConstants.APTOS_DEVELOP_NETWORK_URL),
    TEST(1, "test network", CommonConstants.APTOS_TEST_NETWORK_URL),
    MAIN(2, "main network", CommonConstants.APTOS_MAIN_NETWORK_URL);
    private Integer code;
    private String description;
    private String url;

    ModeEnum(Integer code, String description, String url) {
        this.code = code;
        this.description = description;
        this.url = url;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "ModeEnum{" +
                "code=" + code +
                ", description='" + description + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
