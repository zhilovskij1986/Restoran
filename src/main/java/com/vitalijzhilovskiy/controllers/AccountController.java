package com.vitalijzhilovskiy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "account")

public class AccountController {
    @RequestMapping(method = RequestMethod.GET)
    public String index(){
        return "account/index";
    }
    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String login(
            @RequestParam("username") String username,
            @RequestParam("password") String password,
            HttpSession session,
            ModelMap modelMap){
        if (username.equalsIgnoreCase("user")&& password.equalsIgnoreCase("123")){
            session.setAttribute("username", username);
            return "account/index";
        }else {
            modelMap.put("error" , "Invalid Acount");
            return "account/index";
        }
    }
    @RequestMapping(value = "order", method = RequestMethod.GET)
    public String order(HttpSession session){
        session.removeAttribute("username");
        return "redirect:../account";
    }
}
