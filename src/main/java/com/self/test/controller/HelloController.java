package com.self.test.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@RequestMapping(value = "/greeting/{name}", consumes = MediaType.ALL_VALUE, produces = MediaType.ALL_VALUE)
	public @ResponseBody String greeting(@PathVariable("name") String name) {
		return "Hello " + name;
	}

}
