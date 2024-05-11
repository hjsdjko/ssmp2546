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


import com.dao.WenhuazhanshiDao;
import com.entity.WenhuazhanshiEntity;
import com.service.WenhuazhanshiService;
import com.entity.vo.WenhuazhanshiVO;
import com.entity.view.WenhuazhanshiView;

@Service("wenhuazhanshiService")
public class WenhuazhanshiServiceImpl extends ServiceImpl<WenhuazhanshiDao, WenhuazhanshiEntity> implements WenhuazhanshiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WenhuazhanshiEntity> page = this.selectPage(
                new Query<WenhuazhanshiEntity>(params).getPage(),
                new EntityWrapper<WenhuazhanshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WenhuazhanshiEntity> wrapper) {
		  Page<WenhuazhanshiView> page =new Query<WenhuazhanshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WenhuazhanshiVO> selectListVO(Wrapper<WenhuazhanshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WenhuazhanshiVO selectVO(Wrapper<WenhuazhanshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WenhuazhanshiView> selectListView(Wrapper<WenhuazhanshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WenhuazhanshiView selectView(Wrapper<WenhuazhanshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
