package com.quauq.autoTest.dao;

import java.util.List;

import com.quauq.autoTest.model.DataMap;

public interface DataMapDAO {
	List<DataMap> findDataMapListByPageId(int scriptId);
	int insertDataMap(DataMap dataMap);
	Integer findActionIdByDataMapId(int dataMapId);
	int findMaxSort(int pageId);
	int deleteDataMapByActionId(int actionId);
	DataMap findDataMapByActionId(int actionId);
	DataMap findDataMapById(int id);
	DataMap findDataMap(DataMap dataMap);
	int updateDataMap(DataMap dataMap);
}
