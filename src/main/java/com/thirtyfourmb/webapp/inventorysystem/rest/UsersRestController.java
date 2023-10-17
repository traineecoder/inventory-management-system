package com.thirtyfourmb.webapp.inventorysystem.rest;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thirtyfourmb.webapp.inventorysystem.entity.Users;
import com.thirtyfourmb.webapp.inventorysystem.service.UsersService;

@RestController
@RequestMapping("/api")
public class UsersRestController {
    private UsersService usersService;

    @Autowired
    public UsersRestController(UsersService usersService){
        this.usersService = usersService;
    }

    @GetMapping("/users")
    public List<Users> findAll(){
        return usersService.findAll();
    }
    @GetMapping("/users/{userId}")
    public Users findById(@PathVariable int userId) {
        return usersService.findById(userId);
    }

    @PostMapping("/users")
    public Users addUsers(@RequestHeader Users users){
        users.setId(0);
        return usersService.save(users);
    }
    @PutMapping("/users")
    public Users updateUsers(@RequestHeader Users users)
    {
        return usersService.save(users);
    }

    @DeleteMapping("/users/{userId}")
    public String deleteUsers(@PathVariable int userId)
    {
        usersService.deleteById(userId);
        return "Users "+ userId+ " has been Deleted.";
    }
}
