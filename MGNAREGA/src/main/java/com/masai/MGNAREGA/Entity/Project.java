package com.masai.MGNAREGA.Entity;

import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Project {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String projectName;
	private Date startDate;
	private Date endDate;
	private Integer noOfWorkers;
	private Integer per_day_wages;
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Worker> workerlist;

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Project(String projectName, Date startDate, Date endDate, Integer noOfWorkers, Integer per_day_wages,
			List<Worker> workerlist) {
		super();
		this.projectName = projectName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.noOfWorkers = noOfWorkers;
		this.per_day_wages = per_day_wages;
		this.workerlist = workerlist;
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

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
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

	public List<Worker> getWorkerlist() {
		return workerlist;
	}

	public void setWorkerlist(List<Worker> workerlist) {
		this.workerlist = workerlist;
	}

	@Override
	public String toString() {
		return "Project [id=" + id + ", projectName=" + projectName + ", startDate=" + startDate + ", endDate="
				+ endDate + ", noOfWorkers=" + noOfWorkers + ", per_day_wages=" + per_day_wages + ", workerlist="
				+ workerlist + "]";
	}

	

	
	
	

	

}
