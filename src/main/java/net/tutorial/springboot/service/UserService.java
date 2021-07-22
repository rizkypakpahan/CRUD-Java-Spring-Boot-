package net.tutorial.springboot.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import net.tutorial.springboot.model.User;
import net.tutorial.springboot.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
 User save(UserRegistrationDto registrationDto);
}
