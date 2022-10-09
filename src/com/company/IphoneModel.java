package com.company;

public enum IphoneModel {
    IPHONE_7_PLUS("Iphone 7+"),
    IPHONE_7("Iphone 7"),
    IPHONE_X("Iphone X");

    private String modelSTR;

    IphoneModel(String model) {
        this.modelSTR = model;
    }

    public String getModelSTR() {
        return modelSTR;
    }
}
