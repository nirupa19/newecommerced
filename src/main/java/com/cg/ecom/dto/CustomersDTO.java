package com.cg.ecom.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
public class CustomersDTO {

    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
	private int customerId;
	private String customerName;
	private String address;
	private Long mobilenumber;
	private String emailId;
	//////////////
//	private String password;
//	private String username;
//	private int userId;

	
}
