package com.jpa.example.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name= "employees")

public class Employeedetails {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

    private String Employee_Name;
    
    private String Email;
   
    private String MobileNumber;
	
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmployee_Name() {
		return Employee_Name;
	}
	public void setEmployee_Name(String employee_Name) {
		Employee_Name = employee_Name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getMobileNumber() {
		return MobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		MobileNumber = mobileNumber;
	}
	@Override
	public String toString() {
		return "Employeedetails [id=" + id + ", Employee_Name=" + Employee_Name + ", Email=" + Email + ", MobileNumber="
				+ MobileNumber + "]";
	}
  

}
