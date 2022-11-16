package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.dto.UserSearchRequest;
import com.example.demo.dto.UserSearchRequest1;
import com.example.demo.entity.Syouhin1;
import com.example.demo.entity.User;
import com.example.demo.entity.User2;
import com.example.demo.entity.User3;
import com.example.demo.service.UserService;

@Controller
public class UserController {
  
  @Autowired
  UserService userService;
 
  @GetMapping(value = "/user/search2")
  public String displaySearch2(Model model) {
	  List<User> userlist = userService.searchAll();
	  model.addAttribute("userlist", userlist);
    return "user/search2";
  }
  @GetMapping(value = "/user/search3")
  public String displaySearch3(Model model) {
	  List<User2> userlist1 = userService.searchAll1();
	  model.addAttribute("userlist1", userlist1);
    return "user/search3";
  }
  @GetMapping(value = "/user/search4")
  public String displaySearch4(Model model) {
	  List<User3> userlist2 = userService.searchAll2();
	  model.addAttribute("userlist2", userlist2);
    return "user/search4";
  }
  @GetMapping(value = "/user/search5")
  public String displaySearch5(Model model) {
	  List<User> userlist = userService.searchAll();
	  model.addAttribute("userlist", userlist);
    return "user/search5";
  }
 
  @GetMapping(value = "/user/search")
  public String displaySearch(Model model) {
    return "user/search";
  }
  @GetMapping(value = "/user/search1")
  public String displaySearch1(Model model) {
    return "user/search1";
  }

  
  @GetMapping(value = "/user/menyu")
  public String displayMenyu(Model model) {
	  List<User> userlist = userService.searchAll();
	  model.addAttribute("userlist", userlist);
    return "user/menyu";
  }

  @RequestMapping(value = "/user/id_search1", method = RequestMethod.POST)
  public String search1(@ModelAttribute UserSearchRequest userSearchRequest, Model model) {
	  List<Syouhin1> use = userService.search1(userSearchRequest);
	    model.addAttribute("syouhin", use);
	    return "user/search1";
	  }

  @RequestMapping(value = "/user/id_search", method = RequestMethod.POST)
  public String search(@ModelAttribute UserSearchRequest1 userSearchRequest1, Model model) {
    User user = userService.search(userSearchRequest1);
    model.addAttribute("userinfo", user);
    return "user/search";
  
}
  
  
}