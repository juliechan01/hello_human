package com.juliechan.hellohuman;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HumanController {
	
	// DEFAULT - HELLO HUMAN
	@RequestMapping("/")
	public String index(@RequestParam(value="q", required=false) String searchQuery,
	                    @RequestParam(value="times", required=false, defaultValue="1") int times) {
	    StringBuilder sb = new StringBuilder();
	    for (int i = 0; i < times; i++) {
	        sb.append("Hello human<br>");
	    }
	    return sb.toString();
	}

	
	// INPUT ENTERED, FIRST & LAST
	@RequestMapping("/{first}/{last}")
	public String enter(@PathVariable("first") String first, @PathVariable("last") String last, @RequestParam(value="q", required=false) String searchQuery,
            @RequestParam(value="times", required=false, defaultValue="1") int times) {
		StringBuilder sb = new StringBuilder();
	    for (int i = 0; i < times; i++) {
	        sb.append("Hello " + first + " " + last + "! <br>");
	    }
	    return sb.toString();
	}
}
