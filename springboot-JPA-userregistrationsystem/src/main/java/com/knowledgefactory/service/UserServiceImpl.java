package com.knowledgefactory.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.knowledgefactory.entity.User;
import com.knowledgefactory.repository.UserRepository;
import com.knowledgefactory.vo.UserVo;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository repository;

	@Override
	public List<UserVo> getAllUsers() {
		List<User> userList = new ArrayList<>();
		userList = (List<User>) repository.findAll();
		List<UserVo> vo = new ArrayList<>();
		for (User users : userList) {
			UserVo obj = new UserVo();
			obj.setId(users.getId());
			obj.setName(users.getName());
			obj.setLastname(users.getLastname());
			obj.setEmail(users.getEmail());
			obj.setPin(users.getPin());
			vo.add(obj);
		}
		return vo;
	}

	@Override
	public String save(UserVo vob) {

		User u = new User();
		u.setEmail(vob.getEmail());
		u.setLastname(vob.getLastname());
		u.setName(vob.getName());
		u.setPin(vob.getPin());
		repository.save(u);
		return "true";

	}

	@Override
	public String delete(Long id) {
		repository.deleteById(id);
		return "true";
	}

	@Override
	public String update(UserVo vob) {
		User u = new User();
		u.setEmail(vob.getEmail());
		u.setLastname(vob.getLastname());
		u.setName(vob.getName());
		u.setPin(vob.getPin());
		u.setId(vob.getId());
		repository.save(u);
		return "true";
	}

}
