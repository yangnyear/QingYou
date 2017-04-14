package com.swpuiot.qingyou.entities;

/**
 * Created by 羊荣毅_L on 2017/4/14.
 */
public class GoodsHeadEntity {
    private int headLogoId;
    private String headTime;
    private String headContent;
    private int headImageId;

    public GoodsHeadEntity(int headLogoId, String headTime, String headContent, int headImageId) {
        this.headLogoId = headLogoId;
        this.headTime = headTime;
        this.headContent = headContent;
        this.headImageId = headImageId;
    }

    public int getHeadLogoId() {
        return headLogoId;
    }

    public void setHeadLogoId(int headLogoId) {
        this.headLogoId = headLogoId;
    }

    public String getHeadTime() {
        return headTime;
    }

    public void setHeadTime(String headTime) {
        this.headTime = headTime;
    }

    public String getHeadContent() {
        return headContent;
    }

    public void setHeadContent(String headContent) {
        this.headContent = headContent;
    }

    public int getHeadImageId() {
        return headImageId;
    }

    public void setHeadImageId(int headImageId) {
        this.headImageId = headImageId;
    }
}
