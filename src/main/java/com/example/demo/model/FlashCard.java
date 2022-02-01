
package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "flash_cards")
public class FlashCard {

	@Column(name = "left_side")
	@NotEmpty
	private String leftSide;

	@Column(name = "right_side")
	@NotEmpty
	private String rightSide;

	@Column(name = "category")
	@NotEmpty
	private String category;

	public String getLeftSide() {
		return this.leftSide;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setLeftSide(String leftSide) {
		this.leftSide = leftSide;
	}

	public String getRightSide() {
		return this.rightSide;
	}

	public void setRightSide(String rightSide) {
		this.rightSide = rightSide;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

}