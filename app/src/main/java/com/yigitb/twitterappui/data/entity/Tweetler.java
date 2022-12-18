package com.yigitb.twitterappui.data.entity;

import java.io.Serializable;

public class Tweetler implements Serializable {

    private String foto_ad;
    private String kisi_ad;
    private String kisi_nick;
    private String tweet;
    private String zaman;

    public Tweetler() {
    }

    public Tweetler(String foto_ad, String kisi_ad, String kisi_nick, String tweet, String zaman) {
        this.foto_ad = foto_ad;
        this.kisi_ad = kisi_ad;
        this.kisi_nick = kisi_nick;
        this.tweet = tweet;
        this.zaman = zaman;
    }

    public String getFoto_ad() {
        return foto_ad;
    }

    public void setFoto_ad(String foto_ad) {
        this.foto_ad = foto_ad;
    }

    public String getKisi_ad() {
        return kisi_ad;
    }

    public void setKisi_ad(String kisi_ad) {
        this.kisi_ad = kisi_ad;
    }

    public String getKisi_nick() {
        return kisi_nick;
    }

    public void setKisi_nick(String kisi_nick) {
        this.kisi_nick = kisi_nick;
    }

    public String getTweet() {
        return tweet;
    }

    public void setTweet(String tweet) {
        this.tweet = tweet;
    }

    public String getZaman() {
        return zaman;
    }

    public void setZaman(String zaman) {
        this.zaman = zaman;
    }
}

