package com.juliechan.hellohuman;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HumanController {
	
	// DEFAULT - HELLO HUMAN
	@RequestMapping("/")
	public String index(@RequestParam(value="q", required=false) String searchQuery) {
		return "Hello human";
	}
	
	// INPUT ENTERED, FIRST & LAST
	@RequestMapping("/{first}/{last}")
	public String enter(@PathVariable("first") String first, @PathVariable("last") String last) {
		return "Hello " + first + " " + last + "!";
	}
}
