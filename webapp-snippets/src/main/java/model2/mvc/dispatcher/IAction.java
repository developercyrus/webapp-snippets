package model2.mvc.dispatcher;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
public interface IAction {
    public void execute(HttpServletRequest req, HttpServletResponse res);
}