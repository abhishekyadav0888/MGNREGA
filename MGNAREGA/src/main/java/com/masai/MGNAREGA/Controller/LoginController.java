package com.masai.MGNAREGA.Controller;

import java.util.Scanner;

import com.masai.MGNAREGA.Entity.GPM;
import com.masai.MGNAREGA.Util.DBUtils.GetConnection;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Query;

public class LoginController {
	
	public boolean adminLogin(Scanner sc) {
		System.out.println("Enter BDO User_Name");
		String username=sc.next();
		System.out.println("Enter BDO Password");
		String password=sc.next();
		if(username.equals("admin")  && password.equals("password")) {
			return true;
		}
		return false;
	}
	
	public void gpmSignUp(Scanner sc) {
		EntityManagerFactory emf=GetConnection.getEmf();
		EntityManager em=emf.createEntityManager();
		System.out.println("Enter User-ID");
		String userId = sc.next();
		System.out.println("Enter User-Password");
		String password = sc.next();
		System.out.println("Enter Adhar Number");
		String adhar = sc.next();
		System.out.println("Enter GPM Name");
		String name = sc.next();
		System.out.println("Enter Date of Birth");
		String dob = sc.next();
		System.out.println("Enter Gender");
		String gender = sc.next();
		System.out.println("Enter Panchayat Name");
		String pachayat = sc.next();
		System.out.println("Enter District");
		String district = sc.next();
		System.out.println("Enter State");
		String state = sc.next();
		
		GPM gpm = new GPM(userId, password, adhar, name, null, gender, pachayat, district, state, null, null);
		em.getTransaction().begin();
		em.persist(gpm);
		em.getTransaction().commit();
		em.clear();
		System.out.println("Sign Up SuccessFull");
	}
	
	public GPM gpmLogin(Scanner sc) {
		EntityManagerFactory emf=GetConnection.getEmf();
		EntityManager em=emf.createEntityManager();
		System.out.println("Enter Gram Panchayat Member(GPM) User_Name");
		String username=sc.next();
		System.out.println("Enter Gram Panchayat Member(GPM) Password");
		String password=sc.next();
		String sql = "SELECT * FROM gpm WHERE username LIKE :username AND userPasword LIKE :password";
		Query query=em.createNativeQuery(sql,GPM.class);
		query.setParameter("username", username);
		query.setParameter("password", password);
		try {
			GPM gpm=(GPM) query.getSingleResult();
			if(gpm!=null) {
				return gpm;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
		
	}
	
	public void signUpOrLoginMenu(Scanner sc) {
		int i=0;
		while(i!=7) {
			System.out.println("1: SignUp GPM");
			System.out.println("2: Login GPM");
			System.out.println("7: Exit");
			i=sc.nextInt();
			switch(i) {
			case 1:
				gpmSignUp(sc);
				break;
			case 2:
				GPM gpm=gpmLogin(sc);
				if(gpm!=null) {
//					new GPMcontroller().gpmMethod(sc,gpm);
				}else {
					System.out.println("Wrong Credentials");
				}
				
				break;
			case 7:
				System.out.println("Exited To Main Menu");
				break;
			}
		}	
	}
	
	
	

}
