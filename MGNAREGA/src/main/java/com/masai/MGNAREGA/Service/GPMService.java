package com.masai.MGNAREGA.Service;

import java.util.List;
import java.util.Scanner;

import com.masai.MGNAREGA.DaoImpl.ProjectDaoImpl;
import com.masai.MGNAREGA.Entity.GPM;

public class GPMService {
	
	ProjectDaoImpl projectDaoImpl = new ProjectDaoImpl();
	
	public GPM gpmSignUp(Scanner sc) {
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
		
		return gpm;
	}
	
	public void printAllGPMs(List<GPM> GPMList) {
		GPMList.forEach(s->System.out.println(s.toString()));
	}

}
