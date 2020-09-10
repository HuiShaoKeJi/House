package com.github.houes.pojo;

public class HosDistrict {
    private int DID;
    private String dName;

    public int getDID() {
        return DID;
    }

    public void setDID(int DID) {
        this.DID = DID;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public HosDistrict(int DID, String dName) {
        this.DID = DID;
        this.dName = dName;
    }

    public HosDistrict() {
    }
}
