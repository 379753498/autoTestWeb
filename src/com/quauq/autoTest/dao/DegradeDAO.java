package com.quauq.autoTest.dao;

import java.util.List;

import com.quauq.autoTest.model.Degrade;



public interface DegradeDAO {
	List<Degrade> findDegradeList(Degrade degrade);
	int findDegradeCount(Degrade degrade);
	Degrade findDegradeById(int id);
}
