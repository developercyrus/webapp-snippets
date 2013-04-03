package springmvc.hello.world.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/springmvc-hello-world")
public class HelloController {

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView anyMethodName() {
		ModelAndView mav = new ModelAndView();
        mav.setViewName("springmvc/hello/world/output");
        mav.addObject("message", "Spring 3 MVC Hello World!");
        return mav;
	}
}