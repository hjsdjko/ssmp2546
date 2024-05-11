package com.dao;

import com.entity.DiscusswenhuazhanshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusswenhuazhanshiVO;
import com.entity.view.DiscusswenhuazhanshiView;


/**
 * 文化展示评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-20 17:07:00
 */
public interface DiscusswenhuazhanshiDao extends BaseMapper<DiscusswenhuazhanshiEntity> {
	
	List<DiscusswenhuazhanshiVO> selectListVO(@Param("ew") Wrapper<DiscusswenhuazhanshiEntity> wrapper);
	
	DiscusswenhuazhanshiVO selectVO(@Param("ew") Wrapper<DiscusswenhuazhanshiEntity> wrapper);
	
	List<DiscusswenhuazhanshiView> selectListView(@Param("ew") Wrapper<DiscusswenhuazhanshiEntity> wrapper);

	List<DiscusswenhuazhanshiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusswenhuazhanshiEntity> wrapper);
	
	DiscusswenhuazhanshiView selectView(@Param("ew") Wrapper<DiscusswenhuazhanshiEntity> wrapper);
	
}
