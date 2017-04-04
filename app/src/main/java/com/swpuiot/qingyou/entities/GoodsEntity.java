package com.swpuiot.qingyou.entities;

/**
 * Created by 羊荣毅_L on 2017/4/3.
 * Entity of HomePage RecyclerView
 */
public class GoodsEntity {
    private  int goodsImageId;
    private String goodsName;
    private String goodsWorth;
    private String goodsInformation;

    public GoodsEntity(int goodsImageId, String goodsName, String goodsWorth, String goodsInformation) {
        this.goodsImageId = goodsImageId;
        this.goodsName = goodsName;
        this.goodsWorth = goodsWorth;
        this.goodsInformation = goodsInformation;
    }

    public int getGoodsImageId() {
        return goodsImageId;
    }

    public void setGoodsImageId(int goodsImageId) {
        this.goodsImageId = goodsImageId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsWorth() {
        return goodsWorth;
    }

    public void setGoodsWorth(String goodsWorth) {
        this.goodsWorth = goodsWorth;
    }

    public String getGoodsInformation() {
        return goodsInformation;
    }

    public void setGoodsInformation(String goodsInformation) {
        this.goodsInformation = goodsInformation;
    }
}
