package com.swpuiot.qingyou.data;

import com.swpuiot.qingyou.R;
import com.swpuiot.qingyou.entities.GoodsEntity;
import com.swpuiot.qingyou.entities.GoodsHeadEntity;
import com.swpuiot.qingyou.entities.NewsEntity;
import com.swpuiot.qingyou.entities.SchoolLifeEntity;

import java.util.List;

/**
 * Created by 羊荣毅_L on 2017/4/4.
 */
public class EntityList {
    private static volatile EntityList sEntityList;

    private EntityList() {
    }

    public static EntityList getEntityList() {
        if (sEntityList == null) {
            synchronized (EntityList.class) {
                if (sEntityList == null) {
                    sEntityList = new EntityList();
                }
            }
        }
        return sEntityList;
    }

    public void getGoodsEntityList(List<GoodsEntity> goodsEntities) {
        if (goodsEntities.size() == 0) {
            for (int i = 0; i < 10; i++) {
                goodsEntities.add(new GoodsEntity(R.drawable.ic_abc_image_time,
                        "【六月碎屏保】荣耀 畅玩6X 4GB 32GB 全网通4G手机 高配版 铂光",
                        "¥1399.00", "16666天评论,1444条好评"));
            }
        }
    }

    public void getNews(List<NewsEntity> newsEntities) {
        if (newsEntities.size() == 0) {
            newsEntities.add(new NewsEntity("美军兵临城下 朝鲜紧急向这里求助但非中国", "16666次浏览,1444条评论", "今天11.00", R.drawable.ic_image_junjian));
            newsEntities.add(new NewsEntity("第五届中国电子信息博览会: 我国人工智能技术走在世界前列", "16666次浏览,1444条评论", "今天11.00", R.drawable.ic_image_jiqiren));
            newsEntities.add(new NewsEntity("【媒体石大】教育导报大篇幅报道我校思政教育改革", "16666次浏览,1444条评论", "今天11.00", R.drawable.ic_image_zhuanjia));
            newsEntities.add(new NewsEntity("冬去春来,西柚角落桃李芳芳", "16666次浏览,1444条评论", "今天11.00", R.drawable.ic_image_taohua));
            newsEntities.add(new NewsEntity("【媒体石大】西柚学子全面发展素质皎月,音乐节闪亮登场", "16666次浏览,1444条评论", "今天11.00", R.drawable.ic_image_musicboy));
        }
    }

    public void getImages(List<Integer> imageList) {
        if (imageList.size() == 0) {
            imageList.add(R.drawable.ic_image_homepage1);
            imageList.add(R.drawable.ic_image_homepage2);
            imageList.add(R.drawable.ic_image_homepage3);
        }
    }

    public void getSchoolEntityList(List<SchoolLifeEntity> schoolLifeEntities) {
        if (schoolLifeEntities.size() == 0) {
            schoolLifeEntities.add(new SchoolLifeEntity("佐良娜", "幻术", "保密", "写轮眼", "我多想拥抱你,可惜时光之里三南水北,可惜你我之间人海如潮:", R.drawable.ic_abc_image_dslogo));
            schoolLifeEntities.add(new SchoolLifeEntity("佐良娜", "幻术", "保密", "写轮眼", "我多想拥抱你,可惜时光之里三南水北,可惜你我之间人海如潮:", R.drawable.ic_abc_image_dslogo));
            schoolLifeEntities.add(new SchoolLifeEntity("佐良娜", "幻术", "保密", "写轮眼", "我多想拥抱你,可惜时光之里三南水北,可惜你我之间人海如潮:", R.drawable.ic_abc_image_dslogo));
            schoolLifeEntities.add(new SchoolLifeEntity("佐良娜", "幻术", "保密", "写轮眼", "我多想拥抱你,可惜时光之里三南水北,可惜你我之间人海如潮:", R.drawable.ic_abc_image_dslogo));
            schoolLifeEntities.add(new SchoolLifeEntity("佐良娜", "幻术", "保密", "写轮眼", "我多想拥抱你,可惜时光之里三南水北,可惜你我之间人海如潮:", R.drawable.ic_abc_image_dslogo));
            schoolLifeEntities.add(new SchoolLifeEntity("佐良娜", "幻术", "保密", "写轮眼", "我多想拥抱你,可惜时光之里三南水北,可惜你我之间人海如潮:", R.drawable.ic_abc_image_dslogo));
            schoolLifeEntities.add(new SchoolLifeEntity("佐良娜", "幻术", "保密", "写轮眼", "我多想拥抱你,可惜时光之里三南水北,可惜你我之间人海如潮:", R.drawable.ic_abc_image_dslogo));
            schoolLifeEntities.add(new SchoolLifeEntity("佐良娜", "幻术", "保密", "写轮眼", "我多想拥抱你,可惜时光之里三南水北,可惜你我之间人海如潮:", R.drawable.ic_abc_image_dslogo));
            schoolLifeEntities.add(new SchoolLifeEntity("佐良娜", "幻术", "保密", "写轮眼", "我多想拥抱你,可惜时光之里三南水北,可惜你我之间人海如潮:", R.drawable.ic_abc_image_dslogo));
            schoolLifeEntities.add(new SchoolLifeEntity("佐良娜", "幻术", "保密", "写轮眼", "我多想拥抱你,可惜时光之里三南水北,可惜你我之间人海如潮:", R.drawable.ic_abc_image_dslogo));

        }
    }

    public void getGoodsHeadList(List<GoodsHeadEntity> goodsHeadList) {
        if (goodsHeadList.size() == 0)
            for (int i = 0; i < 10; i++) {
                goodsHeadList.add(new GoodsHeadEntity(R.drawable.ic_image_my_logo, "今天7.00", "得成比目何辞死,愿作鸳鸯不羡仙", R.drawable.ic_image_taohua));
            }
    }
}
