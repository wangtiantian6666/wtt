package com.wangtiantian.pojo;

public class Goods {
	private Integer gid;
	private String gname;
	private Integer bid;
	private Integer kid;
	private String datea;
	private Integer price;
	private Integer status;
	
	private String bname;
	private String kname;
	public Integer getGid() {
		return gid;
	}
	public void setGid(Integer gid) {
		this.gid = gid;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public Integer getBid() {
		return bid;
	}
	public void setBid(Integer bid) {
		this.bid = bid;
	}
	public Integer getKid() {
		return kid;
	}
	public void setKid(Integer kid) {
		this.kid = kid;
	}
	public String getDatea() {
		return datea;
	}
	public void setDatea(String datea) {
		this.datea = datea;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getKname() {
		return kname;
	}
	public void setKname(String kname) {
		this.kname = kname;
	}
	public Goods() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Goods(Integer gid) {
		super();
		this.gid = gid;
	}
	public Goods(String gname, Integer bid, Integer kid, String datea, Integer price, Integer status) {
		super();
		this.gname = gname;
		this.bid = bid;
		this.kid = kid;
		this.datea = datea;
		this.price = price;
		this.status = status;
	}
	
	

}
