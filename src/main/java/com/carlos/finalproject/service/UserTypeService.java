package com.carlos.finalproject.service;

import java.util.List;

import com.carlos.finalproject.dto.UserTypeDTO;

public interface UserTypeService {
	
	public List<UserTypeDTO> listUsersTypes();
	public UserTypeDTO getUserTypeById(long id);
	public boolean deleteUserById(long id);
	public UserTypeDTO createUpdateBarTable(UserTypeDTO dto);

}
