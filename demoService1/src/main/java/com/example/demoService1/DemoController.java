package com.example.demoService1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoController {



	@GetMapping("/employees")
	public String retrieveAddressForEmployee() {
		return "Abhishek....";

	}

}
