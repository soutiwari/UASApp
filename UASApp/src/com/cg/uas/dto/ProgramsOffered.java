package com.cg.uas.dto;

public class ProgramsOffered {

	private String programName;
	private String description;
	private String applicationEligibilty;
	private Double duration;
	private String degreeCertificateOffered;
	
	public ProgramsOffered() {
		super();
	}
	public ProgramsOffered(String programName, String description,
			String applicationEligibilty, Double duration,
			String degreeCertificateOffered) {
		super();
		this.programName = programName;
		this.description = description;
		this.applicationEligibilty = applicationEligibilty;
		this.duration = duration;
		this.degreeCertificateOffered = degreeCertificateOffered;
	}
	public String getProgramName() {
		return programName;
	}
	public void setProgramName(String programName) {
		this.programName = programName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getApplicationEligibilty() {
		return applicationEligibilty;
	}
	public void setApplicationEligibilty(String applicationEligibilty) {
		this.applicationEligibilty = applicationEligibilty;
	}
	public Double getDuration() {
		return duration;
	}
	public void setDuration(Double duration) {
		this.duration = duration;
	}
	public String getDegreeCertificateOffered() {
		return degreeCertificateOffered;
	}
	public void setDegreeCertificateOffered(String degreeCertificateOffered) {
		this.degreeCertificateOffered = degreeCertificateOffered;
	}
	@Override
	public String toString() {
		return "ProgramsOffered [programName=" + programName + ", description="
				+ description + ", applicationEligibilty="
				+ applicationEligibilty + ", duration=" + duration
				+ ", degreeCertificateOffered=" + degreeCertificateOffered
				+ "]";
	}
	
}
