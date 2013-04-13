package webjar.include.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/webjar-include")
public class AController {

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView anyMethodName() {
		ModelAndView mav = new ModelAndView();
        mav.setViewName("webjar/include/output");
        mav.addObject("message", "redirected");
        return mav;
	}
}