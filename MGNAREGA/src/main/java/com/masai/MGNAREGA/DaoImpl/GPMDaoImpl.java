package com.masai.MGNAREGA.DaoImpl;

import java.util.List;

import com.masai.MGNAREGA.Dao.GPMDao;
import com.masai.MGNAREGA.Entity.GPM;
import com.masai.MGNAREGA.Util.DBUtils.GetConnection;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Query;

public class GPMDaoImpl implements GPMDao {

	@Override
	public GPM getGPMById(int id) {

		EntityManagerFactory emf = GetConnection.getEmf();
		EntityManager em = emf.createEntityManager();
		Query query = em.createQuery("Select g from GPM g where g.gpmId = :gpmID");
		query.setParameter("gpmID", id);
		GPM gpm = (GPM) query.getSingleResult();
		return gpm;
		
	}

	@Override
	public List<GPM> getAllGPMs() {

		EntityManagerFactory emf = GetConnection.getEmf();
		EntityManager em = emf.createEntityManager();
		Query query = em.createQuery("Select g from GPM g");
		List<GPM> gpmList = query.getResultList();
		return gpmList;

	}

	@Override
	public void saveGPM(GPM gpm) {

		EntityManagerFactory emf = GetConnection.getEmf();
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(em.merge(gpm));
		em.getTransaction().commit();
		em.close();

	}

}
