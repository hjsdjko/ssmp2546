package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusswenhuazhanshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusswenhuazhanshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusswenhuazhanshiView;


/**
 * 文化展示评论表
 *
 * @author 
 * @email 
 * @date 2021-04-20 17:07:00
 */
public interface DiscusswenhuazhanshiService extends IService<DiscusswenhuazhanshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusswenhuazhanshiVO> selectListVO(Wrapper<DiscusswenhuazhanshiEntity> wrapper);
   	
   	DiscusswenhuazhanshiVO selectVO(@Param("ew") Wrapper<DiscusswenhuazhanshiEntity> wrapper);
   	
   	List<DiscusswenhuazhanshiView> selectListView(Wrapper<DiscusswenhuazhanshiEntity> wrapper);
   	
   	DiscusswenhuazhanshiView selectView(@Param("ew") Wrapper<DiscusswenhuazhanshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusswenhuazhanshiEntity> wrapper);
   	
}

