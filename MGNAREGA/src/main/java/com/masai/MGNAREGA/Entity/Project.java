package com.masai.MGNAREGA.Entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Project {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String projectName;
	private LocalDate startDate;
	private LocalDate endDate;
	private Integer noOfWorkers;
	private Integer per_day_wages;
	
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Project(String projectName, LocalDate startDate, LocalDate endDate, Integer noOfWorkers,
			Integer per_day_wages) {
		super();
		this.projectName = projectName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.noOfWorkers = noOfWorkers;
		this.per_day_wages = per_day_wages;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	public Integer getNoOfWorkers() {
		return noOfWorkers;
	}
	public void setNoOfWorkers(Integer noOfWorkers) {
		this.noOfWorkers = noOfWorkers;
	}
	public Integer getPer_day_wages() {
		return per_day_wages;
	}
	public void setPer_day_wages(Integer per_day_wages) {
		this.per_day_wages = per_day_wages;
	}
	
	

}
