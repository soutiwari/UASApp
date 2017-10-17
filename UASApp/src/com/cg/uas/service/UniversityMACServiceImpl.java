package com.cg.uas.service;

import java.util.List;

import com.cg.uas.dao.IUniversityMACDAO;
import com.cg.uas.dao.UniversityMACDAOImpl;
import com.cg.uas.dto.Application;
import com.cg.uas.dto.ProgramsScheduled;
import com.cg.uas.exception.UniversityException;

public class UniversityMACServiceImpl implements IUniversityMACService{

	IUniversityMACDAO mdao=new UniversityMACDAOImpl();
	@Override
	public List<ProgramsScheduled> getScheduledPrograms() throws UniversityException {
		return mdao.getScheduledPrograms();
	}
	@Override
	public List<Application> getApplications(String scheduleId)	throws UniversityException {
		
		return mdao.getApplications(scheduleId);
	}

}
