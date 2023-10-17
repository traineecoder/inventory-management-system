package com.thirtyfourmb.webapp.inventorysystem.service;

import java.util.List;

import com.thirtyfourmb.webapp.inventorysystem.entity.Users;

public interface UsersService {
    List<Users> findAll();
    Users findById(int theId);
    Users save(Users users);
    void deleteById(int theId);
}
