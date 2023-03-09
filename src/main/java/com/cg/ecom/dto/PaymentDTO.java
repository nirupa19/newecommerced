package com.cg.ecom.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PaymentDTO {

	private int paymentId;
	private LocalDate paymentDate;
	private String paymentType;
	private String paymentStatus;
	///////////
	private int cartId;
	private int orderId;
	private int productId;
	private int customerId;
	private long totalPrice;


}
