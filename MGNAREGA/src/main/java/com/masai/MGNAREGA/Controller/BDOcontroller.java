package com.masai.MGNAREGA.Controller;

import java.util.List;
import java.util.Scanner;

import com.masai.MGNAREGA.DaoImpl.BDODaoImpl;
import com.masai.MGNAREGA.DaoImpl.GPMDaoImpl;
import com.masai.MGNAREGA.DaoImpl.ProjectDaoImpl;
import com.masai.MGNAREGA.Entity.BDO;
import com.masai.MGNAREGA.Entity.Project;
import com.masai.MGNAREGA.Service.GPMService;
import com.masai.MGNAREGA.Service.ProjectService;

public class BDOcontroller {

	BDO bdo = new BDO();
	BDODaoImpl bdoDao=new BDODaoImpl();
	ProjectService projectService=new ProjectService();
	GPMService gpmService=new GPMService();
	ProjectDaoImpl projectDaoImpl=new ProjectDaoImpl();
	GPMDaoImpl gpmDaoImpl=new GPMDaoImpl();
	public void bdoMethod(Scanner sc) throws InterruptedException {
		System.out.println("BDO Pannel");
		int i=0;
		while(i!=7) {
			System.out.println("1: View all the Gram Panchayat Members(GPMs)");
			System.out.println("2: Create new Projects");
			System.out.println("3: View All the Projects");
			System.out.println("4: View All the Workers of a Project");
			System.out.println("5: Assign Project to a GPM");
			System.out.println("7: Logout");
			
			i=sc.nextInt();
			switch(i) {
			case 1:
				List<GPM> gpmList=gpmDaoImpl.getAllGPMs();
				gpmService.printAllGPMs(gpmList);
				
				Thread.sleep(2000);
//				BDOViewAllVendors();
				break;
			case 2:
//				BDOCreateNewProjects();
				
				
				
				
				
				
				
				
				
				Project project=ProjectService.createNewProject(sc);
				ProjectDaoImpl.saveProject(Project);
				Thread.sleep(2000);
				break;
			case 3:
//				BDOViewAllProjects();
				List<Project> tList=ProjectDaoImpl.getAllProjects();
				ProjectService.printAllProjects(tList);
				break;
			case 4:
				List<Project> tOpenList=ProjectDaoImpl.getAllOpenProjects();
				ProjectService.printAllProjects(tOpenList);
				int ProjectId=ProjectService.scanProjectId(sc);
				Project ProjectObject=ProjectDaoImpl.getProjectByProjectId(ProjectId);
				ProjectService.printProjectBidHistory(ProjectObject.getBidByList());
				break;
			case 5:
				ProjectService.assignVendor(sc);
				break;
			case 7:
				System.out.println("BDO Logged Out");
				break;
			}
		}
	}
	private void printAllVendors(List<Vendor> vendorList) {
		pattern();
	vendorList.forEach(s->System.out.println("\n"+s.toString()+"\n"));
	pattern();
	}
	
	
	static private void pattern() {
		System.out.println("\n \n   ----------------------------  \n");
	}
	
}
