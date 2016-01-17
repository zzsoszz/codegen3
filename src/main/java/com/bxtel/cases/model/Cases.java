package com.bxtel.cases.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name = "qy_case")
public class Cases{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private long belonguserid;//所属设计师
	
	private String style;//风格
	
	private String totalprice;//总价格
	
	private String roomtype;//房型
	
	private String area;//面积
	
	private String scenestyle;//场景类型
	
	private String buildingname;//楼盘名称
	
	private String buildingaddress;//楼盘地址
	
	private String latitude;//纬度
	
	private String longitude;//经度
	
	private String designconcept;//设计理念
	
	private String image1;//邮件
	
	private String image2;//邮件
	
	private String image3;//邮件
	
	private String image4;//邮件
	
	private String image5;//邮件
	
	
	
}
