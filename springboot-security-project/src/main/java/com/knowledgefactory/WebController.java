package com.knowledgefactory;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class WebController {
	@GetMapping({ "/", "/aesview" })
	public String aesview() {

		return "index";
	}
	
	@GetMapping({"/md5view" })
	public String md5view() {

		return "md5";
	}
	
	@GetMapping({"/sha256" })
	public String sha256() {

		return "sha256";
	}
	@GetMapping({"/sha512" })
	public String sha512() {

		return "sha512";
	}

}
