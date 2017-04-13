package com.swpuiot.qingyou.entities;

/**
 * Created by 羊荣毅_L on 2017/4/11.
 */
public class NewsEntity {
    private String newsContent;
    private String newsInfo;
    private String newsTime;
    private int newsImageId;

    public NewsEntity(String newsContent, String newsInfo, String newsTime, int newsImageId) {
        this.newsContent = newsContent;
        this.newsInfo = newsInfo;
        this.newsTime = newsTime;
        this.newsImageId = newsImageId;
    }

    public String getNewsContent() {
        return newsContent;
    }

    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent;
    }

    public String getNewsInfo() {
        return newsInfo;
    }

    public void setNewsInfo(String newsInfo) {
        this.newsInfo = newsInfo;
    }

    public String getNewsTime() {
        return newsTime;
    }

    public void setNewsTime(String newsTime) {
        this.newsTime = newsTime;
    }

    public int getNewsImageId() {
        return newsImageId;
    }

    public void setNewsImageId(int newsImageId) {
        this.newsImageId = newsImageId;
    }
}
