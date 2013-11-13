package springmvc.form.allow.submit.duplicate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import springmvc.form.allow.submit.duplicate.model.User;

@Controller
public class FormAllowSubmitDuplicateController {

    @RequestMapping(value = "/springmvc-form-allow-submit-duplicate", method = RequestMethod.GET)
    public ModelAndView doGet()  {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("springmvc/form/allow/submit/duplicate/form");
        mav.addObject("user", new User());
        return mav;
    }

    @RequestMapping(value = "/springmvc-form-allow-submit-duplicate", method = RequestMethod.POST)
    public ModelAndView doPost(User user) {
        ModelAndView mav = new ModelAndView();
        if (user.getUsername().equals("John") && user.getPassword().equals("password")) {
            mav.addObject("status", "success");
        }
        else {
            mav.addObject("status", "fail");
        }
         
        mav.setViewName("springmvc/form/allow/submit/duplicate/result");
        return mav;
    }
}

