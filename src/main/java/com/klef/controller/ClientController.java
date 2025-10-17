package com.klef.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class ClientController {
	@GetMapping("/")
	public String demo(){
		return "welcome to jenkins";
	}
}
