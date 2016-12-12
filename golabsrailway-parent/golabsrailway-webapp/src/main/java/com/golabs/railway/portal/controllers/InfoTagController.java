package com.golabs.railway.portal.controllers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.StringJoiner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.WebApplicationContext;

@Controller
@RequestMapping("/info")
public class InfoTagController extends GolabsRailwayWebAppWCI {

	@Autowired
	WebApplicationContext webApplicationContext;
	
	private final static LocalDateTime startDateTime = LocalDateTime.now();
	private final static DateTimeFormatter DT_FORMATTER = DateTimeFormatter.ofPattern("EEE, d MM yyyy h:mm a");
	
	@RequestMapping("/server")
	@ResponseBody
	public String infoTagServer() {
		return new StringJoiner("<br>")
				.add("................................")
				.add("Server: " + webApplicationContext.getServletContext().getServerInfo())
				.add("Start date: " + startDateTime.format(DT_FORMATTER))
				.add("Version: " + webApplicationContext.getBean("webAppVersion"))
				.add(".................................")
				.toString();
	}
	
	@RequestMapping("/helloHandler")
	@ResponseBody
	public String helloController() {
		return "hello";
	}
}
