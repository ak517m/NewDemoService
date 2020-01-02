package com.example.demoService1;

import java.util.ArrayList;
import java.util.List;

import org.assertj.core.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoController {



	@GetMapping("/employees")
	public String retrieveAddressForEmployee() {
		return "Abhishek....";

	}

}
