/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package cn.com.crowdsourcedtesting.struts.form;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

/** 
 * MyEclipse Struts
 * Creation date: 06-05-2014
 * 
 * XDoclet definition:
 * @struts.form name="bugReportManagementForm"
 */
public class BugReportManagementForm extends ActionForm {
	/*
	 * Generated Methods
	 */

	private Integer taskId;
	
	private Integer bugReportId;
	
	private String ensure;
	
	/** 
	 * Method validate
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
	 * @param mapping
	 * @param request
	 */
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		// TODO Auto-generated method stub
	}

	public Integer getTaskId() {
		return taskId;
	}

	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}

	public Integer getBugReportId() {
		return bugReportId;
	}

	public void setBugReportId(Integer bugReportId) {
		this.bugReportId = bugReportId;
	}

	public String getEnsure() {
		return ensure;
	}

	public void setEnsure(String ensure) {
		this.ensure = ensure;
	}
	
	
}