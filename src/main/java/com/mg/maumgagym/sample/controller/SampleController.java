package com.mg.maumgagym.sample.controller;

import com.mg.maumgagym.sample.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SampleController {

	@Autowired
	private SampleService sampleService;

	@RequestMapping(value = "/sample/sample", method = {RequestMethod.POST, RequestMethod.GET})
	public ModelAndView sample() {
		ModelAndView mav = new ModelAndView();
		String test = sampleService.selectTest();
		System.out.println(test);
		mav.setViewName("sample/sample");
		return mav;
	}
}
