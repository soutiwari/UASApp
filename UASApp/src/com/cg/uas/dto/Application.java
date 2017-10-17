package com.cg.uas.dto;

import java.time.LocalDate;

public class Application {

	private Integer applicationId;
	private String fullName;
	private LocalDate dateOfBirth;
	private String higestQualification;
	private Double marksObtained;
	private String goals;
	private String emailId;
	private String scheuldedProgramId;
	private String status;
	private LocalDate dateOfInterview;
	public Application() {
		super();
	}
	public Application(Integer applicationId, String fullName,
			LocalDate dateOfBirth, String higestQualification,
			Double marksObtained, String goals, String emailId,
			String scheuldedProgramId, String status, LocalDate dateOfInterview) {
		super();
		this.applicationId = applicationId;
		this.fullName = fullName;
		this.dateOfBirth = dateOfBirth;
		this.higestQualification = higestQualification;
		this.marksObtained = marksObtained;
		this.goals = goals;
		this.emailId = emailId;
		this.scheuldedProgramId = scheuldedProgramId;
		this.status = status;
		this.dateOfInterview = dateOfInterview;
	}
	public Integer getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(Integer applicationId) {
		this.applicationId = applicationId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getHigestQualification() {
		return higestQualification;
	}
	public void setHigestQualification(String higestQualification) {
		this.higestQualification = higestQualification;
	}
	public Double getMarksObtained() {
		return marksObtained;
	}
	public void setMarksObtained(Double marksObtained) {
		this.marksObtained = marksObtained;
	}
	public String getGoals() {
		return goals;
	}
	public void setGoals(String goals) {
		this.goals = goals;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getScheuldedProgramId() {
		return scheuldedProgramId;
	}
	public void setScheuldedProgramId(String scheuldedProgramId) {
		this.scheuldedProgramId = scheuldedProgramId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public LocalDate getDateOfInterview() {
		return dateOfInterview;
	}
	public void setDateOfInterview(LocalDate dateOfInterview) {
		this.dateOfInterview = dateOfInterview;
	}
}
