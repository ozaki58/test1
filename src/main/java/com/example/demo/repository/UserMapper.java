package com.example.demo.repository;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo.dto.UserSearchRequest;
import com.example.demo.dto.UserSearchRequest1;
import com.example.demo.entity.Syouhin1;
import com.example.demo.entity.User;
import com.example.demo.entity.User2;
import com.example.demo.entity.User3;
@Mapper
public interface UserMapper {
   
	@Select("SELECT * FROM User WHERE id = #{id}")
	User search(UserSearchRequest1 user);
	 @Select("SELECT * FROM User")
	    List<User> searchAll();
	 @Select("SELECT * FROM User2")
	    List<User2> searchAll1();
	 @Select("SELECT * FROM User3")
	    List<User3> searchAll2();
	@Select("SELECT * FROM Syouhin1 WHERE name = #{name}")
	List<Syouhin1> search1(UserSearchRequest syouhin1);

}
