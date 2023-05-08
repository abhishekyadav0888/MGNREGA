package com.masai.MGNAREGA.Entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class GPM {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer gpmId;
	private String userIdGPM;
	private String passwordGPM;
	private String aadhaarNumber;
	private String name;
	private LocalDate dob;
	private String gender;
	private String panchayatName;
	private String district;
	private String state;
	private Integer is_deleted;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Project> allocatedProject;
    
	public GPM() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GPM(String userIdGPM, String passwordGPM, String aadhaarNumber, String name, LocalDate dob, String gender,
			String panchayatName, String district, String state, Integer is_deleted, List<Project> allocatedProject) {
		super();
		this.userIdGPM = userIdGPM;
		this.passwordGPM = passwordGPM;
		this.aadhaarNumber = aadhaarNumber;
		this.name = name;
		this.dob = dob;
		this.gender = gender;
		this.panchayatName = panchayatName;
		this.district = district;
		this.state = state;
		this.is_deleted = is_deleted;
		this.allocatedProject = allocatedProject;
	}

	public Integer getGpmId() {
		return gpmId;
	}

	public void setGpmId(Integer gpmId) {
		this.gpmId = gpmId;
	}

	public String getUserIdGPM() {
		return userIdGPM;
	}

	public void setUserIdGPM(String userIdGPM) {
		this.userIdGPM = userIdGPM;
	}

	public String getPasswordGPM() {
		return passwordGPM;
	}

	public void setPasswordGPM(String passwordGPM) {
		this.passwordGPM = passwordGPM;
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

	public Integer getIs_deleted() {
		return is_deleted;
	}

	public void setIs_deleted(Integer is_deleted) {
		this.is_deleted = is_deleted;
	}

	public List<Project> getAllocatedProject() {
		return allocatedProject;
	}

	public void setAllocatedProject(List<Project> allocatedProject) {
		this.allocatedProject = allocatedProject;
	}

	@Override
	public String toString() {
		return "GPM [gpmId=" + gpmId + ", userIdGPM=" + userIdGPM + ", passwordGPM=" + passwordGPM + ", aadhaarNumber="
				+ aadhaarNumber + ", name=" + name + ", dob=" + dob + ", gender=" + gender + ", panchayatName="
				+ panchayatName + ", district=" + district + ", state=" + state + ", is_deleted=" + is_deleted
				+ ", allocatedProject=" + allocatedProject + "]";
	}



	

    
	

	
	
	
}
