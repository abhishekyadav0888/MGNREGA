package com.masai.MGNAREGA.Controller;

import java.util.List;
import java.util.Scanner;

import com.masai.MGNAREGA.DaoImpl.BDODaoImpl;
import com.masai.MGNAREGA.DaoImpl.GPMDaoImpl;
import com.masai.MGNAREGA.DaoImpl.ProjectDaoImpl;
import com.masai.MGNAREGA.Entity.GPM;
import com.masai.MGNAREGA.Entity.Project;
import com.masai.MGNAREGA.Service.GPMService;
import com.masai.MGNAREGA.Service.ProjectService;

public class BDOcontroller {

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
			System.out.println("2: Create new GPM");
			System.out.println("3: Create new Projects");
			System.out.println("4: View All the GPMs");
			System.out.println("5: View All the Projects");
			System.out.println("6: View All the Workers of a Project");
			System.out.println("7: Assign Project to a GPM");
			System.out.println("9: Logout");
			
			i=sc.nextInt();
			switch(i) {
			case 1:
				List<GPM> gpmList=gpmDaoImpl.getAllGPMs();
				gpmService.printAllGPMs(gpmList);

//				BDOViewAllVendors();
				break;
			case 2:
				GPM gpm = gpmService.gpmSignUp(sc);
				gpmDaoImpl.saveGPM(gpm);
//				BDOViewAllVendors();
				break;
			case 3:
//				BDOCreateNewProjects();
				Project project=projectService.createNewProject(sc);
				projectDaoImpl.saveProject(project);

				break;
			case 4:
//				BDOViewAllProjects();
				List<GPM> gpmAll=gpmDaoImpl.getAllGPMs();
				gpmService.printAllGPMs(gpmAll);
				break;
			case 5:
//				BDOViewAllProjects();
				List<Project> tList=projectDaoImpl.getAllProjects();
				projectService.printAllProjects(tList);
				break;
			case 6:
				projectDaoImpl.workerForProject(sc);
				break;
			case 7:
				projectService.assignGPM(sc);
				break;
			case 9:
				System.out.println("BDO Logged Out");
				break;
			}
		}
	}
	
	private void printAllGPMs(List<GPM> gpmList) {
		pattern();
		gpmList.forEach(s->System.out.println("\n"+s.toString()+"\n"));
		pattern();
	}
	
	static private void pattern() {
		System.out.println("\n \n   ----------------------------  \n");
	}
	
}
