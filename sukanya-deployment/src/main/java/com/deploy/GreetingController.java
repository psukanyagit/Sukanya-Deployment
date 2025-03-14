package com.deploy;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class GreetingController {
	
	@GetMapping("/greeting")
    public String greeting(Model model) {
        model.addAttribute("message", "Welcome to our website!");
        return "<html>\r\n"
        		+ "<body>\r\n"
        		+ "<h1><font color='red'> Welcome to Sumadhuri Kanya IT - Software Training Institute <font></h1>\r\n"
        		+ "\r\n"
        		+ "<a href=\"www.ashokit.in\">Click Here To See sumadhuri IT Training Schedules</a>\r\n"
        		+ "  \r\n"
        		+ "  <h2> Call Us : +91-99 99 99 99 99  </h2>\r\n"
        		+ "  \r\n"
        		+ "  <h3> Our Ofc Location : California, United States of America </h3>\r\n"
        		+ "\r\n"
        		+ "</body>\r\n"
        		+ "</html>"; // Thymeleaf template name (greeting.html)
    }

}
