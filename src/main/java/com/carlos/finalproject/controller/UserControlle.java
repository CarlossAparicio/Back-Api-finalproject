package com.carlos.finalproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carlos.finalproject.dto.UserDTO;
import com.carlos.finalproject.dto.UserTypeDTO;
import com.carlos.finalproject.service.UserService;
import com.carlos.finalproject.service.UserTypeService;

@RestController
@RequestMapping("user")
public class UserControlle {
	
	@Autowired
	UserService userService;
	
	@Autowired
	UserTypeService userTypeService;
	
	@GetMapping("version")
	public String Version() {
		return "Version 1.0";
	}
	
	@GetMapping("getlistusers")
	public List<UserDTO> listUsers(){
		return userService.listUsers();
	}
	
	@GetMapping("getlistusertypes")
	public List<UserTypeDTO> listUsersTypes(){
		return userTypeService.listUsersTypes();
	}
	
	@GetMapping("getuserbyid/{id}")
	public UserDTO listUsers(@PathVariable(name = "id") long id){
		return userService.getUserById(id);
	}
	
	@GetMapping("getusertypebyid/{id}")
	public UserTypeDTO getUserTypeById(@PathVariable(name = "id") long id){
		return userTypeService.getUserTypeById(id);
	}
	
	@GetMapping("deleteuserbyid/{id}")
	public boolean deleteUserById(@PathVariable(name = "id") long id){
		return userService.deleteUserById(id);
	}
	
	@GetMapping("deleteusertypebyid/{id}")
	public boolean deleteUserTypeById(@PathVariable(name = "id") long id){
		return userTypeService.deleteUserById(id);
	}
	
	@PostMapping("createupdateuser")
	public UserDTO createUpsateUser(@RequestBody UserDTO dto) {
		return userService.createUpdateBarTable(dto);
	}
	
	@PostMapping("createupdateusertype")
	public UserTypeDTO createUpsateUserType(@RequestBody UserTypeDTO dto) {
		return userTypeService.createUpdateBarTable(dto);
	}

}
