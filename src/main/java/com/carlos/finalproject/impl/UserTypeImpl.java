package com.carlos.finalproject.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carlos.finalproject.dto.UserDTO;
import com.carlos.finalproject.dto.UserTypeDTO;
import com.carlos.finalproject.persist.UsersAppEntity;
import com.carlos.finalproject.persist.UsersTypeEntity;
import com.carlos.finalproject.repository.UserTypeRepository;
import com.carlos.finalproject.service.UserTypeService;

@Service
public class UserTypeImpl implements UserTypeService {
	
	@Autowired
	UserTypeRepository userTypeRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public List<UserTypeDTO> listUsersTypes(){
		List<UserTypeDTO> listDto = new ArrayList<UserTypeDTO>();
		List<UsersTypeEntity> userTypes = this.userTypeRepository.findAll();
		if(!userTypes.isEmpty()) {
			for (int i = 0; i < userTypes.size(); i++) {
				listDto.add(this.mapDTO(userTypes.get(i)));
			}
		}		
		return listDto;	
	}
	
	public UserTypeDTO getUserTypeById(long id) {
		return mapDTO(this.userTypeRepository.findById(id));
	}
	
	public boolean deleteUserById(long id) {
		this.userTypeRepository.deleteById(id);
		return true;
	}
	
	public UserTypeDTO createUpdateBarTable(UserTypeDTO dto) {
		return mapDTO(this.userTypeRepository.save(this.mapDTO(dto)));
	}
	
	private UserTypeDTO mapDTO(UsersTypeEntity entitie) {
		return this.modelMapper.map(entitie, UserTypeDTO.class);
	}
	
	private UserTypeDTO mapDTO(Optional<UsersTypeEntity> entitie) {
		return this.modelMapper.map(entitie, UserTypeDTO.class);
	}
	
	private UsersTypeEntity mapDTO(UserTypeDTO dto) {
		return this.modelMapper.map(dto, UsersTypeEntity.class);
	}

}
