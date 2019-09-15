package com.knowledgefactory;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
	@GetMapping({ "/", "/rsaview" })
	public String rsaview() {

		return "index";
	}

}
