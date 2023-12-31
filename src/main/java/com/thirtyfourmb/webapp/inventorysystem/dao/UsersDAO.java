package com.thirtyfourmb.webapp.inventorysystem.dao;

import java.util.List;

import com.thirtyfourmb.webapp.inventorysystem.entity.Users;

public interface UsersDAO {
    List<Users> findAll();
    Users findById(int theId);
    Users save(Users users);
    void deleteById(int theId);
}
