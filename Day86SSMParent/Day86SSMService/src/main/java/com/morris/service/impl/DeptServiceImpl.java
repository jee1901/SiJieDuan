package com.morris.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.morris.Dao.DeptMapper;
import com.morris.pojo.DeptBean;
import com.morris.service.DeptService;


@Service
public class DeptServiceImpl implements DeptService {

	
	@Autowired
	private DeptMapper deptMapper;
	
	
	
	@Override
	public List<DeptBean> selectAll() {
		return deptMapper.selectAll();
	}

}
