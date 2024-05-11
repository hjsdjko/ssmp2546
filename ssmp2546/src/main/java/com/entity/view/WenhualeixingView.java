package com.entity.view;

import com.entity.WenhualeixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 文化类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-20 17:07:00
 */
@TableName("wenhualeixing")
public class WenhualeixingView  extends WenhualeixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WenhualeixingView(){
	}
 
 	public WenhualeixingView(WenhualeixingEntity wenhualeixingEntity){
 	try {
			BeanUtils.copyProperties(this, wenhualeixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
