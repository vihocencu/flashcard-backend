package com.example.demo.repository;

import java.util.List;

import com.example.demo.model.FlashCard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/flashCards")
class FlashCardController {

	@Autowired
	private FlashCardRepository flashCards;

	@GetMapping("/findByCategory/{category}")
	public List<FlashCard> findByCategory(@PathVariable("category") String category) {
		// log.info("Inside find by category");
		return flashCards.findByCategory(category);
	}

	@GetMapping("/findCategories")
	public List<String> findCategories() {
		// log.info("Inside find categories");
		return flashCards.findCategories();
	}

}