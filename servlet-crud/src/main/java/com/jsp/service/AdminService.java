package com.jsp.service;

import java.util.List;

import com.jsp.dao.AdminDao;
import com.jsp.dto.Admin;

public class AdminService {
	AdminDao dao=new AdminDao();
	public Admin saveAdmin(Admin admin) {
		return dao.saveAdmin(admin);
	}
	public Admin updateAdmin(Admin admin) {
		return dao.updateAdmin(admin);
	}
	public Admin deleteAdmin(int id) {
		return dao.deleteAdmin(id);
	}
	public Admin getAdminById(int id) {
		return dao.getAdminById(id);
	}
	public List<Admin> getAllAdmin(){
		return dao.getAllAdmin();
	}
}