package com.niit.ecommercebackend.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
@Component
@Entity
@Table
public class Product implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4555114967640985965L;
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)//for autonumber

		private int productId;
		private String productName;
		private String brand;
		private int price;
		private String desc;
		private String supplierName;
		private String categoryName;
		
		public Product(int id, String name, String brand, int price, String category, String desc) {
		productId=id;
		this.productName=name;
		this.brand=brand;
		this.price=price;
		this.desc=desc;
		}
		public String getSupplierName() {
			return supplierName;
		}
		public void setSupplierName(String supplierName) {
			this.supplierName = supplierName;
		}
		public String getCategoryName() {
			return categoryName;
		}
		public void setCategoryName(String categoryName) {
			this.categoryName = categoryName;
		}
		@Transient
		private MultipartFile image;
		
		public Product() {
			super();
		}
		public int getProductId() {
			return productId;
		}
		public void setProductId(int productId) {
			this.productId = productId;
		}
		public String getProductName() {
			return productName;
		}
		public void setProductName(String productName) {
			this.productName = productName;
		}
		public String getBrand() {
			return brand;
		}
		public void setBrand(String brand) {
			this.brand = brand;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		
		public String getDesc() {
			return desc;
		}
		public void setDesc(String desc) {
			this.desc = desc;
		}
		public MultipartFile getImage() {
			return image;
		}
		public void setImage(MultipartFile image) {
			this.image = image;
		}
		}


