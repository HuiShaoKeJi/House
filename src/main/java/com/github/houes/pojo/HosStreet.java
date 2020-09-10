package com.github.houes.pojo;

public class HosStreet {
    private int SID;
    private String sName;
    private String sDID;

    public int getSID() {
        return SID;
    }

    public void setSID(int SID) {
        this.SID = SID;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsDID() {
        return sDID;
    }

    public void setsDID(String sDID) {
        this.sDID = sDID;
    }

    public HosStreet(int SID, String sName, String sDID) {
        this.SID = SID;
        this.sName = sName;
        this.sDID = sDID;
    }

    public HosStreet() {
    }
}
