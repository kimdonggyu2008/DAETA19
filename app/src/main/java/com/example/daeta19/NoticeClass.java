package com.example.daeta19;

public class NoticeClass {
    private String notice;
    private String date;

    public NoticeClass(String notice, String date) {
        this.notice = notice;
        this.date = date;
    }

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
