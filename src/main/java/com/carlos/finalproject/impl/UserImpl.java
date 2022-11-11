package com.carlos.finalproject.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carlos.finalproject.dto.UserDTO;
import com.carlos.finalproject.persist.UsersAppEntity;
import com.carlos.finalproject.repository.UserRepository;
import com.carlos.finalproject.service.UserService;

@Service
public class UserImpl implements UserService {
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public List<UserDTO> listUsers(){
		List<UserDTO> listDto = new ArrayList<UserDTO>();
		List<UsersAppEntity> users = this.userRepository.findAll();
		if(!users.isEmpty()) {
			for (int i = 0; i < users.size(); i++) {
				listDto.add(this.mapDTO(users.get(i)));
			}
		}		
		return listDto;	
	}
	
	public UserDTO getUserById(long id) {
		return mapDTO(this.userRepository.findById(id));
	}
	
	public boolean deleteUserById(long id) {
		this.userRepository.deleteById(id);
		return true;
	}
	
	public UserDTO createUpdateBarTable(UserDTO dto) {
		return mapDTO(this.userRepository.save(this.mapDTO(dto)));
	}
	
	private UserDTO mapDTO(UsersAppEntity entitie) {
		return this.modelMapper.map(entitie, UserDTO.class);
	}
	
	private UserDTO mapDTO(Optional<UsersAppEntity> entitie) {
		return this.modelMapper.map(entitie, UserDTO.class);
	}
	
	private UsersAppEntity mapDTO(UserDTO dto) {
		return this.modelMapper.map(dto, UsersAppEntity.class);
	}

}
