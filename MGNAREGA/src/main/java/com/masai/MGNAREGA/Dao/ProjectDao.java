package com.masai.MGNAREGA.Dao;

import java.util.List;
import java.util.Scanner;

import com.masai.MGNAREGA.Entity.Project;

public interface ProjectDao {
	
	public void saveProject(Project td);
	public List<Project> getAllProjects();
	public List<Project> getAllOpenProjects();
	public Project getProjectByProjectId(int id);
	public List<Project> workerForProject(Project vendor, Scanner sc);

}
