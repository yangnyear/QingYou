package com.swpuiot.qingyou.entities;

/**
 * Created by 羊荣毅_L on 2017/4/7.
 */
public class SchoolLifeEntity {
    private String name;
    private String pression;
    private String star;
    private String love;
    private String motto;
    private int logoId;

    public SchoolLifeEntity(String name, String pression, String star, String love, String motto, int logoId) {
        this.name = name;
        this.pression = pression;
        this.star = star;
        this.love = love;
        this.motto = motto;
        this.logoId = logoId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPression() {
        return pression;
    }

    public void setPression(String pression) {
        this.pression = pression;
    }

    public String getStar() {
        return star;
    }

    public void setStar(String star) {
        this.star = star;
    }

    public String getLove() {
        return love;
    }

    public void setLove(String love) {
        this.love = love;
    }

    public String getMotto() {
        return motto;
    }

    public void setMotto(String motto) {
        this.motto = motto;
    }

    public int getLogoId() {
        return logoId;
    }

    public void setLogoId(int logoId) {
        this.logoId = logoId;
    }
}
