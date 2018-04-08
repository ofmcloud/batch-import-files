package com.onfacemind.batchimportfiles.compare.beans;

public class BaseCompareResponse {

    private String msgType;

    private Integer state;

    public String getMsgType() {
        return msgType;
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}
