package springmvc.jmeter.http.request.param.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class JMeterHttpRequestController {

	@RequestMapping(value = "/springmvc-jmeter-http-request-param", method = RequestMethod.GET)  
	public ModelAndView anyMethodName(@RequestParam("id") int id) {  
		ModelAndView mav = new ModelAndView();
        mav.setViewName("springmvc/jmeter/http/request/param/output");
        mav.addObject("message", id);
        System.out.println(id);
        return mav;
	} 
}
