package com.quauq.autoTest.dao;

import java.util.List;

import com.quauq.autoTest.model.DegradeData;

public interface DegradeDataDAO {
	List<DegradeData> findDegradeDataList(int degradeId);
}
