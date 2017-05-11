package com.quauq.autoTest.service;

import java.util.List;

import com.quauq.autoTest.dao.UserGroupDAO;
import com.quauq.autoTest.model.UserGroup;

public class UserGroupService extends IService {
	private UserGroupDAO userGroupDao;

	public List<UserGroup> findUserGroupList() {
		return userGroupDao.findUserGroupList();
	}

	public int insertUserGroup(UserGroup userGroup) {
		try {
			return userGroupDao.insertUserGroup(userGroup);
		} catch (Exception e) {
			log.info(e.toString());
			throw new RuntimeException(e.toString());
		}
	}

	public int updateUserGroup(UserGroup userGroup) {
		try {
			return userGroupDao.updateUserGroup(userGroup);
		} catch (Exception e) {
			log.info(e.toString());
			throw new RuntimeException(e.toString());
		}
	}

	public UserGroup findUserGroupById(int id) {
		return userGroupDao.findUserGroupById(id);
	}

	public int deleteUserGroup(int id) {
		try {
			int i = userGroupDao.deleteUserGroup(id);
			return i;
		} catch (Exception e) {
			log.info(e.toString());
			throw new RuntimeException(e.toString());
		}

	}

	public UserGroupDAO getUserGroupDao() {
		return userGroupDao;
	}

	public void setUserGroupDao(UserGroupDAO userGroupDao) {
		this.userGroupDao = userGroupDao;
	}

}
