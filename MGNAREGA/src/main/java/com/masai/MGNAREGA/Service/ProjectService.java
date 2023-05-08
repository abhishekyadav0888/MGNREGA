package com.masai.MGNAREGA.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.masai.MGNAREGA.DaoImpl.GPMDaoImpl;
import com.masai.MGNAREGA.DaoImpl.ProjectDaoImpl;
import com.masai.MGNAREGA.Entity.GPM;
import com.masai.MGNAREGA.Entity.Project;

public class ProjectService {
	
	GPMDaoImpl gpmDaoImpl=new GPMDaoImpl();
	ProjectDaoImpl projectDaoImpl=new ProjectDaoImpl();
	
	public Project createNewProject(Scanner sc) {
		System.out.println("Create New Project\n");
		System.out.println("Enter Project Name");
		String projectName=sc.next();
		System.out.println("Enter Project Starting Date in Format(DD-MM-YYYY)");
		String startDateStr=sc.next();
		System.out.println("Enter Project Ending Date in Format(DD-MM-YYYY)");
		String endDateStr=sc.next();
		System.out.println("Enter Number of Workers");
		Integer workers=sc.nextInt();
		System.out.println("Enter per day wage of Worker");
		Integer wage=sc.nextInt();
		Date startDate=null;
		Date endDate=null;
		try {
			startDate=new SimpleDateFormat("dd-MM-yyyy").parse(startDateStr);
			endDate=new SimpleDateFormat("dd-MM-yyyy").parse(endDateStr);
		} catch (ParseException e) {
			System.out.println("Wrong Date Input");
			startDate=new Date();
			endDate=new Date();
		}
//		GPM gpm=gpmDaoImpl.getGPMById(-1);
		Project project=new Project(projectName, startDate, endDate, workers, wage, null);
		return project;
	}
	
	public void printAllProjects(List<Project> projectList) {
		projectList.forEach(s->System.out.println(s.toString()));
	}
	
//	public int bidByVendor(Scanner sc) {
//		System.out.println("Enter Tender Id For Which You Want To Bid");
//		
//		return sc.nextInt();
//	}
	
	public int scanProjectId(Scanner sc) {
		System.out.println("Enter Project Id For Which You Want assign");
		
		return sc.nextInt();
	}
	
//	public void printTenderBidHistory(List<Vendor> tenderBidHistory) {
//		for(int i=0;i<tenderBidHistory.size();i++) {
//			System.out.println("-------------------------------");
//			System.out.println("Vendor ID:"+tenderBidHistory.get(i).getVendorId());
//			System.out.println("Vendor Name: "+tenderBidHistory.get(i).getVendorCompanyName());
//		}
//	}
	
	public void assignGPM(Scanner sc) {
		System.out.println("Enter Project Id For Which You Want To Assign Gram Panchayt Member(GPM)");
		int projectId=sc.nextInt();
		System.out.println("Enter GPM Id");
		int gpmId=sc.nextInt();
		Project assignProject=projectDaoImpl.getProjectByProjectId(projectId);
		GPM assignGPM=gpmDaoImpl.getGPMById(gpmId);
//		assignProject.setGpm(assignGPM);
		List<Project> projects = new ArrayList<>();
		projects.add(assignProject);
		assignGPM.setAllocatedProject(projects);
		
		gpmDaoImpl.saveGPM(assignGPM);
		
	}
	
	public void searchProjectById(Scanner sc) {
		System.out.println("Enter Project Id");
		int id=sc.nextInt();
		Project project=projectDaoImpl.getProjectByProjectId(id);
		if(project!=null) {
			System.out.println(project.toString());
		}
	}
	
	
	
	

}
