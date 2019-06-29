package com.frank.web;

import com.frank.Service.UserService;
import com.frank.domain.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.ServletActionContext;

import javax.servlet.Servlet;
import javax.servlet.ServletContext;

public class UserAction extends ActionSupport implements ModelDriven<User> {
    User user = new User();
    public String login() throws Exception {
        System.out.println("Login 方法调用");
        UserService userService = new UserService();
        boolean success = userService.findUser(user);
        if(success)
        {
            return "success";
        }
        else {
            ServletActionContext.getRequest().setAttribute("error","项目名或者密码错误");
            return "error";
        }
    }

    public String register() throws Exception {
        System.out.println("register 方法调用");
        return null;
    }
    @Override
    public User getModel() {
        return user;
    }
}
