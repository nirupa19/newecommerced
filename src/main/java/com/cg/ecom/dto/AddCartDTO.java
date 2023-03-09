package com.cg.ecom.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class AddCartDTO 
{
	private int productId;
	private int quantity;
	private int customerId;
	

}
