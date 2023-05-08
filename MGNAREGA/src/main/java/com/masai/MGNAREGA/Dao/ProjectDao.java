package com.masai.MGNAREGA.Dao;

import java.util.List;
import java.util.Scanner;

import com.masai.MGNAREGA.Entity.Project;
import com.masai.MGNAREGA.Entity.Worker;

public interface ProjectDao {
	
	public void saveProject(Project td);
	public List<Project> getAllProjects();
	public List<Project> getAllOpenProjects();
	public Project getProjectByProjectId(int id);
	public List<Worker> workerForProject(Scanner sc);

}
