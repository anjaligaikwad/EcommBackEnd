package com.niit.ecommercebackend.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table
public class Category implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3619850196894003850L;
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO) // for autonumber

	private int categoryId;
	private String categoryName;
	private String desc;

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

}
