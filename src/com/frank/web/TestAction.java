package com.frank.web;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.*;

public class TestAction extends ActionSupport {

    public String login() throws Exception {
        //这是原生的调用
        ServletActionContext.getRequest().setAttribute("username",123);
        ServletActionContext.getRequest().setAttribute("password","abc");
        return null;
    }
}
