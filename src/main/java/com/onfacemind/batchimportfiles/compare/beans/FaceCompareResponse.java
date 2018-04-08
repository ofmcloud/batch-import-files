package com.onfacemind.batchimportfiles.compare.beans;

public class FaceCompareResponse extends BaseCompareResponse {
    private FaceCompareData data;

    public FaceCompareData getData() {
        return data;
    }

    public void setData(FaceCompareData data) {
        this.data = data;
    }
}
