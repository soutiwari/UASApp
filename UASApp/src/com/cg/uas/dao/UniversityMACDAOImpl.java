package com.cg.uas.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cg.uas.DBUtil.DBUtil;
import com.cg.uas.dto.Application;
import com.cg.uas.dto.ProgramsScheduled;
import com.cg.uas.exception.UniversityException;

public class UniversityMACDAOImpl implements IUniversityMACDAO {
	Connection conn;
	static String GET_SCHEDULE="SELECT * FROM programs_scheduled";
	static String GET_APPLICATIONS="SELECT * FROM application WHERE scheduled_program_id=(?)";
	@Override
	public List<ProgramsScheduled> getScheduledPrograms() throws UniversityException {
		conn=DBUtil.getConnection();
		List<ProgramsScheduled> plist=new ArrayList<ProgramsScheduled>();
		try {
			Statement st=conn.createStatement();
			ResultSet rs=st.executeQuery(GET_SCHEDULE);
			while(rs.next())
			{
				ProgramsScheduled progSch=new ProgramsScheduled();
				progSch.setScheduledProgramId(rs.getString(1));
				progSch.setProgramName(rs.getString(2));
				progSch.setLocation(rs.getString(3));
				progSch.setStartDate(rs.getDate(4).toLocalDate());
				progSch.setEndDate(rs.getDate(5).toLocalDate());
				progSch.setSessionPerWeek(rs.getInt(6));
				plist.add(progSch);
			}
		} catch (SQLException e) {
			throw new UniversityException("Problem in getting scheduled programs details "+e.getMessage());
		}
		return plist;
	}
	@Override
	public List<Application> getApplications(String scheduleId)	throws UniversityException {
		conn=DBUtil.getConnection();
		List<Application> alist=new ArrayList<Application>();
		try {
			PreparedStatement pst = conn.prepareStatement(GET_APPLICATIONS);
			pst.setString(1,scheduleId);
			ResultSet rs=pst.executeQuery();
			while(rs.next())
			{
				Application app=new Application();
				app.setApplicationId(rs.getInt(1));
				app.setFullName(rs.getString(2));
				app.setDateOfBirth(rs.getDate(3).toLocalDate());
				app.setHigestQualification(rs.getString(4));
				app.setMarksObtained(rs.getDouble(5));
				app.setGoals(rs.getString(6));
				app.setEmailId(rs.getString(7));
				app.setScheuldedProgramId(rs.getString(8));
				app.setStatus(rs.getString(9));
				app.setDateOfInterview(rs.getDate(10).toLocalDate());
				alist.add(app);
			}
		} catch (SQLException e) {
			throw new UniversityException("Problem in getting applications details "+e.getMessage());
		}
		return alist;
	}

}
