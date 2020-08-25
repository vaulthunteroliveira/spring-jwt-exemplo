package com.example.auth.security;

import java.util.HashSet;
import java.util.Set;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.auth.enums.Perfil;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		
		if(!email.equals("alexoliveira@email.com")) {
			throw new UsernameNotFoundException(email);
		}
		
		Set<Perfil> set = new HashSet<>(); 
		set.add(Perfil.toEnum(1));
		set.add(Perfil.toEnum(2));
		
		return new UserDetailsImpl(1, "alexoliveira@email.com", "$2y$12$JENMa2QwGCrnB/5lzrjI/u1VyQ.4XLluPIFzCJu/u6ykV1SAxsL6u", set);
	}

}
