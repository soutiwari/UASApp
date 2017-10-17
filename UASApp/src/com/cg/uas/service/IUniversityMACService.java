package com.cg.uas.service;

import java.util.List;

import com.cg.uas.dto.Application;
import com.cg.uas.dto.ProgramsScheduled;
import com.cg.uas.exception.UniversityException;

public interface IUniversityMACService {

	List<ProgramsScheduled> getScheduledPrograms() throws UniversityException;
	List<Application> getApplications(String scheduleId) throws UniversityException;
}
