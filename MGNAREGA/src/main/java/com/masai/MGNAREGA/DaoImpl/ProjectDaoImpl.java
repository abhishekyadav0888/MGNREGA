package com.masai.MGNAREGA.DaoImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.masai.MGNAREGA.Dao.ProjectDao;
import com.masai.MGNAREGA.Entity.Project;
import com.masai.MGNAREGA.Util.DBUtils.GetConnection;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Query;

public class ProjectDaoImpl implements ProjectDao {

	@Override
	public void saveProject(Project td) {

		EntityManagerFactory emf = GetConnection.getEmf();
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(em.merge(td));
		em.getTransaction().commit();
		em.close();

	}

	@Override
	public List<Project> getAllProjects() {

		EntityManagerFactory emf = GetConnection.getEmf();
		EntityManager em = emf.createEntityManager();
		Query query = em.createQuery("Select p from Project p");
		List<Project> projectList = query.getResultList();
		return projectList;
		
	}
	
	@Override
	public Project getProjectByProjectId(int id) {
		
		EntityManagerFactory emf = GetConnection.getEmf();
		EntityManager em = emf.createEntityManager();
		Query query = em.createQuery("Select p from Project p where p.projectId=:projectID");
		query.setParameter("projectID", id);
		Project project = (Project) query.getSingleResult();
		return project;

	}

	@Override
	public List<Project> getAllOpenProjects() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Project> workerForProject(Project vendor, Scanner sc) {
		EntityManagerFactory emf = GetConnection.getEmf();
		EntityManager em = emf.createEntityManager();
		Query query = em.createQuery("Select p from Project p where p.project.projectId = -1");
		List<Project> projectList=query.getResultList();
		List<Project> customProject = new ArrayList<>();
		for(int i=0; i<projectList.size(); i++) {
			boolean isAvailable = false;
//			for(int j=0; j<projectList.get(i).getBidByList().size();j++) {
//				
//				if(tenderList.get(i).getBidByList().get(j).getVendorId()==vendor.getVendorId()) {
//					
//					isAvailable=true;
//				}
//			}
//			if(!isAvailable) {
//				customTender.add(tenderList.get(i));
//			}
		}
		return customProject;
	}

}
