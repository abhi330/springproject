package com.example.feign.Controller;

import java.util.Optional;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.feign.Respository.UserRepository;
import com.example.feign.model.user;

@RestController
@RequestMapping("/swag")
public class UserController {
	@Autowired
	private UserRepository userrepo;
	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}
	@PostMapping("/user")
	public user postuser(@RequestBody user body) {
	
		userrepo.save(body);
		return body;
		
	}
	
	@GetMapping("/user/{id}")
	public user getuser(@PathVariable("id") int id) {
		
	Optional<user> use= userrepo.findById(id);
	if(use.isPresent())
		return use.get();
	else
		return new user(0,"no user found");
		
		
	}
	@PutMapping("/user/{id}")
	public user updateuser(@PathVariable("id") int id, @RequestBody user u) {
     user us=userrepo.findById(id).get();
     us.setName(u.getName());
     return userrepo.save(us);
		
	}
	
	@DeleteMapping("/user/{id}")
	public String deleteuser(@PathVariable int id) {
		 userrepo.deleteById(id);
		 return "deleted";
	}

}
