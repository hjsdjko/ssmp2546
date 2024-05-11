package com.dao;

import com.entity.WenhualeixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WenhualeixingVO;
import com.entity.view.WenhualeixingView;


/**
 * 文化类型
 * 
 * @author 
 * @email 
 * @date 2021-04-20 17:07:00
 */
public interface WenhualeixingDao extends BaseMapper<WenhualeixingEntity> {
	
	List<WenhualeixingVO> selectListVO(@Param("ew") Wrapper<WenhualeixingEntity> wrapper);
	
	WenhualeixingVO selectVO(@Param("ew") Wrapper<WenhualeixingEntity> wrapper);
	
	List<WenhualeixingView> selectListView(@Param("ew") Wrapper<WenhualeixingEntity> wrapper);

	List<WenhualeixingView> selectListView(Pagination page,@Param("ew") Wrapper<WenhualeixingEntity> wrapper);
	
	WenhualeixingView selectView(@Param("ew") Wrapper<WenhualeixingEntity> wrapper);
	
}
