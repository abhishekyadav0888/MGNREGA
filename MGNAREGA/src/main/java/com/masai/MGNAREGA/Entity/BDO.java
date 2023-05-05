package com.masai.MGNAREGA.Entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class BDO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer bdoId;
	private String aadhaarNumber;
	private String name;
	private LocalDate dob;
	private String gender;
	private String panchayatName;
	private String district;
	private String state;
	
	public Integer getBdoId() {
		return bdoId;
	}
	public void setBdoId(Integer bdoId) {
		this.bdoId = bdoId;
	}
	public String getAadhaarNumber() {
		return aadhaarNumber;
	}
	public void setAadhaarNumber(String aadhaarNumber) {
		this.aadhaarNumber = aadhaarNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPanchayatName() {
		return panchayatName;
	}
	public void setPanchayatName(String panchayatName) {
		this.panchayatName = panchayatName;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public BDO(String aadhaarNumber, String name, LocalDate dob, String gender, String panchayatName, String district,
			String state) {
		super();
		this.aadhaarNumber = aadhaarNumber;
		this.name = name;
		this.dob = dob;
		this.gender = gender;
		this.panchayatName = panchayatName;
		this.district = district;
		this.state = state;
	}
	public BDO() {
		super();
		// TODO Auto-generated constructor stub
	}

}
