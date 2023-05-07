package com.masai.MGNAREGA.Entity;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

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
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String projectName;
	private Date startDate;
	private Date endDate;
	private Integer noOfWorkers;
	private Integer per_day_wages;
	@ManyToMany
	@JoinTable(name="gpmForProject", joinColumns = {@JoinColumn(referencedColumnName = "projectId")}, inverseJoinColumns = {@JoinColumn(referencedColumnName = "gpmId")})
    private List<GPM> gpmList;
	@ManyToOne
	@JoinColumn(name ="fkGpmId")
	private GPM gpm;

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Project(String projectName, Date startDate, Date endDate, Integer noOfWorkers, Integer per_day_wages,
			List<GPM> gpmList, GPM gpm) {
		super();
		this.projectName = projectName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.noOfWorkers = noOfWorkers;
		this.per_day_wages = per_day_wages;
		this.gpmList = gpmList;
		this.gpm = gpm;
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

	public List<GPM> getGpmList() {
		return gpmList;
	}

	public void setGpmList(List<GPM> gpmList) {
		this.gpmList = gpmList;
	}

	public GPM getGpm() {
		return gpm;
	}

	public void setGpm(GPM gpm) {
		this.gpm = gpm;
	}

	@Override
	public String toString() {
		return "id=" + id + ", projectName=" + projectName + ", startDate=" + startDate + ", endDate="
				+ endDate + ", noOfWorkers=" + noOfWorkers + ", per_day_wages=" + per_day_wages + ", gpmList=" + gpmList
				+ ", gpm=" + gpm;
	}
	
	

	

}
