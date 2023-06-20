package com.nimapinfotech.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer productId;
	private String productName;
	private Double productPrice;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "CATEGORY_ID", nullable = false)
	private Category category;

}
