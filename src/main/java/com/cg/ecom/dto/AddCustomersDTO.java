package com.cg.ecom.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddCustomersDTO 
{

	private String customerName;
	private String address;
	private Long mobilenumber;
	private String emailId;
}
