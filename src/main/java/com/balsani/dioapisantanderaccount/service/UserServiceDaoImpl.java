package com.balsani.dioapisantanderaccount.service;

import com.balsani.dioapisantanderaccount.domain.model.User;
import com.balsani.dioapisantanderaccount.domain.model.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceDaoImpl implements UserServiceDao {
    private final UserRepository userRepository;

    public UserServiceDaoImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {

        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {

        return userRepository.save(userToCreate);
    }
}
