package com.thirtyfourmb.webapp.inventorysystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thirtyfourmb.webapp.inventorysystem.dao.UsersDAO;
import com.thirtyfourmb.webapp.inventorysystem.entity.Users;

@Service
public class UsersServiceImpl implements UsersService{
    private UsersDAO usersDAO;

    @Autowired
    public UsersServiceImpl(UsersDAO usersDAO){
        this.usersDAO = usersDAO;
    }

    @Override
    public List<Users> findAll() {
        return usersDAO.findAll();
    }

    @Override
    public Users findById(int theId) {
        return usersDAO.findById(theId);
    }

    @Transactional
    @Override
    public Users save(Users users) {
        return usersDAO.save(users);
    }

    @Transactional
    @Override
    public void deleteById(int theId) {
        usersDAO.deleteById(theId);
    }
}
