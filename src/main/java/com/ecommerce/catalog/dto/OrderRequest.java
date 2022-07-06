package com.ecommerce.catalog.dto;


import com.ecommerce.catalog.model.Category;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderRequest {

	private Category category;

	public Category getCategory() {
		return category;
	}
}
