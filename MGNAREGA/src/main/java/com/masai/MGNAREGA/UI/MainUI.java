package com.masai.MGNAREGA.UI;

import java.util.Scanner;

import com.masai.MGNAREGA.Controller.BDOcontroller;
import com.masai.MGNAREGA.Controller.LoginController;
import com.masai.MGNAREGA.Util.DBUtils.GetConnection;

import jakarta.persistence.EntityManagerFactory;

public class MainUI {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = GetConnection.getEmf();
		Scanner sc = new Scanner(System.in);
		
		try {
			int i=0;
			while(i!=9) {
				System.out.println("1: Block Developmet Officer(BDO)");
				System.out.println("2: Gram Panchayat Member(GPM)");
				System.out.println("9: Exit");
				i=sc.nextInt();
				switch(i){
				case 1:
					if(new LoginController().adminLogin(sc)) {
						new BDOcontroller().bdoMethod(sc);	
					}else {
						System.out.println("Wrong Credentials");
					}
					break;
				case 2:
					new LoginController().signUpOrLoginMenu(sc);
					break;
				case 9:
					System.out.println("Program End");
					break;
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			System.out.println("Program Ended");
		}
	}

}
