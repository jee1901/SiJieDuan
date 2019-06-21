package com.morris.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.morris.pojo.TbItem;
import com.morris.service.TbItemService;

@RestController
public class TbItemController {

	
	@Autowired
	private TbItemService tbItemService;
	
	
	
	@GetMapping("/get")
	public List<TbItem> get(){
		
		
		
		
		return tbItemService.selectPre100();
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
