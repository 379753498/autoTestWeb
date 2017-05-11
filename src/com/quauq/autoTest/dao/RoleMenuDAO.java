package com.quauq.autoTest.dao;

import java.util.List;

import com.quauq.autoTest.model.RoleMenu;

public interface RoleMenuDAO {
	List<RoleMenu> findRoleMenuList();
	List<RoleMenu> findRoleMenuListByRoleId(int roleId);
	int insertRoleMenu(RoleMenu roleMenu);
	int deleteRoleMenuByRoleId(int roleId);
}
