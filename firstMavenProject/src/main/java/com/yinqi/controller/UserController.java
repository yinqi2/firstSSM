package com.yinqi.controller;

import com.yinqi.bean.User;
import com.yinqi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    @Qualifier("userService")
    private UserService userService;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    private String addUserUI(){
        return "/add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    private String addUser(User user, Model model) throws Exception {
        int flag = userService.insertUser(user);
        model.addAttribute("user", user);
        if (flag == 1){
            return "/success";
        }
        return "add";
    }

    @RequestMapping(value = "/findByName", method = RequestMethod.GET)
    private String findByNameUI(){
        return "/query";
    }

    @RequestMapping(value = "/findByName", method = RequestMethod.POST)
    private String findByName(@RequestParam("username") String username, Model model){

        model.addAttribute("username", username);
        List<User> list = userService.findByname(username);
        if (list != null || list.size()>0){
            System.out.println(list.get(0));
            return "/success";
        }
        return "/query";
    }
}
