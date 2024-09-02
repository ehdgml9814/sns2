package com.project.post.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PostMapper {
	
	public Map<String, Object> selectAll();
}
