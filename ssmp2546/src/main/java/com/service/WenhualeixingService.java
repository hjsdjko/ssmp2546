package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WenhualeixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WenhualeixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WenhualeixingView;


/**
 * 文化类型
 *
 * @author 
 * @email 
 * @date 2021-04-20 17:07:00
 */
public interface WenhualeixingService extends IService<WenhualeixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WenhualeixingVO> selectListVO(Wrapper<WenhualeixingEntity> wrapper);
   	
   	WenhualeixingVO selectVO(@Param("ew") Wrapper<WenhualeixingEntity> wrapper);
   	
   	List<WenhualeixingView> selectListView(Wrapper<WenhualeixingEntity> wrapper);
   	
   	WenhualeixingView selectView(@Param("ew") Wrapper<WenhualeixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WenhualeixingEntity> wrapper);
   	
}

