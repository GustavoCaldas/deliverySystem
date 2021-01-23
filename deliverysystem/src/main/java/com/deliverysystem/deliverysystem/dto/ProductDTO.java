package com.deliverysystem.deliverysystem.dto;

import java.io.Serializable;

import com.deliverysystem.deliverysystem.entities.Product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Getter private Long id;
	@Getter @Setter private String name;
	@Getter @Setter private Double price;
	@Getter @Setter private String description;
	@Getter @Setter private String imageUri;
	
	public ProductDTO(Product entity) {
		super();
		this.id = entity.getId();
		this.name = entity.getName();
		this.price = entity.getPrice();
		this.description = entity.getDescription();
		this.imageUri = entity.getImageUri();
	}
}
