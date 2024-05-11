package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.WenhualeixingDao;
import com.entity.WenhualeixingEntity;
import com.service.WenhualeixingService;
import com.entity.vo.WenhualeixingVO;
import com.entity.view.WenhualeixingView;

@Service("wenhualeixingService")
public class WenhualeixingServiceImpl extends ServiceImpl<WenhualeixingDao, WenhualeixingEntity> implements WenhualeixingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WenhualeixingEntity> page = this.selectPage(
                new Query<WenhualeixingEntity>(params).getPage(),
                new EntityWrapper<WenhualeixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WenhualeixingEntity> wrapper) {
		  Page<WenhualeixingView> page =new Query<WenhualeixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WenhualeixingVO> selectListVO(Wrapper<WenhualeixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WenhualeixingVO selectVO(Wrapper<WenhualeixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WenhualeixingView> selectListView(Wrapper<WenhualeixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WenhualeixingView selectView(Wrapper<WenhualeixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
