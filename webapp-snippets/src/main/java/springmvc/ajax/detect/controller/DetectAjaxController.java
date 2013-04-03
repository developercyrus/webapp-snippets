package springmvc.ajax.detect.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/springmvc-ajax-detect")
public class DetectAjaxController {
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView anyMethodName(HttpServletRequest request, HttpServletResponse response) {
		boolean isAjax = "XMLHttpRequest".equals(request.getHeader("X-Requested-With"));
		
		System.out.println(isAjax);
		
		ModelAndView mav = new ModelAndView();
        mav.setViewName("springmvc/ajax/detect/output");
        mav.addObject("isAjax", isAjax);
        return mav;
	}
}