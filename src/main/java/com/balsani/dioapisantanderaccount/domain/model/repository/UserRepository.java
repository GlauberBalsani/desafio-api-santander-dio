package com.balsani.dioapisantanderaccount.domain.model.repository;

import com.balsani.dioapisantanderaccount.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
