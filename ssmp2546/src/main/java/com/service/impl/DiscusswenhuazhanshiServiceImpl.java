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


import com.dao.DiscusswenhuazhanshiDao;
import com.entity.DiscusswenhuazhanshiEntity;
import com.service.DiscusswenhuazhanshiService;
import com.entity.vo.DiscusswenhuazhanshiVO;
import com.entity.view.DiscusswenhuazhanshiView;

@Service("discusswenhuazhanshiService")
public class DiscusswenhuazhanshiServiceImpl extends ServiceImpl<DiscusswenhuazhanshiDao, DiscusswenhuazhanshiEntity> implements DiscusswenhuazhanshiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusswenhuazhanshiEntity> page = this.selectPage(
                new Query<DiscusswenhuazhanshiEntity>(params).getPage(),
                new EntityWrapper<DiscusswenhuazhanshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusswenhuazhanshiEntity> wrapper) {
		  Page<DiscusswenhuazhanshiView> page =new Query<DiscusswenhuazhanshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusswenhuazhanshiVO> selectListVO(Wrapper<DiscusswenhuazhanshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusswenhuazhanshiVO selectVO(Wrapper<DiscusswenhuazhanshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusswenhuazhanshiView> selectListView(Wrapper<DiscusswenhuazhanshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusswenhuazhanshiView selectView(Wrapper<DiscusswenhuazhanshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
