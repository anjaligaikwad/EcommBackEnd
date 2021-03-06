package com.niit.ecommercebackend.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table
public class ShippingAddress implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3900690580793605890L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int shippingid;

	@Column

	private String flatno;

	@Column

	private String buildingname;

	@Column

	private String localityname;

	@Column

	private String landmark;

	@Column

	private String cityname;

	@Column

	private String statename;

	@Column

	private String countryname;

	@Column

	private String zipcode;

	@OneToOne(mappedBy = "shippingAddress")
	private UserCustomer user;

	public int getShippingid() {
		return shippingid;
	}

	public void setShippingid(int shippingid) {
		this.shippingid = shippingid;
	}

	public String getFlatno() {
		return flatno;
	}

	public void setFlatno(String flatno) {
		this.flatno = flatno;
	}

	public String getBuildingname() {
		return buildingname;
	}

	public void setBuildingname(String buildingname) {
		this.buildingname = buildingname;
	}

	public String getLocalityname() {
		return localityname;
	}

	public void setLocalityname(String localityname) {
		this.localityname = localityname;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getCityname() {
		return cityname;
	}

	public void setCityname(String cityname) {
		this.cityname = cityname;
	}

	public String getStatename() {
		return statename;
	}

	public void setStatename(String statename) {
		this.statename = statename;
	}

	public String getCountryname() {
		return countryname;
	}

	public void setCountryname(String countryname) {
		this.countryname = countryname;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public UserCustomer getUser() {
		return user;
	}

	public void setUser(UserCustomer user) {
		this.user = user;
	}

	
}
