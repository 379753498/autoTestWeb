package com.quauq.autoTest.service;

import java.util.List;

import com.quauq.autoTest.dao.DegradeDAO;
import com.quauq.autoTest.model.Degrade;


public class DegradeService extends IService {
	private DegradeDAO degradeDao;

	public List<Degrade> findDegradeList(Degrade degrade){
		return degradeDao.findDegradeList(degrade);
	}
	public int findDegradeCount(Degrade degrade){
		return degradeDao.findDegradeCount(degrade);
	}
	public Degrade findDegradeById(int id){
		return degradeDao.findDegradeById(id);
	}
	public DegradeDAO getDegradeDao() {
		return degradeDao;
	}
	public void setDegradeDao(DegradeDAO degradeDao) {
		this.degradeDao = degradeDao;
	}
	

}
