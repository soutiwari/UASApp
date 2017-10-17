package com.cg.uas.dto;

import java.time.LocalDate;

public class ProgramsScheduled {

	private String scheduledProgramId;
	private String programName;
	private String location;
	private LocalDate startDate;
	private LocalDate endDate;
	private Integer sessionPerWeek;
	public ProgramsScheduled() {
		super();
	}
	public ProgramsScheduled(String scheduledProgramId, String programName,
			String location, LocalDate startDate, LocalDate endDate,
			Integer sessionPerWeek) {
		super();
		this.scheduledProgramId = scheduledProgramId;
		this.programName = programName;
		this.location = location;
		this.startDate = startDate;
		this.endDate = endDate;
		this.sessionPerWeek = sessionPerWeek;
	}
	public String getScheduledProgramId() {
		return scheduledProgramId;
	}
	public void setScheduledProgramId(String scheduledProgramId) {
		this.scheduledProgramId = scheduledProgramId;
	}
	public String getProgramName() {
		return programName;
	}
	public void setProgramName(String programName) {
		this.programName = programName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	public Integer getSessionPerWeek() {
		return sessionPerWeek;
	}
	public void setSessionPerWeek(Integer sessionPerWeek) {
		this.sessionPerWeek = sessionPerWeek;
	}
	@Override
	public String toString() {
		return "ProgramsScheduled [scheduledProgramId=" + scheduledProgramId
				+ ", programName=" + programName + ", location=" + location
				+ ", startDate=" + startDate + ", endDate=" + endDate
				+ ", sessionPerWeek=" + sessionPerWeek + "]";
	}
	
}
