package com.jsp.controller;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.Admin;
import com.jsp.service.AdminService;
@WebServlet("/deleteadmin")
public class DeleteAdmin extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id=Integer.parseInt(req.getParameter("id"));
		AdminService adminService = new AdminService();
		Admin admin=adminService.deleteAdmin(id);
		
		if(admin !=null) {
			RequestDispatcher dispatcher=req.getRequestDispatcher("adminhome.jsp");
			dispatcher.forward(req, resp);
		}else {
			RequestDispatcher dispatcher=req.getRequestDispatcher("deleteadmin.jsp");
			dispatcher.include(req, resp);
		
		}
	}
}
