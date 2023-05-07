package com.masai.MGNAREGA.Controller;

import java.util.Scanner;

import com.masai.MGNAREGA.DaoImpl.ProjectDaoImpl;
import com.masai.MGNAREGA.Entity.GPM;
import com.masai.MGNAREGA.Service.GPMService;
import com.masai.MGNAREGA.Service.ProjectService;

public class GPMcontroller {
	
	public void vendorMethod(Scanner sc, GPM gpm) {
		ProjectDaoImpl projectDaoImpl=new ProjectDaoImpl();
		ProjectService projectService=new ProjectService();
		GPMService gpmService=new GPMService();
		System.out.println("GPM Pannel\n\n");
		int i=0;
		while(i!=7) {
			System.out.println("Panchayat Name-> "+gpm.getPanchayatName());
			System.out.println("1: Update his account details and change password");
			System.out.println("2: View all the current Projects");
			System.out.println("3: Place a Bid against a Project");
			System.out.println("4: View his own Bid History with bid status");
			System.out.println("5: Search for a Project by Project id");
			System.out.println("7: Logout");
			
			i=sc.nextInt();
//			switch(i) {
//			case 1:
//				vendorService.getDataAndUpdateVendor(sc,vendor.getVendorId());
//				break;
//			case 2:
//				List<Project> ProjectList=ProjectDaoImpl.getAllOpenProjects();
//				ProjectService.printAllProjects(ProjectList);
//				break;
//			case 3:
//				List<Project> customProject=ProjectDaoImpl.biddingForProject(vendor,sc);
//				ProjectService.printAllProjects(customProject);
//				int bidProjectId=ProjectService.bidByVendor(sc);
//				Project Project=ProjectDaoImpl.getProjectByProjectId(bidProjectId);
//				Project.getBidByList().add(vendor);
//				ProjectDaoImpl.saveProject(Project);
//				System.out.println("Bidding SuccessFully");
////				vendorViewAllProjects();
//				break;
//			case 4:
//				vendorService.viewBidHistory(vendor.getVendorId());
//				
//				break;
//			case 5:
//				ProjectService.searchProjectById(sc);
//				break;
//			case 7:
//				System.out.println("Admin Logged Out");
//				break;
//			}
		}
	}

}
