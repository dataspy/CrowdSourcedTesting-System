package cn.com.crowdsourcedtesting.bean;

import java.util.HashSet;
import java.util.Set;

import javax.xml.bind.annotation.XmlTransient;

/**
 * Publisher entity. @author MyEclipse Persistence Tools
 */

public class Publisher implements java.io.Serializable {

	// Fields

	private Integer publisherId;
	private Administrator administrator;
	private String publisherName;
	private String publisherLogEmail;
	private String publisherPassword;
	private String publisherPhoto;
	private Double publisherCredit;
	private Boolean publisherAuthority;
	private String publisherCompany;
	private Boolean publisherType;
	private String publisherConnectEmail;
	private Set recruitments = new HashSet(0);
	private Set testTasks = new HashSet(0);
	private Set questionnaires = new HashSet(0);
	private Boolean isPassed;
	private String businessLicense;
	

	// Constructors

	public Boolean getIsPassed() {
		return isPassed;
	}

	public void setIsPassed(Boolean isPassed) {
		this.isPassed = isPassed;
	}

	public String getBusinessLicense() {
		return businessLicense;
	}

	public void setBusinessLicense(String businessLicense) {
		this.businessLicense = businessLicense;
	}

	/** default constructor */
	public Publisher() {
	}

	/** minimal constructor */
	public Publisher(String publisherName, String publisherLogEmail,
			String publisherPassword, Double publisherCredit,
			Boolean publisherAuthority, Boolean publisherType) {
		this.publisherName = publisherName;
		this.publisherLogEmail = publisherLogEmail;
		this.publisherPassword = publisherPassword;
		this.publisherCredit = publisherCredit;
		this.publisherAuthority = publisherAuthority;
		this.publisherType = publisherType;
	}

	/** full constructor */
	public Publisher(Administrator administrator, String publisherName,
			String publisherLogEmail, String publisherPassword,
			String publisherPhoto, Double publisherCredit,
			Boolean publisherAuthority, String publisherCompany,
			Boolean publisherType, String publisherConnectEmail,
			Set recruitments, Set testTasks, Set questionnaires) {
		this.administrator = administrator;
		this.publisherName = publisherName;
		this.publisherLogEmail = publisherLogEmail;
		this.publisherPassword = publisherPassword;
		this.publisherPhoto = publisherPhoto;
		this.publisherCredit = publisherCredit;
		this.publisherAuthority = publisherAuthority;
		this.publisherCompany = publisherCompany;
		this.publisherType = publisherType;
		this.publisherConnectEmail = publisherConnectEmail;
		this.recruitments = recruitments;
		this.testTasks = testTasks;
		this.questionnaires = questionnaires;
	}

	// Property accessors

	public Integer getPublisherId() {
		return this.publisherId;
	}

	public void setPublisherId(Integer publisherId) {
		this.publisherId = publisherId;
	}

	@XmlTransient
	public Administrator getAdministrator() {
		return this.administrator;
	}

	public void setAdministrator(Administrator administrator) {
		this.administrator = administrator;
	}

	public String getPublisherName() {
		return this.publisherName;
	}

	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}

	public String getPublisherLogEmail() {
		return this.publisherLogEmail;
	}

	public void setPublisherLogEmail(String publisherLogEmail) {
		this.publisherLogEmail = publisherLogEmail;
	}

	public String getPublisherPassword() {
		return this.publisherPassword;
	}

	public void setPublisherPassword(String publisherPassword) {
		this.publisherPassword = publisherPassword;
	}

	public String getPublisherPhoto() {
		return this.publisherPhoto;
	}

	public void setPublisherPhoto(String publisherPhoto) {
		this.publisherPhoto = publisherPhoto;
	}

	public Double getPublisherCredit() {
		return this.publisherCredit;
	}

	public void setPublisherCredit(Double publisherCredit) {
		this.publisherCredit = publisherCredit;
	}

	public Boolean getPublisherAuthority() {
		return this.publisherAuthority;
	}

	public void setPublisherAuthority(Boolean publisherAuthority) {
		this.publisherAuthority = publisherAuthority;
	}

	public String getPublisherCompany() {
		return this.publisherCompany;
	}

	public void setPublisherCompany(String publisherCompany) {
		this.publisherCompany = publisherCompany;
	}

	public Boolean getPublisherType() {
		return this.publisherType;
	}

	public void setPublisherType(Boolean publisherType) {
		this.publisherType = publisherType;
	}

	public String getPublisherConnectEmail() {
		return this.publisherConnectEmail;
	}

	public void setPublisherConnectEmail(String publisherConnectEmail) {
		this.publisherConnectEmail = publisherConnectEmail;
	}

	@XmlTransient
	public Set getRecruitments() {
		return this.recruitments;
	}

	public void setRecruitments(Set recruitments) {
		this.recruitments = recruitments;
	}
	@XmlTransient
	public Set getTestTasks() {
		return this.testTasks;
	}

	public void setTestTasks(Set testTasks) {
		this.testTasks = testTasks;
	}
	@XmlTransient
	public Set getQuestionnaires() {
		return this.questionnaires;
	}

	public void setQuestionnaires(Set questionnaires) {
		this.questionnaires = questionnaires;
	}

}