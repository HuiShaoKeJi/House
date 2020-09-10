package com.github.houes.pojo;

public class SysUser {

    private int UID;
    private String uName;
    private String uPassWord;

    public int getUID() {
        return UID;
    }

    public void setUID(int UID) {
        this.UID = UID;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuPassWord() {
        return uPassWord;
    }

    public void setuPassWord(String uPassWord) {
        this.uPassWord = uPassWord;
    }

    public SysUser() {
    }

    public SysUser(int UID, String uName, String uPassWord) {
        this.UID = UID;
        this.uName = uName;
        this.uPassWord = uPassWord;
    }
}
