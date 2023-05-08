package com.masai.MGNAREGA.DaoImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.masai.MGNAREGA.Dao.ProjectDao;
import com.masai.MGNAREGA.Entity.Project;
import com.masai.MGNAREGA.Entity.Worker;
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
		Query query = em.createQuery("Select p from Project p where p.id=:projectID");
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
	public List<Worker> workerForProject(Scanner sc) {
		System.out.println("Enter Project id: ");
		Integer id = sc.nextInt();
		EntityManagerFactory emf = GetConnection.getEmf();
		EntityManager em = emf.createEntityManager();
		Query query = em.createQuery("Select p from Project p where p.id = :id");
		Project project = (Project) query.getSingleResult();
		query.setParameter("id", id);
		List<Worker> workersList = project.getWorkerlist();
		
		return workersList;
	}

}
