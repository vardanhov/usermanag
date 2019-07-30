package com.example.usermanger.repo;

import com.example.usermanger.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Long> {
    @Modifying
    @Query("update User u set u.name = ?1, u.surname = ?2 where u.id = ?3")
    void setUserInfoById(String name, String surname, Long id);
}
