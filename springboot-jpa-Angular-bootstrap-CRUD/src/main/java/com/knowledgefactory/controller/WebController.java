package com.knowledgefactory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.knowledgefactory.entity.User;
import com.knowledgefactory.exception.RecordNotFoundException;
import com.knowledgefactory.service.UserService;

@RestController

public class WebController {
	@Autowired
	UserService service;

	@GetMapping({ "/getAllUsers" })
	public ResponseEntity<List<User>> getAllUsers() {
		List<User> list = service.getAllusers();
		return new ResponseEntity<List<User>>(list, HttpStatus.OK);
	}

	@DeleteMapping(path = "/delete/{id}")
	public void deleteUserById(Model model, @PathVariable("id") Long id) throws RecordNotFoundException {
		service.deleteUserById(id);

	}

	@PostMapping(path = "/createUser")
	public User createOrUpdateUser(@RequestBody User user) {
		return service.createOrUpdateUser(user);

	}

}
