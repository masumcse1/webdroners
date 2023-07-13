package com.poortoys.dtos;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * Created by Md. Zohir Raihan on 12/7/2023.
 *
 * Interface that used only for naming convention for methods for services
 */

@RequestScoped
public class CustomerDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@NotNull(message = "customerId is required")
	private Long customerId;
	
	@NotEmpty(message = "customerName is required")
	private String customerName;

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	

}
