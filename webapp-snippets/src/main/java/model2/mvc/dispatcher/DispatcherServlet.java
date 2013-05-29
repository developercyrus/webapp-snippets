package model2.mvc.dispatcher;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model2.mvc.controller.LoginAction;
import model2.mvc.controller.WelcomeAction;
  
public class DispatcherServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private Invoker invoker;
    
    @Override
    public void init() throws ServletException {
        invoker = new Invoker();
        invoker.addCommand("/welcome.action", new WelcomeAction());
        invoker.addCommand("/login.action", new LoginAction());
        invoker.setDefaultPage("/welcome.action");
    }
     
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        invoker.request(req, res);
    }
    
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        doPost(req, res);
    } 
}