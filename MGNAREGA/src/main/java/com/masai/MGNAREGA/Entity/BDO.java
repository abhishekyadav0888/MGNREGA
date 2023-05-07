package com.masai.MGNAREGA.Entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;

@Entity
public class BDO {
	
	String userName = "admin";
	List<GPM> gpmList=new ArrayList<>();
	List<Project> projectList=new ArrayList<>();
	
	public BDO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BDO(String userName, List<GPM> gpmList, List<Project> projectList) {
		super();
		this.userName = userName;
		this.gpmList = gpmList;
		this.projectList = projectList;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public List<GPM> getGpmList() {
		return gpmList;
	}
	public void setGpmList(List<GPM> gpmList) {
		this.gpmList = gpmList;
	}
	public List<Project> getProjectList() {
		return projectList;
	}
	public void setProjectList(List<Project> projectList) {
		this.projectList = projectList;
	}
	
	
	
	

}
