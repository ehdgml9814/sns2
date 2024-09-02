package com.project.test;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.project.post.mapper.PostMapper;

@Controller
public class TestController {
	
	@Autowired
	private PostMapper postMapper;

	@ResponseBody
	@RequestMapping("/test1")
	public String test1() {
		return "hello world";
	}
	
	@ResponseBody
	@RequestMapping("/test2")
	public String test2() {
		return "<h1>h1 제목</h1>입니다";
	}
	
	@ResponseBody
	@RequestMapping("/test3")
	public Map<String, Object> test3() {
		Map<String, Object> map = new HashMap<>();
		map.put("a", 1);
		map.put("b", 12);
		map.put("c", 123);
		return map;
	}
	
	@RequestMapping("/test4")
	public String test4() {
		return "test/test";
	}
	
	@ResponseBody
	@RequestMapping("/test5")
	public Map<String, Object> test5() {
		return postMapper.selectAll();
	}
}
