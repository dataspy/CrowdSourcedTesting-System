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
 * Creation date: 05-28-2014
 * 
 * XDoclet definition:
 * @struts.form name="testTaskViewListForm"
 */
public class TestTaskViewListForm extends ActionForm {
	/*
	 * Generated fields
	 */

	/** page property */
	private Integer page;

	/*
	 * Generated Methods
	 */

	/** 
	 * Method validate
	 * @param mapping
	 * @param request
	 * @return ActionErrors
	 */
	@Override
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
	@Override
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		// TODO Auto-generated method stub
	}

	/** 
	 * Returns the page.
	 * @return Integer
	 */
	public Integer getPage() {
		return page;
	}

	/** 
	 * Set the page.
	 * @param page The page to set
	 */
	public void setPage(Integer page) {
		this.page = page;
	}
}