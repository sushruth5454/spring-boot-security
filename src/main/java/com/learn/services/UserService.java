package com.learn.services;

import com.learn.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    List<User>users=new ArrayList<>();

    public UserService() {
        users.add(new User("sush","tada","sush@gmail.com"));
        users.add(new User("ram","ramya","ram@gmail.com"));
    }
    public List<User> getAllUsers(){
        return  this.users;
    }
    public User getUser(String userName){
        for(User user:users){
            if(user.getUserName().equals(userName))
                return user;
        }
        return null;

    }
    public User addUser(User user){
        users.add(user);
        return  user;
    }
}
