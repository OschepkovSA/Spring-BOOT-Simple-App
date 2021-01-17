package ru.company.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ru.company.repository.UserRepositrory;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private UserRepositrory userRepositrory;

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepositrory.findByUsername(username);
    }
}
