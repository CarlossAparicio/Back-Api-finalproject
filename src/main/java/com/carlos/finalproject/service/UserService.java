package com.carlos.finalproject.service;

import java.util.List;

import com.carlos.finalproject.dto.UserDTO;

public interface UserService {
	
	public List<UserDTO> listUsers();
	public UserDTO getUserById(long id);
	public boolean deleteUserById(long id);
	public UserDTO createUpdateBarTable(UserDTO dto);

}
