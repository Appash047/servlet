package com.jsp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.Admin;
import com.jsp.service.AdminService;

@WebServlet("/editadmin")
public class GetAdminByIdServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		AdminService adminService = new AdminService();
		int id = Integer.parseInt(req.getParameter("id"));
		Admin admin = adminService.getAdminById(id);

		if (admin != null) {
			req.setAttribute("updateadmin", admin);
			RequestDispatcher dispatcher = req.getRequestDispatcher("updateadmin.jsp");
			dispatcher.forward(req, resp);
		} else {
			RequestDispatcher dispatcher = req.getRequestDispatcher("editadmin.jsp");
			dispatcher.include(req, resp);
		}
	}
}
