package com.yc.Controller;

import javax.annotation.Resource;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yc.entity.User;
import com.yc.service.UserService;

@RestController
@EnableAutoConfiguration
public class UserController {

	@Resource
	private UserService userService;
	@RequestMapping("/{id}")
	public User view(@PathVariable("id") Long id){
		User user = new User();
		user.setId(1l);
		user.setName("yc");
		return user;
	}
	
	@RequestMapping("/")
	public String view1(){
		return "Hello,World!";
	}
	
	@RequestMapping("/user/{id}/{name}")
	public String view3(@PathVariable("id") Long id,@PathVariable("name") String name){
		User user = new User();
		user.setId(id);
		user.setName(name);
		userService.save(user);
		return "保存成功";
	}
	
}
