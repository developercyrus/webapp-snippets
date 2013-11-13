package springmvc.form.disallow.submit.duplicate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import springmvc.form.disallow.submit.duplicate.model.User;

@Controller
public class FormDisallowSubmitDuplicateController {

    @RequestMapping(value = "/springmvc-form-disallow-submit-duplicate", method = RequestMethod.GET)
    public ModelAndView doGet()  {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("springmvc/form/disallow/submit/duplicate/form");
        mav.addObject("user", new User());
        return mav;
    }

    @RequestMapping(value = "/springmvc-form-disallow-submit-duplicate", method = RequestMethod.POST)
    public ModelAndView doPost(User user) {
        ModelAndView mav = new ModelAndView();
        mav.addObject("username", user.getUsername());
        if (user.getUsername().equals("Peter") && user.getPassword().equals("password")) {
            mav.addObject("status", "success");
        }
        else {
            mav.addObject("status", "fail");
        }
        
        mav.setView(new RedirectView("resultAction.do"));
        return mav;
    }
    
    @RequestMapping(value = "/resultAction", method = RequestMethod.GET)
    public ModelAndView doGet2(User user)  {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("springmvc/form/disallow/submit/duplicate/result");
        return mav;
    }
}

