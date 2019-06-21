package com.morris.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.morris.pojo.DeptBean;
import com.morris.service.DeptService;

@RestController
public class DeptController {
	
	@Autowired
	private DeptService deptService;
	
	
	
	
	@GetMapping("/getAllDept")
	public List<DeptBean> getAllDept(){
		
		return deptService.selectAll();
	}
	
	
	

}
