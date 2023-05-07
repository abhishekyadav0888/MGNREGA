package com.masai.MGNAREGA.Util;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class DBUtils {
	
	public static class GetConnection{
		static EntityManagerFactory emf = Persistence.createEntityManagerFactory("connect");

		public static EntityManagerFactory getEmf() {
			return emf;
		}
		
		public static void setEmf(EntityManagerFactory emf) {
			GetConnection.emf = emf;
		}
	}

}
