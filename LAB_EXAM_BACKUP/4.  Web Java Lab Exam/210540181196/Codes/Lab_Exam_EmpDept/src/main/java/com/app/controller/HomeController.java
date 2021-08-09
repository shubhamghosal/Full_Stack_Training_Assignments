package com.app.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	public HomeController() {
		System.out.println("in home controller ");
	}
	@GetMapping("/")
	public String test(Model map)
	{
		map.addAttribute("time_stamp", LocalDateTime.now());
		return "/index";
	}
}
