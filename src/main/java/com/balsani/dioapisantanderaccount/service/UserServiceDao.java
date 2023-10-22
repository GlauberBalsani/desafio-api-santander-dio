package com.balsani.dioapisantanderaccount.service;

import com.balsani.dioapisantanderaccount.domain.model.User;

public interface UserServiceDao {
    User findById(Long id);

    User create(User userToCreate);
}
