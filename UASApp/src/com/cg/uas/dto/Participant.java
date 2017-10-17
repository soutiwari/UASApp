package com.cg.uas.dto;

public class Participant {

	private String rollNo;
	private String emailId;
	private Integer applicationId;
	private String scheduledProgramId;
	public Participant() {
		super();
	}
	public Participant(String rollNo, String emailId, Integer applicationId,
			String scheduledProgramId) {
		super();
		this.rollNo = rollNo;
		this.emailId = emailId;
		this.applicationId = applicationId;
		this.scheduledProgramId = scheduledProgramId;
	}
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public Integer getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(Integer applicationId) {
		this.applicationId = applicationId;
	}
	public String getScheduledProgramId() {
		return scheduledProgramId;
	}
	public void setScheduledProgramId(String scheduledProgramId) {
		this.scheduledProgramId = scheduledProgramId;
	}
	@Override
	public String toString() {
		return "Participant [rollNo=" + rollNo + ", emailId=" + emailId
				+ ", applicationId=" + applicationId + ", scheduledProgramId="
				+ scheduledProgramId + "]";
	}
	
}
