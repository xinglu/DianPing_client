package cn.edu.nuc.dianping_client.entity;

import java.io.Serializable;

public class Goods  implements Serializable {
  
	 private String id;//商品
	 private String categoryId;//分类
	 private String shopId;//商家
	 private String CityId;//城市
	 private String title;//商品名称
	 private String sortTitle;//商品描述信息
	 private String imgUrl;//图标
	 private String startTime;//开始时间
	 private String value;//原价
	 private String price;//销售价
	 private String ribat;//折扣
	 private String bought;//购买量
	 private String maxQuota;//最大存货物
	 private String post;//
	 private String soldOut;
	 private String tip;
	 private String endTime;//结束时间
	 private String detail;//描述详情
	 private boolean isRefund;
	 private boolean isOverTime;
	 private String minquota;
	 private String distance;
	 private String lastComment;
	 private Shop shop;//所属商家

	public String getLastComment() {
		return lastComment;
	}

	public void setLastComment(String lastComment) {
		this.lastComment = lastComment;
	}

	public String getId() {
		return id;
	}
	public final String getDistance() {
		return distance;
	}
	public final void setDistance(String distance) {
		this.distance = distance;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getShopId() {
		return shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	public String getCityId() {
		return CityId;
	}
	public void setCityId(String cityId) {
		CityId = cityId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSortTitle() {
		return sortTitle;
	}
	public void setSortTitle(String sortTitle) {
		this.sortTitle = sortTitle;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getRibat() {
		return ribat;
	}
	public void setRibat(String ribat) {
		this.ribat = ribat;
	}
	public String getBought() {
		return bought;
	}
	public void setBought(String bought) {
		this.bought = bought;
	}
	public String getMaxQuota() {
		return maxQuota;
	}
	public void setMaxQuota(String maxQuota) {
		this.maxQuota = maxQuota;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public String getSoldOut() {
		return soldOut;
	}
	public void setSoldOut(String soldOut) {
		this.soldOut = soldOut;
	}
	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public boolean isRefund() {
		return isRefund;
	}
	public void setRefund(boolean isRefund) {
		this.isRefund = isRefund;
	}
	public boolean isOverTime() {
		return isOverTime;
	}
	public void setOverTime(boolean isOverTime) {
		this.isOverTime = isOverTime;
	}
	public String getMinquota() {
		return minquota;
	}
	public void setMinquota(String minquota) {
		this.minquota = minquota;
	}
	public Shop getShop() {
		return shop;
	}
	public void setShop(Shop shop) {
		this.shop = shop;
	}
	  
	 
	
	
}

