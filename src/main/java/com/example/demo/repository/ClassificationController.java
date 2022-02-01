package com.example.demo.repository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ClassificationController {

	@PostMapping("/classifications/")
	public String saveClassification(@RequestBody String classificationEntity) {

		return "AAAA";
	}

	@GetMapping("/classifications/{id}")
	public String findClassificationByOrder(@PathVariable("id") String order) {
		return order;
	}

}
