package com.masai.MGNAREGA.Entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Worker {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer workerId;
	private String aadhaarNumber;
	private String name;
	private LocalDate dob;
	private String gender;
	private String panchayatName;
	private String district;
	private String state;
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Project> projectlist;
	
	
	public Worker() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Worker(String aadhaarNumber, String name, LocalDate dob, String gender, String panchayatName,
			String district, String state, List<Project> projectlist) {
		super();
		this.aadhaarNumber = aadhaarNumber;
		this.name = name;
		this.dob = dob;
		this.gender = gender;
		this.panchayatName = panchayatName;
		this.district = district;
		this.state = state;
		this.projectlist = projectlist;
	}


	public Integer getWorkerId() {
		return workerId;
	}


	public void setWorkerId(Integer workerId) {
		this.workerId = workerId;
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


	public List<Project> getProjectlist() {
		return projectlist;
	}


	public void setProjectlist(List<Project> projectlist) {
		this.projectlist = projectlist;
	}


	@Override
	public String toString() {
		return "Worker [workerId=" + workerId + ", aadhaarNumber=" + aadhaarNumber + ", name=" + name + ", dob=" + dob
				+ ", gender=" + gender + ", panchayatName=" + panchayatName + ", district=" + district + ", state="
				+ state + ", projectlist=" + projectlist + "]";
	}

	
	
	

}
