package com.qizhu.qizhugoshshopping.bean;

import java.util.List;

/**
 * Created by Long° Engagement on 2017/10/17.
 */

public class SuperClass {

    private int code;
    private String msg;
    private DataBean data;

    public void setCode(int code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public DataBean getData() {
        return data;
    }

    public static class DataBean {
        private ActivityInfoBean activityInfo;
        private boolean creditRecived;
        private GoodsSpreeActivityBean goodsSpreeActivity;
        private List<SubjectsBean> subjects;
        private List<Ad1Bean> ad1;
        private List<Ad5Bean> ad5;
        private List<Ad8Bean> ad8;
        private List<DefaultGoodsListBean> defaultGoodsList;

        public void setActivityInfo(ActivityInfoBean activityInfo) {
            this.activityInfo = activityInfo;
        }

        public void setCreditRecived(boolean creditRecived) {
            this.creditRecived = creditRecived;
        }

        public void setGoodsSpreeActivity(GoodsSpreeActivityBean goodsSpreeActivity) {
            this.goodsSpreeActivity = goodsSpreeActivity;
        }

        public void setSubjects(List<SubjectsBean> subjects) {
            this.subjects = subjects;
        }

        public void setAd1(List<Ad1Bean> ad1) {
            this.ad1 = ad1;
        }

        public void setAd5(List<Ad5Bean> ad5) {
            this.ad5 = ad5;
        }

        public void setAd8(List<Ad8Bean> ad8) {
            this.ad8 = ad8;
        }

        public void setDefaultGoodsList(List<DefaultGoodsListBean> defaultGoodsList) {
            this.defaultGoodsList = defaultGoodsList;
        }

        public ActivityInfoBean getActivityInfo() {
            return activityInfo;
        }

        public boolean getCreditRecived() {
            return creditRecived;
        }

        public GoodsSpreeActivityBean getGoodsSpreeActivity() {
            return goodsSpreeActivity;
        }

        public List<SubjectsBean> getSubjects() {
            return subjects;
        }

        public List<Ad1Bean> getAd1() {
            return ad1;
        }

        public List<Ad5Bean> getAd5() {
            return ad5;
        }

        public List<Ad8Bean> getAd8() {
            return ad8;
        }

        public List<DefaultGoodsListBean> getDefaultGoodsList() {
            return defaultGoodsList;
        }

        public static class ActivityInfoBean {


            private String activityAreaDisplay;
            private List<ActivityInfoListBean> activityInfoList;

            public void setActivityAreaDisplay(String activityAreaDisplay) {
                this.activityAreaDisplay = activityAreaDisplay;
            }

            public void setActivityInfoList(List<ActivityInfoListBean> activityInfoList) {
                this.activityInfoList = activityInfoList;
            }

            public String getActivityAreaDisplay() {
                return activityAreaDisplay;
            }

            public List<ActivityInfoListBean> getActivityInfoList() {
                return activityInfoList;
            }

            public static class ActivityInfoListBean {
                /**
                 * id : 60
                 * activityImg : https://image.yunifang.com/yunifang/images/goods/temp/170527155491221343694704636.jpg
                 * activityType : 60
                 * activityData : 69
                 * activityDataDetail : 69
                 * activityAreaDisplay : 1
                 * countDownEnable : 0
                 * remark : 搭配购买立减
                 * sort : 0
                 */

                private String id;
                private String activityImg;
                private String activityType;
                private String activityData;
                private String activityDataDetail;
                private String activityAreaDisplay;
                private String countDownEnable;
                private String remark;
                private int sort;

                public void setId(String id) {
                    this.id = id;
                }

                public void setActivityImg(String activityImg) {
                    this.activityImg = activityImg;
                }

                public void setActivityType(String activityType) {
                    this.activityType = activityType;
                }

                public void setActivityData(String activityData) {
                    this.activityData = activityData;
                }

                public void setActivityDataDetail(String activityDataDetail) {
                    this.activityDataDetail = activityDataDetail;
                }

                public void setActivityAreaDisplay(String activityAreaDisplay) {
                    this.activityAreaDisplay = activityAreaDisplay;
                }

                public void setCountDownEnable(String countDownEnable) {
                    this.countDownEnable = countDownEnable;
                }

                public void setRemark(String remark) {
                    this.remark = remark;
                }

                public void setSort(int sort) {
                    this.sort = sort;
                }

                public String getId() {
                    return id;
                }

                public String getActivityImg() {
                    return activityImg;
                }

                public String getActivityType() {
                    return activityType;
                }

                public String getActivityData() {
                    return activityData;
                }

                public String getActivityDataDetail() {
                    return activityDataDetail;
                }

                public String getActivityAreaDisplay() {
                    return activityAreaDisplay;
                }

                public String getCountDownEnable() {
                    return countDownEnable;
                }

                public String getRemark() {
                    return remark;
                }

                public int getSort() {
                    return sort;
                }
            }
        }

        public static class GoodsSpreeActivityBean {
            /**
             * id : 327
             * name : 10.13早场
             * startDate : 2017.10.13 10:00:00
             * endDate : 2017.10.13 16:00:00
             * status : 1
             * startSeconds : -12118
             * endSeconds : 9481
             * isChecked : 0
             * goodsList : [{"id":"997","goodsSpreeId":"327","goodsId":"340","goodsName":"【使用期一年以上介意慎拍】黑玫瑰矿物柔肤乳液120ml","goodsImg":"https://image.yunifang.com/yunifang/images/goods/340/goods_img/170626103460417447209262417.jpg","marketPrice":169,"activityPrice":39.9,"salesRatio":0,"stockNumber":30,"releaseNumber":40},{"id":"998","goodsSpreeId":"327","goodsId":"1324","goodsName":"鲜气少女肌|水光轻灵焕彩面膜5片","goodsImg":"https://image.yunifang.com/yunifang/images/goods/1324/goods_img/170626102366110382576889824.jpg","marketPrice":129,"activityPrice":59.9,"salesRatio":0,"stockNumber":30,"releaseNumber":30},{"id":"999","goodsSpreeId":"327","goodsId":"903","goodsName":"绿豆原浆泥面膜100g","goodsImg":"https://image.yunifang.com/yunifang/images/goods/903/goods_img/170627180542017051678666200.jpg","marketPrice":99,"activityPrice":49.9,"salesRatio":0,"stockNumber":28,"releaseNumber":30}]
             */

            private String id;
            private String name;
            private String startDate;
            private String endDate;
            private String status;
            private String startSeconds;
            private String endSeconds;
            private String isChecked;
            private List<GoodsListBean> goodsList;

            public void setId(String id) {
                this.id = id;
            }

            public void setName(String name) {
                this.name = name;
            }

            public void setStartDate(String startDate) {
                this.startDate = startDate;
            }

            public void setEndDate(String endDate) {
                this.endDate = endDate;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public void setStartSeconds(String startSeconds) {
                this.startSeconds = startSeconds;
            }

            public void setEndSeconds(String endSeconds) {
                this.endSeconds = endSeconds;
            }

            public void setIsChecked(String isChecked) {
                this.isChecked = isChecked;
            }

            public void setGoodsList(List<GoodsListBean> goodsList) {
                this.goodsList = goodsList;
            }

            public String getId() {
                return id;
            }

            public String getName() {
                return name;
            }

            public String getStartDate() {
                return startDate;
            }

            public String getEndDate() {
                return endDate;
            }

            public String getStatus() {
                return status;
            }

            public String getStartSeconds() {
                return startSeconds;
            }

            public String getEndSeconds() {
                return endSeconds;
            }

            public String getIsChecked() {
                return isChecked;
            }

            public List<GoodsListBean> getGoodsList() {
                return goodsList;
            }

            public static class GoodsListBean {
                /**
                 * id : 997
                 * goodsSpreeId : 327
                 * goodsId : 340
                 * goodsName : 【使用期一年以上介意慎拍】黑玫瑰矿物柔肤乳液120ml
                 * goodsImg : https://image.yunifang.com/yunifang/images/goods/340/goods_img/170626103460417447209262417.jpg
                 * marketPrice : 169.0
                 * activityPrice : 39.9
                 * salesRatio : 0
                 * stockNumber : 30
                 * releaseNumber : 40
                 */

                private String id;
                private String goodsSpreeId;
                private String goodsId;
                private String goodsName;
                private String goodsImg;
                private double marketPrice;
                private double activityPrice;
                private int salesRatio;
                private int stockNumber;
                private int releaseNumber;

                public void setId(String id) {
                    this.id = id;
                }

                public void setGoodsSpreeId(String goodsSpreeId) {
                    this.goodsSpreeId = goodsSpreeId;
                }

                public void setGoodsId(String goodsId) {
                    this.goodsId = goodsId;
                }

                public void setGoodsName(String goodsName) {
                    this.goodsName = goodsName;
                }

                public void setGoodsImg(String goodsImg) {
                    this.goodsImg = goodsImg;
                }

                public void setMarketPrice(double marketPrice) {
                    this.marketPrice = marketPrice;
                }

                public void setActivityPrice(double activityPrice) {
                    this.activityPrice = activityPrice;
                }

                public void setSalesRatio(int salesRatio) {
                    this.salesRatio = salesRatio;
                }

                public void setStockNumber(int stockNumber) {
                    this.stockNumber = stockNumber;
                }

                public void setReleaseNumber(int releaseNumber) {
                    this.releaseNumber = releaseNumber;
                }

                public String getId() {
                    return id;
                }

                public String getGoodsSpreeId() {
                    return goodsSpreeId;
                }

                public String getGoodsId() {
                    return goodsId;
                }

                public String getGoodsName() {
                    return goodsName;
                }

                public String getGoodsImg() {
                    return goodsImg;
                }

                public double getMarketPrice() {
                    return marketPrice;
                }

                public double getActivityPrice() {
                    return activityPrice;
                }

                public int getSalesRatio() {
                    return salesRatio;
                }

                public int getStockNumber() {
                    return stockNumber;
                }

                public int getReleaseNumber() {
                    return releaseNumber;
                }
            }
        }

        public static class SubjectsBean {
            /**
             * id : 84
             * title : 新品上市
             * detail : 质本天然，探寻自然生命的非凡能量，给“躁动”的肌肤一场新的旅行~~
             * image : https://image.yunifang.com/yunifang/images/goods/temp/171011162655217457875119759.jpg
             * start_time : 2017.05.16 09:26:13
             * end_time : 2017.10.31 00:00:00
             * show_number : 6
             * state : 1
             * sort : 0
             * descImage : https://image.yunifang.com/yunifang/images/goods/temp/17051609265319705925918251.jpg
             * template : templateDefault
             * goodsList : [{"id":"492","goods_name":"盈透美肌黑膜套装（插画版）","shop_price":99.9,"market_price":298,"goods_img":"https://image.yunifang.com/yunifang/images/goods/492/goods_img/171011191068814258195256706.jpg","reservable":false,"efficacy":"以黑吸黑 润透亮颜","stock_number":0,"restrict_purchase_num":0,"goodsName":"PG one热荐：★★★★★","goodsImage":"https://image.yunifang.com/yunifang/images/goods/temp/171011192212214258195254179.jpg","description":"三重植物精粹，三重水润膜力，美时美刻，水润透亮~"},{"id":"2076","goods_name":"鲜嫩美莓面膜套装","shop_price":129.9,"market_price":299,"goods_img":"https://image.yunifang.com/yunifang/images/goods/2076/goods_img/170930212555714134276722977.jpg","reservable":false,"efficacy":"果然水润 嫩颜美莓","stock_number":0,"restrict_purchase_num":0,"goodsName":"水润指数：★★★★☆","goodsImage":"https://image.yunifang.com/yunifang/images/goods/temp/17101119283583452898243380.jpg","description":"畅享鲜果派对，肌肤水嫩鲜活，萃取自然野草莓、黑莓、巴西莓精华，三款搭配持续水嫩鲜活~"},{"id":"1189","goods_name":"清透盈润面膜套装21片","shop_price":79.9,"market_price":297,"goods_img":"https://image.yunifang.com/yunifang/images/goods/1189/goods_img/17093019432252555150652465.jpg","reservable":false,"efficacy":"水感剔透 鲜颜嫩肌","stock_number":0,"restrict_purchase_num":0,"goodsName":"鲜嫩指数：★★★★☆","goodsImage":"https://image.yunifang.com/yunifang/images/goods/temp/17101119312216937168845205.jpg","description":"精选玫瑰、竹萃自然精粹，清洁力、补水力、亮泽度全新升级，另肌肤水感剔透~"},{"id":"1638","goods_name":"全新升级丨嫩肌酵素黑膜礼盒21片","shop_price":139.9,"market_price":299,"goods_img":"https://image.yunifang.com/yunifang/images/goods/1638/goods_img/170905151496114997886544712.jpg","reservable":false,"efficacy":"极地酵素 \u201c酵\u201d醒美肌","stock_number":0,"restrict_purchase_num":0,"goodsName":"推荐指数：★★★☆☆","goodsImage":"https://image.yunifang.com/yunifang/images/goods/temp/170905182614314997886548523.jpg","description":"蕴含南极活性补水酵素精华，持久补水锁水，轻蔬鲜果酵素助力平衡水油~"},{"id":"1830","goods_name":"新品尝鲜|水润茶萃微囊黑面膜20片","shop_price":129.9,"market_price":297,"goods_img":"https://image.yunifang.com/yunifang/images/goods/1830/goods_img/17063017284962337647468682.jpg","reservable":false,"efficacy":"只要一片 水润一天","stock_number":0,"restrict_purchase_num":0,"goodsName":"新品推荐：★★★★★","goodsImage":"https://image.yunifang.com/yunifang/images/goods/temp/1705240026717476518778188.jpg","description":"茶萃微囊精华，开创持续保湿新体验，只要一片，水润一天，持续保湿12小时以上"},{"id":"2091","goods_name":"新品上市丨V7伪妆素颜霜20g","shop_price":79,"market_price":79,"goods_img":"https://image.yunifang.com/yunifang/images/goods/2091/goods_img/170905172822119555059792173.jpg","reservable":false,"efficacy":"即刻提亮 闪亮肤色","stock_number":0,"restrict_purchase_num":0,"goodsName":"遮瑕指数：★★★★☆","goodsImage":"https://image.yunifang.com/yunifang/images/goods/temp/1709051825818467283561992.jpg","description":"如果你是素颜控，这款即刻提亮，闪亮肤色的懒人新品素颜霜你值得拥有~"},{"id":"2039","goods_name":"水润柔嫩黑膜21片","shop_price":89.9,"market_price":297,"goods_img":"https://image.yunifang.com/yunifang/images/goods/2039/goods_img/17093020002498271170145819.jpg","reservable":false,"efficacy":"自然纯粹 水润纯净","stock_number":0,"restrict_purchase_num":0,"goodsName":"补水指数：★★★☆☆","goodsImage":"https://image.yunifang.com/yunifang/images/goods/temp/171011193181418890895139029.jpg","description":"精选龙头竹菁萃、牛油果精粹、黑珍珠精粹，给你自然纯粹，水润纯净体验~"},{"id":"745","goods_name":"全新升级丨晶亮红石榴面膜7片","shop_price":79,"market_price":89,"goods_img":"https://image.yunifang.com/yunifang/images/goods/745/goods_img/17081617418998795654179347.jpg","reservable":false,"efficacy":"深度排浊 一扫黯哑","stock_number":0,"restrict_purchase_num":0,"goodsName":"亮肤指数：★★★★★","goodsImage":"https://image.yunifang.com/yunifang/images/goods/temp/170816184151311258603701437.jpg","description":"萃取红石榴原液，滴滴蕴含鲜活能量，清洁排浊、透亮无瑕，改善粗糙黯哑小能手"},{"id":"1870","goods_name":"新品尝鲜|玉润雪肌黑白膜盒20片","shop_price":129.9,"market_price":297,"goods_img":"https://image.yunifang.com/yunifang/images/goods/1870/goods_img/17071909555120332464127704.jpg","reservable":false,"efficacy":"黑白膜力 美肌如玉","stock_number":0,"restrict_purchase_num":0,"goodsName":"新品推荐：★★★★☆","goodsImage":"https://image.yunifang.com/yunifang/images/goods/temp/1707171037861467283567706.jpg","description":"白膜胶原蛋白精华，昼弹润生态库，黑膜三分子玻尿酸，夜补水先锋。黑白膜力，水肌如玉~"},{"id":"1919","goods_name":"透亮红酒酵力面膜21片","shop_price":129.9,"market_price":239,"goods_img":"https://image.yunifang.com/yunifang/images/goods/1919/goods_img/170630171021217601465422538.jpg","reservable":false,"efficacy":"红酒透亮 酵醒美肌","stock_number":0,"restrict_purchase_num":0,"goodsName":"亮肤指数：★★★★★","goodsImage":"https://image.yunifang.com/yunifang/images/goods/temp/170630224599017601465422520.jpg","description":"全新添加西班牙酵母发酵液，融合法国红酒多酚亮肤成分，加乘亮肤功效~"},{"id":"772","goods_name":"全新升级丨清润莹亮黑膜套装21片","shop_price":99.9,"market_price":297,"goods_img":"https://image.yunifang.com/yunifang/images/goods/772/goods_img/17090514228269026987111180.jpg","reservable":false,"efficacy":"自然莹亮 水感瓷肌","stock_number":0,"restrict_purchase_num":0,"goodsName":"水亮能量：★★★★☆","goodsImage":"https://image.yunifang.com/yunifang/images/goods/temp/1709191414112467283564077.jpg","description":"自然莹亮，水感瓷肌，精选龙头竹、葡萄籽，演绎水亮二重奏~"},{"id":"487","goods_name":"海洋弹性蛋白矿物精华眼霜25g","shop_price":139,"market_price":169,"goods_img":"https://image.yunifang.com/yunifang/images/goods/487/goods_img/170626101843492134395965.jpg","reservable":false,"efficacy":"提拉紧致 润亮双眸","stock_number":0,"restrict_purchase_num":0,"goodsName":"抗皱指数：★★★☆☆","goodsImage":"https://image.yunifang.com/yunifang/images/goods/temp/1706151917130467283566572.jpg","description":"不要等到有皱纹了才想起用眼霜，不要让眼睛放大你的年龄，每一滴自然精粹，都为你打造明亮双眸~"},{"id":"1281","goods_name":"新品眼霜丨红石榴矿物眼霜25g","shop_price":129,"market_price":159,"goods_img":"https://image.yunifang.com/yunifang/images/goods/1281/goods_img/170626102555811776047044227.jpg","reservable":false,"efficacy":"淡退黑眼圈 净彻排浊","stock_number":0,"restrict_purchase_num":0,"goodsName":"抗皱指数：★★★☆☆","goodsImage":"https://image.yunifang.com/yunifang/images/goods/temp/1706151918330467283566999.jpg","description":"熊猫眼克星！多种植物精粹，天然舒活肌肤水通道，清爽不油腻，好吸收，和细纹说拜拜~"}]
             * goodsIdsList : ["492","2076","1923","1189","1638","1830","2091","2039","745","1870","1919","772","1280","487","1281","1250"]
             * goodsRelationList : [{"id":"14815","subject_id":"84","goods_id":"492","goodsName":"PG one热荐：★★★★★","goodsImage":"https://image.yunifang.com/yunifang/images/goods/temp/171011192212214258195254179.jpg","description":"三重植物精粹，三重水润膜力，美时美刻，水润透亮~"},{"id":"14816","subject_id":"84","goods_id":"2076","goodsName":"水润指数：★★★★☆","goodsImage":"https://image.yunifang.com/yunifang/images/goods/temp/17101119283583452898243380.jpg","description":"畅享鲜果派对，肌肤水嫩鲜活，萃取自然野草莓、黑莓、巴西莓精华，三款搭配持续水嫩鲜活~"},{"id":"14817","subject_id":"84","goods_id":"1923","goodsName":"美白指数：★★★★☆","goodsImage":"https://image.yunifang.com/yunifang/images/goods/temp/170816184068619872110797032.jpg","description":"真美白，匠心造！全新升级美白嫩肤面膜，多种美白成分助力美白，国家权威美白特证安全放心~"},{"id":"14818","subject_id":"84","goods_id":"1189","goodsName":"鲜嫩指数：★★★★☆","goodsImage":"https://image.yunifang.com/yunifang/images/goods/temp/17101119312216937168845205.jpg","description":"精选玫瑰、竹萃自然精粹，清洁力、补水力、亮泽度全新升级，另肌肤水感剔透~"},{"id":"14819","subject_id":"84","goods_id":"1638","goodsName":"推荐指数：★★★☆☆","goodsImage":"https://image.yunifang.com/yunifang/images/goods/temp/170905182614314997886548523.jpg","description":"蕴含南极活性补水酵素精华，持久补水锁水，轻蔬鲜果酵素助力平衡水油~"},{"id":"14820","subject_id":"84","goods_id":"1830","goodsName":"新品推荐：★★★★★","goodsImage":"https://image.yunifang.com/yunifang/images/goods/temp/1705240026717476518778188.jpg","description":"茶萃微囊精华，开创持续保湿新体验，只要一片，水润一天，持续保湿12小时以上"},{"id":"14821","subject_id":"84","goods_id":"2091","goodsName":"遮瑕指数：★★★★☆","goodsImage":"https://image.yunifang.com/yunifang/images/goods/temp/1709051825818467283561992.jpg","description":"如果你是素颜控，这款即刻提亮，闪亮肤色的懒人新品素颜霜你值得拥有~"},{"id":"14822","subject_id":"84","goods_id":"2039","goodsName":"补水指数：★★★☆☆","goodsImage":"https://image.yunifang.com/yunifang/images/goods/temp/171011193181418890895139029.jpg","description":"精选龙头竹菁萃、牛油果精粹、黑珍珠精粹，给你自然纯粹，水润纯净体验~"},{"id":"14823","subject_id":"84","goods_id":"745","goodsName":"亮肤指数：★★★★★","goodsImage":"https://image.yunifang.com/yunifang/images/goods/temp/170816184151311258603701437.jpg","description":"萃取红石榴原液，滴滴蕴含鲜活能量，清洁排浊、透亮无瑕，改善粗糙黯哑小能手"},{"id":"14824","subject_id":"84","goods_id":"1870","goodsName":"新品推荐：★★★★☆","goodsImage":"https://image.yunifang.com/yunifang/images/goods/temp/1707171037861467283567706.jpg","description":"白膜胶原蛋白精华，昼弹润生态库，黑膜三分子玻尿酸，夜补水先锋。黑白膜力，水肌如玉~"},{"id":"14825","subject_id":"84","goods_id":"1919","goodsName":"亮肤指数：★★★★★","goodsImage":"https://image.yunifang.com/yunifang/images/goods/temp/170630224599017601465422520.jpg","description":"全新添加西班牙酵母发酵液，融合法国红酒多酚亮肤成分，加乘亮肤功效~"},{"id":"14826","subject_id":"84","goods_id":"772","goodsName":"水亮能量：★★★★☆","goodsImage":"https://image.yunifang.com/yunifang/images/goods/temp/1709191414112467283564077.jpg","description":"自然莹亮，水感瓷肌，精选龙头竹、葡萄籽，演绎水亮二重奏~"},{"id":"14827","subject_id":"84","goods_id":"1280","goodsName":"遮瑕指数：★★★☆☆","goodsImage":"https://image.yunifang.com/yunifang/images/goods/temp/17051609285005287026507049.jpg","description":"日本进口粉扑，云母成分强遮瑕，接触肌肤绵密柔软，粉体细腻，妆感轻薄，完美遮瑕~"},{"id":"14828","subject_id":"84","goods_id":"487","goodsName":"抗皱指数：★★★☆☆","goodsImage":"https://image.yunifang.com/yunifang/images/goods/temp/1706151917130467283566572.jpg","description":"不要等到有皱纹了才想起用眼霜，不要让眼睛放大你的年龄，每一滴自然精粹，都为你打造明亮双眸~"},{"id":"14829","subject_id":"84","goods_id":"1281","goodsName":"抗皱指数：★★★☆☆","goodsImage":"https://image.yunifang.com/yunifang/images/goods/temp/1706151918330467283566999.jpg","description":"熊猫眼克星！多种植物精粹，天然舒活肌肤水通道，清爽不油腻，好吸收，和细纹说拜拜~"},{"id":"14830","subject_id":"84","goods_id":"1250","goodsName":"抗氧化指数：★★★★☆","goodsImage":"https://image.yunifang.com/yunifang/images/goods/temp/1706021026770467283563014.jpg","description":"你的梳妆台必不可少一瓶面霜，告别熬夜和岁月留下的黄脸，为肌肤注入鲜活能量。"}]
             * url : http://h.yunifang.com/goods/subject.html?id=84
             * wapUrl : http://vip.yunifang.com/goods/subject.html?id=84
             */

            private String id;
            private String title;
            private String detail;
            private String image;
            private String start_time;
            private String end_time;
            private int show_number;
            private String state;
            private int sort;
            private String descImage;
            private String template;
            private String url;
            private String wapUrl;
            private List<GoodsListBean> goodsList;
            private List<String> goodsIdsList;
            private List<GoodsRelationListBean> goodsRelationList;

            public void setId(String id) {
                this.id = id;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public void setDetail(String detail) {
                this.detail = detail;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public void setStart_time(String start_time) {
                this.start_time = start_time;
            }

            public void setEnd_time(String end_time) {
                this.end_time = end_time;
            }

            public void setShow_number(int show_number) {
                this.show_number = show_number;
            }

            public void setState(String state) {
                this.state = state;
            }

            public void setSort(int sort) {
                this.sort = sort;
            }

            public void setDescImage(String descImage) {
                this.descImage = descImage;
            }

            public void setTemplate(String template) {
                this.template = template;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public void setWapUrl(String wapUrl) {
                this.wapUrl = wapUrl;
            }

            public void setGoodsList(List<GoodsListBean> goodsList) {
                this.goodsList = goodsList;
            }

            public void setGoodsIdsList(List<String> goodsIdsList) {
                this.goodsIdsList = goodsIdsList;
            }

            public void setGoodsRelationList(List<GoodsRelationListBean> goodsRelationList) {
                this.goodsRelationList = goodsRelationList;
            }

            public String getId() {
                return id;
            }

            public String getTitle() {
                return title;
            }

            public String getDetail() {
                return detail;
            }

            public String getImage() {
                return image;
            }

            public String getStart_time() {
                return start_time;
            }

            public String getEnd_time() {
                return end_time;
            }

            public int getShow_number() {
                return show_number;
            }

            public String getState() {
                return state;
            }

            public int getSort() {
                return sort;
            }

            public String getDescImage() {
                return descImage;
            }

            public String getTemplate() {
                return template;
            }

            public String getUrl() {
                return url;
            }

            public String getWapUrl() {
                return wapUrl;
            }

            public List<GoodsListBean> getGoodsList() {
                return goodsList;
            }

            public List<String> getGoodsIdsList() {
                return goodsIdsList;
            }

            public List<GoodsRelationListBean> getGoodsRelationList() {
                return goodsRelationList;
            }

            public static class GoodsListBean {
                /**
                 * id : 492
                 * goods_name : 盈透美肌黑膜套装（插画版）
                 * shop_price : 99.9
                 * market_price : 298.0
                 * goods_img : https://image.yunifang.com/yunifang/images/goods/492/goods_img/171011191068814258195256706.jpg
                 * reservable : false
                 * efficacy : 以黑吸黑 润透亮颜
                 * stock_number : 0
                 * restrict_purchase_num : 0
                 * goodsName : PG one热荐：★★★★★
                 * goodsImage : https://image.yunifang.com/yunifang/images/goods/temp/171011192212214258195254179.jpg
                 * description : 三重植物精粹，三重水润膜力，美时美刻，水润透亮~
                 */

                private String id;
                private String goods_name;
                private double shop_price;
                private double market_price;
                private String goods_img;
                private boolean reservable;
                private String efficacy;
                private int stock_number;
                private int restrict_purchase_num;
                private String goodsName;
                private String goodsImage;
                private String description;

                public void setId(String id) {
                    this.id = id;
                }

                public void setGoods_name(String goods_name) {
                    this.goods_name = goods_name;
                }

                public void setShop_price(double shop_price) {
                    this.shop_price = shop_price;
                }

                public void setMarket_price(double market_price) {
                    this.market_price = market_price;
                }

                public void setGoods_img(String goods_img) {
                    this.goods_img = goods_img;
                }

                public void setReservable(boolean reservable) {
                    this.reservable = reservable;
                }

                public void setEfficacy(String efficacy) {
                    this.efficacy = efficacy;
                }

                public void setStock_number(int stock_number) {
                    this.stock_number = stock_number;
                }

                public void setRestrict_purchase_num(int restrict_purchase_num) {
                    this.restrict_purchase_num = restrict_purchase_num;
                }

                public void setGoodsName(String goodsName) {
                    this.goodsName = goodsName;
                }

                public void setGoodsImage(String goodsImage) {
                    this.goodsImage = goodsImage;
                }

                public void setDescription(String description) {
                    this.description = description;
                }

                public String getId() {
                    return id;
                }

                public String getGoods_name() {
                    return goods_name;
                }

                public double getShop_price() {
                    return shop_price;
                }

                public double getMarket_price() {
                    return market_price;
                }

                public String getGoods_img() {
                    return goods_img;
                }

                public boolean getReservable() {
                    return reservable;
                }

                public String getEfficacy() {
                    return efficacy;
                }

                public int getStock_number() {
                    return stock_number;
                }

                public int getRestrict_purchase_num() {
                    return restrict_purchase_num;
                }

                public String getGoodsName() {
                    return goodsName;
                }

                public String getGoodsImage() {
                    return goodsImage;
                }

                public String getDescription() {
                    return description;
                }
            }

            public static class GoodsRelationListBean {
                /**
                 * id : 14815
                 * subject_id : 84
                 * goods_id : 492
                 * goodsName : PG one热荐：★★★★★
                 * goodsImage : https://image.yunifang.com/yunifang/images/goods/temp/171011192212214258195254179.jpg
                 * description : 三重植物精粹，三重水润膜力，美时美刻，水润透亮~
                 */

                private String id;
                private String subject_id;
                private String goods_id;
                private String goodsName;
                private String goodsImage;
                private String description;

                public void setId(String id) {
                    this.id = id;
                }

                public void setSubject_id(String subject_id) {
                    this.subject_id = subject_id;
                }

                public void setGoods_id(String goods_id) {
                    this.goods_id = goods_id;
                }

                public void setGoodsName(String goodsName) {
                    this.goodsName = goodsName;
                }

                public void setGoodsImage(String goodsImage) {
                    this.goodsImage = goodsImage;
                }

                public void setDescription(String description) {
                    this.description = description;
                }

                public String getId() {
                    return id;
                }

                public String getSubject_id() {
                    return subject_id;
                }

                public String getGoods_id() {
                    return goods_id;
                }

                public String getGoodsName() {
                    return goodsName;
                }

                public String getGoodsImage() {
                    return goodsImage;
                }

                public String getDescription() {
                    return description;
                }
            }
        }

        public static class Ad1Bean {
            /**
             * id : 1147
             * createtime : 2017.10.09 08:33:42
             * lastupdatetime : 2017.10.09 08:33:46
             * image : https://image.yunifang.com/yunifang/images/goods/ad0/17100908319495742677657462.jpg
             * ad_type : 0
             * sort : 1414
             * position : 0
             * enabled : 1
             * createuser : leiqi
             * lastupdateuser : leiqi
             * ad_type_dynamic : 1
             * ad_type_dynamic_data : http://h.yunifang.com/h/comment.html
             * ad_type_dynamic_detail : http%3A%2F%2Fh.yunifang.com%2Fh%2Fcomment.html
             * title : 10月商品好评有礼
             * channelType : 0
             */

            private String id;
            private String createtime;
            private String lastupdatetime;
            private String image;
            private int ad_type;
            private int sort;
            private int position;
            private int enabled;
            private String createuser;
            private String lastupdateuser;
            private String ad_type_dynamic;
            private String ad_type_dynamic_data;
            private String ad_type_dynamic_detail;
            private String title;
            private String channelType;

            public void setId(String id) {
                this.id = id;
            }

            public void setCreatetime(String createtime) {
                this.createtime = createtime;
            }

            public void setLastupdatetime(String lastupdatetime) {
                this.lastupdatetime = lastupdatetime;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public void setAd_type(int ad_type) {
                this.ad_type = ad_type;
            }

            public void setSort(int sort) {
                this.sort = sort;
            }

            public void setPosition(int position) {
                this.position = position;
            }

            public void setEnabled(int enabled) {
                this.enabled = enabled;
            }

            public void setCreateuser(String createuser) {
                this.createuser = createuser;
            }

            public void setLastupdateuser(String lastupdateuser) {
                this.lastupdateuser = lastupdateuser;
            }

            public void setAd_type_dynamic(String ad_type_dynamic) {
                this.ad_type_dynamic = ad_type_dynamic;
            }

            public void setAd_type_dynamic_data(String ad_type_dynamic_data) {
                this.ad_type_dynamic_data = ad_type_dynamic_data;
            }

            public void setAd_type_dynamic_detail(String ad_type_dynamic_detail) {
                this.ad_type_dynamic_detail = ad_type_dynamic_detail;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public void setChannelType(String channelType) {
                this.channelType = channelType;
            }

            public String getId() {
                return id;
            }

            public String getCreatetime() {
                return createtime;
            }

            public String getLastupdatetime() {
                return lastupdatetime;
            }

            public String getImage() {
                return image;
            }

            public int getAd_type() {
                return ad_type;
            }

            public int getSort() {
                return sort;
            }

            public int getPosition() {
                return position;
            }

            public int getEnabled() {
                return enabled;
            }

            public String getCreateuser() {
                return createuser;
            }

            public String getLastupdateuser() {
                return lastupdateuser;
            }

            public String getAd_type_dynamic() {
                return ad_type_dynamic;
            }

            public String getAd_type_dynamic_data() {
                return ad_type_dynamic_data;
            }

            public String getAd_type_dynamic_detail() {
                return ad_type_dynamic_detail;
            }

            public String getTitle() {
                return title;
            }

            public String getChannelType() {
                return channelType;
            }
        }

        public static class Ad5Bean {
            /**
             * id : 359
             * image : https://image.yunifang.com/yunifang/images/goods/ad0/170516143575610973073847273.png
             * ad_type : 4
             * sort : 295
             * position : 5
             * enabled : 0
             * ad_type_dynamic : 1
             * ad_type_dynamic_data : http://h.yunifang.com/sign/sign.html?login_check=2
             * ad_type_dynamic_detail : http%3A%2F%2Fh.yunifang.com%2Fsign%2Fsign.html%3Flogin_check%3D2
             * show_channel : 1,2
             * title : 每日签到
             */

            private String id;
            private String image;
            private int ad_type;
            private int sort;
            private int position;
            private int enabled;
            private String ad_type_dynamic;
            private String ad_type_dynamic_data;
            private String ad_type_dynamic_detail;
            private String show_channel;
            private String title;

            public void setId(String id) {
                this.id = id;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public void setAd_type(int ad_type) {
                this.ad_type = ad_type;
            }

            public void setSort(int sort) {
                this.sort = sort;
            }

            public void setPosition(int position) {
                this.position = position;
            }

            public void setEnabled(int enabled) {
                this.enabled = enabled;
            }

            public void setAd_type_dynamic(String ad_type_dynamic) {
                this.ad_type_dynamic = ad_type_dynamic;
            }

            public void setAd_type_dynamic_data(String ad_type_dynamic_data) {
                this.ad_type_dynamic_data = ad_type_dynamic_data;
            }

            public void setAd_type_dynamic_detail(String ad_type_dynamic_detail) {
                this.ad_type_dynamic_detail = ad_type_dynamic_detail;
            }

            public void setShow_channel(String show_channel) {
                this.show_channel = show_channel;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getId() {
                return id;
            }

            public String getImage() {
                return image;
            }

            public int getAd_type() {
                return ad_type;
            }

            public int getSort() {
                return sort;
            }

            public int getPosition() {
                return position;
            }

            public int getEnabled() {
                return enabled;
            }

            public String getAd_type_dynamic() {
                return ad_type_dynamic;
            }

            public String getAd_type_dynamic_data() {
                return ad_type_dynamic_data;
            }

            public String getAd_type_dynamic_detail() {
                return ad_type_dynamic_detail;
            }

            public String getShow_channel() {
                return show_channel;
            }

            public String getTitle() {
                return title;
            }
        }

        public static class Ad8Bean {
            /**
             * id : 1056
             * image : https://image.yunifang.com/yunifang/images/goods/ad0/170719150582816742818457761.png
             * ad_type : 0
             * sort : 57
             * position : 8
             * enabled : 0
             * description : 人气好物超值推荐
             * ad_type_dynamic : 1
             * ad_type_dynamic_data : http://vip.yunifang.com/goods/recommend.html?id=87
             * ad_type_dynamic_detail : http%3A%2F%2Fh.yunifang.com%2Fgoods%2Frecommend.html%3Fid%3D87
             * show_channel : 1,2,3,4
             * title : 新鲜每一天
             * goods : {"collect_count":0,"reservable":false,"restriction":0,"restrict_purchase_num":0,"is_coupon_allowed":false,"allocated_stock":0,"is_gift":0}
             */

            private String id;
            private String image;
            private int ad_type;
            private int sort;
            private int position;
            private int enabled;
            private String description;
            private String ad_type_dynamic;
            private String ad_type_dynamic_data;
            private String ad_type_dynamic_detail;
            private String show_channel;
            private String title;
            private GoodsBean goods;

            public void setId(String id) {
                this.id = id;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public void setAd_type(int ad_type) {
                this.ad_type = ad_type;
            }

            public void setSort(int sort) {
                this.sort = sort;
            }

            public void setPosition(int position) {
                this.position = position;
            }

            public void setEnabled(int enabled) {
                this.enabled = enabled;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public void setAd_type_dynamic(String ad_type_dynamic) {
                this.ad_type_dynamic = ad_type_dynamic;
            }

            public void setAd_type_dynamic_data(String ad_type_dynamic_data) {
                this.ad_type_dynamic_data = ad_type_dynamic_data;
            }

            public void setAd_type_dynamic_detail(String ad_type_dynamic_detail) {
                this.ad_type_dynamic_detail = ad_type_dynamic_detail;
            }

            public void setShow_channel(String show_channel) {
                this.show_channel = show_channel;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public void setGoods(GoodsBean goods) {
                this.goods = goods;
            }

            public String getId() {
                return id;
            }

            public String getImage() {
                return image;
            }

            public int getAd_type() {
                return ad_type;
            }

            public int getSort() {
                return sort;
            }

            public int getPosition() {
                return position;
            }

            public int getEnabled() {
                return enabled;
            }

            public String getDescription() {
                return description;
            }

            public String getAd_type_dynamic() {
                return ad_type_dynamic;
            }

            public String getAd_type_dynamic_data() {
                return ad_type_dynamic_data;
            }

            public String getAd_type_dynamic_detail() {
                return ad_type_dynamic_detail;
            }

            public String getShow_channel() {
                return show_channel;
            }

            public String getTitle() {
                return title;
            }

            public GoodsBean getGoods() {
                return goods;
            }

            public static class GoodsBean {
                /**
                 * collect_count : 0
                 * reservable : false
                 * restriction : 0
                 * restrict_purchase_num : 0
                 * is_coupon_allowed : false
                 * allocated_stock : 0
                 * is_gift : 0
                 */

                private int collect_count;
                private boolean reservable;
                private int restriction;
                private int restrict_purchase_num;
                private boolean is_coupon_allowed;
                private int allocated_stock;
                private int is_gift;

                public void setCollect_count(int collect_count) {
                    this.collect_count = collect_count;
                }

                public void setReservable(boolean reservable) {
                    this.reservable = reservable;
                }

                public void setRestriction(int restriction) {
                    this.restriction = restriction;
                }

                public void setRestrict_purchase_num(int restrict_purchase_num) {
                    this.restrict_purchase_num = restrict_purchase_num;
                }

                public void setIs_coupon_allowed(boolean is_coupon_allowed) {
                    this.is_coupon_allowed = is_coupon_allowed;
                }

                public void setAllocated_stock(int allocated_stock) {
                    this.allocated_stock = allocated_stock;
                }

                public void setIs_gift(int is_gift) {
                    this.is_gift = is_gift;
                }

                public int getCollect_count() {
                    return collect_count;
                }

                public boolean getReservable() {
                    return reservable;
                }

                public int getRestriction() {
                    return restriction;
                }

                public int getRestrict_purchase_num() {
                    return restrict_purchase_num;
                }

                public boolean getIs_coupon_allowed() {
                    return is_coupon_allowed;
                }

                public int getAllocated_stock() {
                    return allocated_stock;
                }

                public int getIs_gift() {
                    return is_gift;
                }
            }
        }

        public static class DefaultGoodsListBean {
            /**
             * id : 121
             * goods_name : 镇店之宝丨美白嫩肤面膜7片
             * shop_price : 49.9
             * market_price : 99.0
             * goods_img : https://image.yunifang.com/yunifang/images/goods/121/goods_img/17062610568378169043195978.jpg
             * reservable : false
             * efficacy : 镇店之宝 美白爆款
             * stock_number : 0
             * restrict_purchase_num : 0
             */

            private String id;
            private String goods_name;
            private double shop_price;
            private double market_price;
            private String goods_img;
            private boolean reservable;
            private String efficacy;
            private int stock_number;
            private int restrict_purchase_num;

            public void setId(String id) {
                this.id = id;
            }

            public void setGoods_name(String goods_name) {
                this.goods_name = goods_name;
            }

            public void setShop_price(double shop_price) {
                this.shop_price = shop_price;
            }

            public void setMarket_price(double market_price) {
                this.market_price = market_price;
            }

            public void setGoods_img(String goods_img) {
                this.goods_img = goods_img;
            }

            public void setReservable(boolean reservable) {
                this.reservable = reservable;
            }

            public void setEfficacy(String efficacy) {
                this.efficacy = efficacy;
            }

            public void setStock_number(int stock_number) {
                this.stock_number = stock_number;
            }

            public void setRestrict_purchase_num(int restrict_purchase_num) {
                this.restrict_purchase_num = restrict_purchase_num;
            }

            public String getId() {
                return id;
            }

            public String getGoods_name() {
                return goods_name;
            }

            public double getShop_price() {
                return shop_price;
            }

            public double getMarket_price() {
                return market_price;
            }

            public String getGoods_img() {
                return goods_img;
            }

            public boolean getReservable() {
                return reservable;
            }

            public String getEfficacy() {
                return efficacy;
            }

            public int getStock_number() {
                return stock_number;
            }

            public int getRestrict_purchase_num() {
                return restrict_purchase_num;
            }
        }
    }
}
