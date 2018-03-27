package com.yh.client.constant;

/**
 * Created by yaohao on 2018/3/27.
 */
public enum NodeMode {

    EPHEMERAL("EPHEMERAL", Constants.ROOT_PATH_EPHEMERAL),
    PERSISTENT("PERSISTENT", Constants.ROOT_PATH_PERSISTENT);

    private String symbol;

    private String label;

    private NodeMode(String symbol, String label) {
        this.symbol = symbol;
        this.label = label;
    }

    public String symbol() {
        return this.symbol;
    }

    public String label() {
        return this.label;
    }

}
