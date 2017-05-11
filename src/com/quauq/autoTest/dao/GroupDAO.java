package com.quauq.autoTest.dao;

import java.util.List;

import com.quauq.autoTest.model.Group;

public interface GroupDAO {
	List<Group> findGroupList(Group group);
	List<Group> findGroupListByProjectId(int projectId);
	int insertGroup(Group group);
	int updateGroup(Group group);
	Group findGroupById(int id);
	int deleteGroup(int id);
	Group findGroupByCode(String code);
}