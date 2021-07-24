package com.saurabh.pussgrc.ui.notice;

public class NoticeData {
    String title, image, data, time, key;

    public NoticeData(){

    }

    public NoticeData(String title, String image, String data, String time, String key) {
        this.title = title;
        this.image = image;
        this.data = data;
        this.time = time;
        this.key = key;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
