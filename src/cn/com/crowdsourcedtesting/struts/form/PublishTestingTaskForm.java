/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package cn.com.crowdsourcedtesting.struts.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.upload.FormFile;

/**
 * MyEclipse Struts Creation date: 05-24-2014
 * 
 * XDoclet definition:
 * 
 * @struts.form name="publishTestingTaskForm"
 */
public class PublishTestingTaskForm extends ActionForm {
	/**
	 * 
	 */
	private static final long serialVersionUID = -994252519917394189L;

	/*
	 * Generated fields
	 */

	/** icon property */
	private FormFile icon;

	/** webUrl property */
	private String webUrl;

	/** description property */
	private String description;

	/** webName property */
	private String webName;

	private Integer perReward;

	private Integer wholeReward;

	private String daterange;

	private String appName;

	private FormFile apkFile;
	
	private String downLoadLink;

	/*
	 * Generated Methods
	 */

	/**
	 * Method validate
	 * 
	 * @param mapping
	 * @param request
	 * @return ActionErrors
	 */
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Method reset
	 * 
	 * @param mapping
	 * @param request
	 */
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		// TODO Auto-generated method stub
	}

	/**
	 * Returns the icon.
	 * 
	 * @return String
	 */
	public FormFile getIcon() {
		return icon;
	}

	/**
	 * Set the icon.
	 * 
	 * @param icon
	 *            The icon to set
	 */
	public void setIcon(FormFile icon) {
		this.icon = icon;
	}

	/**
	 * Returns the webUrl.
	 * 
	 * @return String
	 */
	public String getWebUrl() {
		return webUrl;
	}

	/**
	 * Set the webUrl.
	 * 
	 * @param webUrl
	 *            The webUrl to set
	 */
	public void setWebUrl(String webUrl) {
		this.webUrl = webUrl;
	}

	/**
	 * Returns the description.
	 * 
	 * @return String
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Set the description.
	 * 
	 * @param description
	 *            The description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Returns the webName.
	 * 
	 * @return String
	 */
	public String getWebName() {
		return webName;
	}

	/**
	 * Set the webName.
	 * 
	 * @param webName
	 *            The webName to set
	 */
	public void setWebName(String webName) {
		this.webName = webName;
	}

	public Integer getPerReward() {
		return perReward;
	}

	public void setPerReward(Integer perReward) {
		this.perReward = perReward;
	}

	public Integer getWholeReward() {
		return wholeReward;
	}

	public void setWholeReward(Integer wholeReward) {
		this.wholeReward = wholeReward;
	}

	public String getDaterange() {
		return daterange;
	}

	public void setDaterange(String daterange) {
		this.daterange = daterange;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public FormFile getApkFile() {
		return apkFile;
	}

	public void setApkFile(FormFile apkFile) {
		this.apkFile = apkFile;
	}

	public String getDownLoadLink() {
		return downLoadLink;
	}

	public void setDownLoadLink(String downLoadLink) {
		this.downLoadLink = downLoadLink;
	}

}