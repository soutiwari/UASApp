package com.cg.uas.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cg.uas.dto.Users;
import com.cg.uas.exception.UniversityException;
import com.cg.uas.service.IUniversityLoginService;
import com.cg.uas.service.UniversityLoginServiceImpl;

@WebServlet("/privlogin")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String loginId=request.getParameter("loginId");
		String password=request.getParameter("password");
		String[] role=request.getParameterValues("role");
		Users user=new Users(loginId,password,role[0]);
		System.out.println(user);
		IUniversityLoginService userv=new UniversityLoginServiceImpl();
		String target="";
		try {
			if(userv.validateUser(user))
			{
				HttpSession session=request.getSession();
				session.setAttribute("loginId",loginId);
				session.setAttribute("role",role);
				if(user.getRole().equalsIgnoreCase("admin"))
				{
					target="PrivilegeLogin.jsp";
				}
				else
				{
					target="/scheduledProgList";
				}
			}
			else
			{
				request.setAttribute("error","User with given details doesn't exist.Please enter correct Details!");
				target="PrivilegeLogin.jsp";
			}
		} catch (UniversityException e) {
			request.setAttribute("error",e.getMessage());
			target="Error.jsp";
		}
		RequestDispatcher dispatcher=request.getRequestDispatcher(target);
		dispatcher.forward(request,response);
	}

}
