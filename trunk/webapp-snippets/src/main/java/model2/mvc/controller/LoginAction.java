package model2.mvc.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model2.mvc.dispatcher.IAction;

public class LoginAction implements IAction {
    @Override
    public void execute(HttpServletRequest req, HttpServletResponse res) {
        try {
            req.setCharacterEncoding("utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        RequestDispatcher dispatcher = null; 

        if (username != null && password != null && username.equals("cyrus") && password.equals("123456")) {
            Map model = new HashMap();
            model.put("username", username);
            model.put("secret", "haha");

            req.setAttribute("model", model);
            dispatcher = req.getRequestDispatcher("/model2/mvc/view/success.jsp");
        }
        else {
            req.setAttribute("fail", "username/password not match");
            dispatcher = req.getRequestDispatcher("/model2/mvc/view/fail.jsp");
        }

        try {
            dispatcher.forward(req, res);
        } 
        catch (ServletException e) {
        } 
        catch (IOException e) {
        }
    }
}
