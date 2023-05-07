package com.masai.MGNAREGA.Dao;

import java.util.List;
import java.util.Scanner;

import com.masai.MGNAREGA.Entity.GPM;
import com.masai.MGNAREGA.Entity.Project;

public interface BDODao {
	
	public List<GPM> getAllGPMs();
	public void createProject(Scanner sc);
	public List<Project> getAllProjects();

}
