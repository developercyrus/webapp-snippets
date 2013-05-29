package model2.mvc.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model2.mvc.dispatcher.IAction;

public class WelcomeAction implements IAction {

    @Override
    public void execute(HttpServletRequest req, HttpServletResponse res) {
        RequestDispatcher dispatcher = req.getRequestDispatcher("/model2/mvc/view/welcome.jsp");

        try {
            dispatcher.forward(req, res);
        } 
        catch (ServletException e) {
        } 
        catch (IOException e) {
        }
    }
}