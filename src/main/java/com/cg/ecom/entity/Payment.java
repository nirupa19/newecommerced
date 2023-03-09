package com.cg.ecom.entity;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "payment_details")
public class Payment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int paymentId;
	private LocalDate paymentDate;
	private String paymentType;
	private String paymentStatus;
    private long totalPrice;
    
//    @Transient
//	@OneToOne
//	@JoinColumn(name="payment_cart_fk")
//	private Cart cartId;
	
	@OneToOne
	@JoinColumn(name="payment_order_fk")
	private Orders orderId ;
	
	@ManyToOne
	@JoinColumn(name="payment_customer_fk")
	private Customers customerId;
	
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name="payment_product_fk")
//	private List<ProductItems> productItems ;
	
	

}
