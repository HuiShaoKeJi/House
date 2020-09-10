package com.github.houes.pojo;

public class HosType {
    private int hTID;
    private String hTName;

    public HosType() {
    }

    public HosType(int hTID, String hTName) {
        this.hTID = hTID;
        this.hTName = hTName;
    }

    public int gethTID() {
        return hTID;
    }

    public void sethTID(int hTID) {
        this.hTID = hTID;
    }

    public String gethTName() {
        return hTName;
    }

    public void sethTName(String hTName) {
        this.hTName = hTName;
    }
}
