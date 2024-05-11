package com.dao;

import com.entity.WenhuazhanshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WenhuazhanshiVO;
import com.entity.view.WenhuazhanshiView;


/**
 * 文化展示
 * 
 * @author 
 * @email 
 * @date 2021-04-20 17:07:00
 */
public interface WenhuazhanshiDao extends BaseMapper<WenhuazhanshiEntity> {
	
	List<WenhuazhanshiVO> selectListVO(@Param("ew") Wrapper<WenhuazhanshiEntity> wrapper);
	
	WenhuazhanshiVO selectVO(@Param("ew") Wrapper<WenhuazhanshiEntity> wrapper);
	
	List<WenhuazhanshiView> selectListView(@Param("ew") Wrapper<WenhuazhanshiEntity> wrapper);

	List<WenhuazhanshiView> selectListView(Pagination page,@Param("ew") Wrapper<WenhuazhanshiEntity> wrapper);
	
	WenhuazhanshiView selectView(@Param("ew") Wrapper<WenhuazhanshiEntity> wrapper);
	
}
