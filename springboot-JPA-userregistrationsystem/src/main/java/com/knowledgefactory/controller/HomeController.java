package com.knowledgefactory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.knowledgefactory.vo.UserVo;
import com.knowledgefactory.service.UserService;

@RestController
public class HomeController {

	@Autowired
	UserService service;

	@GetMapping({ "/getcall" })
	public ResponseEntity<List<UserVo>> listAllUsers() {

		return new ResponseEntity<List<UserVo>>(service.getAllUsers(), HttpStatus.OK);
	}

	@PostMapping(value = "/saveUser", headers = "Accept=application/json")
	public ResponseEntity<String> save(@RequestBody UserVo vo) {
		String status=service.save(vo);
		return new ResponseEntity<String>(status,HttpStatus.OK);
	}

	@DeleteMapping(value = "/deleteById", headers = "Accept=application/json")
	public ResponseEntity<String> deleteById(@RequestBody UserVo vo) {
		String status=service.delete(vo.getId());
		return new ResponseEntity<>(status,HttpStatus.OK);
	}

	@PostMapping(value = "/updateUser", headers = "Accept=application/json")
	public ResponseEntity<String> updateUser(@RequestBody UserVo vo) {
		String status=service.update(vo);
		return new ResponseEntity<>(status,HttpStatus.OK);
	}

}
