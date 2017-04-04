package com.swpuiot.qingyou.data;

import com.swpuiot.qingyou.R;
import com.swpuiot.qingyou.entities.GoodsEntity;

import java.util.List;

/**
 * Created by 羊荣毅_L on 2017/4/4.
 */
public class EntityList {
    public static void getGoodsEntityList(List<GoodsEntity> goodsEntities){
        if (goodsEntities.size()==0){
            for (int i = 0; i < 10; i++) {
                goodsEntities.add(new GoodsEntity(R.drawable.ic_abc_image_phone,
                        "【六月碎屏保】荣耀 畅玩6X 4GB 32GB 全网通4G手机 高配版 铂光",
                        "¥1399.00","16666天评论,1444条好评"));
            }
        }
    }
    public static void getImages(List<Integer> imageList){
        if (imageList.size()==0){
           imageList.add(R.drawable.ic_abc_image_turn1);
           imageList.add(R.drawable.ic_abc_image_turn2);
           imageList.add(R.drawable.ic_abc_image_turn4);
           imageList.add(R.drawable.ic_abc_image_turn6);
           imageList.add(R.drawable.ic_abc_image_turn7);
           imageList.add(R.drawable.ic_abc_image_turn8);
           imageList.add(R.drawable.ic_abc_image_turn9);
           imageList.add(R.drawable.ic_abc_image_turn10);
           imageList.add(R.drawable.ic_abc_image_turn11);
        }
    }
}
