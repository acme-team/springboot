package com.yc.service.imp;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yc.entity.User;
import com.yc.repository.UserRepository;
import com.yc.service.UserService;

@Service
public class UserServiceImp implements UserService{

	@Resource
	private UserRepository userRepository;
	
	@Override
	@Transactional
	public void save(User user){
		userRepository.save(user);
	}
}
