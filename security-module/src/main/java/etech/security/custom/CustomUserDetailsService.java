package etech.security.custom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import etech.security.core.User;
import etech.security.services.UserService;

public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	UserService userService;

	@Override
	public User loadUserByUsername(String nickname) throws UsernameNotFoundException {

		return userService.getUserByNickname(nickname);

	}
	

}
