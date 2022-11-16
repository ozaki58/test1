package com.example.demo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.UserSearchRequest;
import com.example.demo.dto.UserSearchRequest1;
import com.example.demo.entity.Syouhin1;
import com.example.demo.entity.User;
import com.example.demo.entity.User2;
import com.example.demo.entity.User3;
import com.example.demo.repository.UserMapper;


@Service
public class UserService {
   
	
    @Autowired
    private UserMapper userMapper;
  //条件にあったものをとってくる
   
    
        public List<Syouhin1> search1(UserSearchRequest userSearchRequest) {
        	
            return userMapper.search1(userSearchRequest);
        }

public User search(UserSearchRequest1 userSearchRequest1) {
	
    return userMapper.search(userSearchRequest1);
}
public List<User> searchAll(){
    return userMapper.searchAll();
   
}
public List<User2> searchAll1(){
    return userMapper.searchAll1();
}
    public List<User3> searchAll2(){
        return userMapper.searchAll2();
    }
}

