package com.wanydream.mongodb.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wanydream.mongodb.dao.WebsiteRepository;
import com.wanydream.mongodb.entity.Website;

@RestController
public class WebsiteController {

	@Resource
	private WebsiteRepository websiteRepository;

	@RequestMapping("find")
	public List<Website> find() {
		return websiteRepository.findAll();
	}
	
	@RequestMapping("save")
	public Website save() {
		Website website=new Website();
		website.setName("baidu");
		
		return websiteRepository.insert(website);
	}
}
