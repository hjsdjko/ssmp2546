package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 文化展示
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-20 17:07:00
 */
@TableName("wenhuazhanshi")
public class WenhuazhanshiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public WenhuazhanshiEntity() {
		
	}
	
	public WenhuazhanshiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 标题
	 */
					
	private String biaoti;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：标题
	 */
	public void setBiaoti(String biaoti) {
		this.biaoti = biaoti;
	}
	/**
	 * 获取：标题
	 */
	public String getBiaoti() {
		return biaoti;
	}
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
