package com.masai.MGNAREGA.DaoImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.masai.MGNAREGA.Dao.BDODao;
import com.masai.MGNAREGA.Entity.GPM;
import com.masai.MGNAREGA.Entity.Project;

public class BDODaoImpl implements BDODao {

	@Override
	public List<GPM> getAllGPMs() {

		GPM gpm1 = new GPM();
		GPM gpm2 = new GPM();
		List<GPM> gpmList = new ArrayList<>();
		gpmList.add(gpm1);
		gpmList.add(gpm2);
		
		return gpmList;
	}

	@Override
	public void createProject(Scanner sc) {

		System.out.println("Enter New Project Details\n");
		System.out.println("Enter Project Name");
		String projectName = sc.next();
		Project p1 = new Project();
		p1.setProjectName(projectName);

	}

	@Override
	public List<Project> getAllProjects() {
		// TODO Auto-generated method stub
		return null;
	}

}
