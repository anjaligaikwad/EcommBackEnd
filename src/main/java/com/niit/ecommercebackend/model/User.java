package com.niit.ecommercebackend.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table
public class User {
@Id
				private int User_Id;

				private String User_Name;
	
				private String User_Email;

				private String Password;
	
				private String  Phone_Number;

				private String User_role;

			
				public User(int id, String name, String email, String password, String phonenumber,String role) {
					User_Id=id;
				this.User_Name=name;
				this.User_Name=email;
				this.Password=password;
				this.Phone_Number=phonenumber;
				this.User_role=role;
				}


				public User() {
					// TODO Auto-generated constructor stub
				}


				public int getUser_Id() {
					return User_Id;
				}


				public String getUser_role() {
					return User_role;
				}


				public void setUser_role(String user_role) {
					User_role = user_role;
				}


				public void setUser_Id(int user_Id) {
					User_Id = user_Id;
				}


				public String getUser_Name() {
					return User_Name;
				}


				public void setUser_Name(String user_Name) {
					User_Name = user_Name;
				}


				public String getUser_Email() {
					return User_Email;
				}


				public void setUser_Email(String user_Email) {
					User_Email = user_Email;
				}


				public String getPassword() {
					return Password;
				}


				public void setPassword(String password) {
					Password = password;
				}


				public String getPhone_Number() {
					return Phone_Number;
				}


				public void setPhone_Number(String phone_Number) {
					Phone_Number = phone_Number;
				}
				
}
