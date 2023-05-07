package com.masai.MGNAREGA.Dao;

import java.util.List;

import com.masai.MGNAREGA.Entity.GPM;

public interface GPMDao {
	
	public GPM getGPMById(int id);
	public List<GPM> getAllGPMs();
	void saveGPM(GPM gpm);

}
