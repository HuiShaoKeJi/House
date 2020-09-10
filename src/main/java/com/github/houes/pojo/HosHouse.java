package com.github.houes.pojo;

public class HosHouse {
    private int hMID;
    private int UID;
    private int SID;
    private int hTID;
    private String price;
    private String topic;
    private String contents;
    private String hTime;
    private String copy;

    public int gethMID() {
        return hMID;
    }

    public void sethMID(int hMID) {
        this.hMID = hMID;
    }

    public int getUID() {
        return UID;
    }

    public void setUID(int UID) {
        this.UID = UID;
    }

    public int getSID() {
        return SID;
    }

    public void setSID(int SID) {
        this.SID = SID;
    }

    public int gethTID() {
        return hTID;
    }

    public void sethTID(int hTID) {
        this.hTID = hTID;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String gethTime() {
        return hTime;
    }

    public void sethTime(String hTime) {
        this.hTime = hTime;
    }

    public String getCopy() {
        return copy;
    }

    public void setCopy(String copy) {
        this.copy = copy;
    }

    public HosHouse(int hMID, int UID, int SID, int hTID, String price, String topic, String contents, String hTime, String copy) {
        this.hMID = hMID;
        this.UID = UID;
        this.SID = SID;
        this.hTID = hTID;
        this.price = price;
        this.topic = topic;
        this.contents = contents;
        this.hTime = hTime;
        this.copy = copy;
    }

    public HosHouse() {
    }
}
