package com.niit.ecommercebackend.model;

	import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

	@Entity
	@Component
	@Table
	public class Supplier implements Serializable{
		/**
		 * 
		 */
		private static final long serialVersionUID = -3240974945994275653L;
		@Id
		@Column
		@GeneratedValue(strategy=GenerationType.AUTO)//for autonumber

			private int supplierId;
			private String supplierName;
			private String address;
					
			public Supplier(int id, String name, String address) {
			supplierId=id;
			this.supplierName=name;
			this.address=address;
			
			}

			public Supplier() {
				// TODO Auto-generated constructor stub
			}

			public int getSupplierId() {
				return supplierId;
			}

			public void setSupplierId(int supplierId) {
				this.supplierId = supplierId;
			}

			public String getSupplierName() {
				return supplierName;
			}

			public void setSupplierName(String supplierName) {
				this.supplierName = supplierName;
			}

			public String getAddress() {
				return address;
			}

			public void setAddress(String address) {
				this.address = address;
			}
			}
