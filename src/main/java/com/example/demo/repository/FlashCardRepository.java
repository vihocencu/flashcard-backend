package com.example.demo.repository;

import java.util.List;

import com.example.demo.model.FlashCard;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface FlashCardRepository extends JpaRepository<FlashCard, Integer> {

	@Query("SELECT DISTINCT category FROM FlashCard")
	@Transactional(readOnly = true)
	List<String> findCategories();

	@Query("SELECT fc FROM FlashCard fc WHERE fc.category LIKE :category%")
	@Transactional(readOnly = true)
	List<FlashCard> findByCategory(@Param("category") String category);

}