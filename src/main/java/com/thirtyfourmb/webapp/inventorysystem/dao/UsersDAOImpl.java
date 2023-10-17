package com.thirtyfourmb.webapp.inventorysystem.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.thirtyfourmb.webapp.inventorysystem.entity.Users;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Repository
public class UsersDAOImpl implements UsersDAO{
    private EntityManager entityManager;
    
    @Autowired
    public UsersDAOImpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    @Override
    public List<Users> findAll() {
        TypedQuery<Users> theQuery = entityManager.createQuery("from Users", Users.class);
        List<Users> users = theQuery.getResultList();
        return users;
    }

    @Override
    public Users findById(int theId) {
        return entityManager.find(Users.class,theId);
    }

    @Override
    public Users save(Users users) {
        return entityManager.merge(users);
    }

    @Override
    public void deleteById(int theId) {
        Users users = entityManager.find(Users.class,theId);
        entityManager.remove(users);
    }
    
}
