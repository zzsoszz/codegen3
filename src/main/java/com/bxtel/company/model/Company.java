package com.bxtel.company.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Company {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	String name;//公司名字
	
	String icon_url;//公司图标地址
	
	String intro;//介绍
	
	String address;//地址
	
	String latitude;//纬度
	
	String longitude;//经度
	
	String mobile;//手机号码
	
	String certificate_images;//证书图片地址
	
	String evaluation;//口碑
	
	String consulting_person;//咨询人数
}
