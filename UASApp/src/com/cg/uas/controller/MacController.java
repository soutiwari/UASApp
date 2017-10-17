package com.cg.uas.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.uas.dto.Application;
import com.cg.uas.dto.ProgramsScheduled;
import com.cg.uas.exception.UniversityException;
import com.cg.uas.service.IUniversityMACService;
import com.cg.uas.service.UniversityMACServiceImpl;

@WebServlet(urlPatterns={"/scheduledProgList","/displayApplications"})
public class MacController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String url = request.getServletPath();
		 IUniversityMACService umserv=new UniversityMACServiceImpl();
		 String target="";
		 switch(url)
		 {
		 case "/scheduledProgList":
			 try {
				List<ProgramsScheduled> plist=umserv.getScheduledPrograms();
				request.setAttribute("plist",plist);
				target="ApplicationEnrolledPrograms.jsp";
			} catch (UniversityException e) {
				request.setAttribute("error",e.getMessage());
			}
			 break;
		 case "/displayApplications":
			 String scheduleId=request.getParameter("scheduledProg");
			 try {
				List<Application> alist=umserv.getApplications(scheduleId);
				request.setAttribute("alist",alist);
				target="ApplicationsList.jsp";
			} catch (UniversityException e) {
				request.setAttribute("error",e.getMessage());
				target="Error.jsp";
			}
			 break;
		 }
		 RequestDispatcher dispatcher=request.getRequestDispatcher(target);
		 dispatcher.forward(request,response);
	}
	
}
