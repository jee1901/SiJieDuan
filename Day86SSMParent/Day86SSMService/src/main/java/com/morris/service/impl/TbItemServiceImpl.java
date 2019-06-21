package com.morris.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.morris.Dao.TbItemMapper;
import com.morris.pojo.TbItem;
import com.morris.service.TbItemService;


@Service
public class TbItemServiceImpl implements TbItemService {
	
	@Autowired
	private TbItemMapper tbItemMapper;
	
	

	@Override
	public List<TbItem> selectPre100() {
		
		
		
		
		
		return tbItemMapper.selectPre100();
	}

}
