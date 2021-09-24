package com.knowledgefactory.service;

import java.util.List;

import com.knowledgefactory.vo.UserVo;

public interface UserService {

	
	List<UserVo> getAllUsers();
	String save(UserVo vo);
	String delete(Long id);
	String update(UserVo vo);
	
}
