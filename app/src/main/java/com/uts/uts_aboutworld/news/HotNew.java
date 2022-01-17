package com.uts.uts_aboutworld.news;

import java.io.Serializable;

public class HotNew implements Serializable {
    private String berita;
    private String topic;
    private String asal;
    private String deskripsi;
    private int drawableRes;

    public HotNew(String berita, String topic, String asal, String deskripsi, int drawableRes) {
        this.berita = berita;
        this.topic = topic;
        this.asal = asal;
        this.deskripsi = deskripsi;
        this.drawableRes = drawableRes;
    }

    public String getBerita() {
        return berita;
    }

    public void setBerita(String berita) {
        this.berita = berita;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String tpic) { this.topic = topic; }

    public String getAsal() {
        return asal;
    }

    public void setAsal(String asal) {
        this.asal = asal;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getDrawableRes() {
        return drawableRes;
    }

    public void setDrawableRes(int drawableRes) {
        this.drawableRes = drawableRes;
    }

}
