package com.poortoys.dtos;

import java.io.Serializable;

/**
 * Created by Md. Zohir Raihan on 12/7/2023.
 *
 * Interface that used only for naming convention for methods for services
 */

public class CustomerDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private long customerId;
	
	private String customerName;

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	

}
