package com.entity.model;

import com.entity.WenhuazhanshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 文化展示
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-20 17:07:00
 */
public class WenhuazhanshiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 文化类型
	 */
	
	private String wenhualeixing;
		
	/**
	 * 封面
	 */
	
	private String fengmian;
		
	/**
	 * 音频
	 */
	
	private String yinpin;
		
	/**
	 * 所在地区
	 */
	
	private String suozaidiqu;
		
	/**
	 * 详细地址
	 */
	
	private String xiangxidizhi;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
		
	/**
	 * 内容介绍
	 */
	
	private String neirongjieshao;
				
	
	/**
	 * 设置：文化类型
	 */
	 
	public void setWenhualeixing(String wenhualeixing) {
		this.wenhualeixing = wenhualeixing;
	}
	
	/**
	 * 获取：文化类型
	 */
	public String getWenhualeixing() {
		return wenhualeixing;
	}
				
	
	/**
	 * 设置：封面
	 */
	 
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
				
	
	/**
	 * 设置：音频
	 */
	 
	public void setYinpin(String yinpin) {
		this.yinpin = yinpin;
	}
	
	/**
	 * 获取：音频
	 */
	public String getYinpin() {
		return yinpin;
	}
				
	
	/**
	 * 设置：所在地区
	 */
	 
	public void setSuozaidiqu(String suozaidiqu) {
		this.suozaidiqu = suozaidiqu;
	}
	
	/**
	 * 获取：所在地区
	 */
	public String getSuozaidiqu() {
		return suozaidiqu;
	}
				
	
	/**
	 * 设置：详细地址
	 */
	 
	public void setXiangxidizhi(String xiangxidizhi) {
		this.xiangxidizhi = xiangxidizhi;
	}
	
	/**
	 * 获取：详细地址
	 */
	public String getXiangxidizhi() {
		return xiangxidizhi;
	}
				
	
	/**
	 * 设置：发布时间
	 */
	 
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
				
	
	/**
	 * 设置：内容介绍
	 */
	 
	public void setNeirongjieshao(String neirongjieshao) {
		this.neirongjieshao = neirongjieshao;
	}
	
	/**
	 * 获取：内容介绍
	 */
	public String getNeirongjieshao() {
		return neirongjieshao;
	}
			
}
