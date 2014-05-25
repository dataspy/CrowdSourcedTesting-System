/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package cn.com.crowdsourcedtesting.controller;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import cn.com.crowdsourcedtesting.DAO.GiftDAO;
import cn.com.crowdsourcedtesting.DAO.ProductDAO;
import cn.com.crowdsourcedtesting.DAO.RecruitmentDAO;
import cn.com.crowdsourcedtesting.bean.Gift;
import cn.com.crowdsourcedtesting.bean.Publisher;
import cn.com.crowdsourcedtesting.bean.Product;
import cn.com.crowdsourcedtesting.bean.Recruitment;
import cn.com.crowdsourcedtesting.model.RecruitmentHandler;
import cn.com.crowdsourcedtesting.modelhelper.MethodNumber;
import cn.com.crowdsourcedtesting.struts.form.GiftForm;
import cn.com.crowdsourcedtesting.struts.form.PageIdForm;
import cn.com.crowdsourcedtesting.struts.form.RecruitmentForm;
import cn.com.other.page.Page;

/**
 * MyEclipse Struts Creation date: 05-02-2014
 * 
 * XDoclet definition:
 * 
 * @struts.action path="/recruitment" name="recruitmentForm"
 *                input="/recruitment.jsp" parameter="method" scope="request"
 *                validate="true"
 */
public class RecruitmentAction extends DispatchAction {

	private Page page = new Page();

	private RecruitmentHandler handler = new RecruitmentHandler();

	/*
	 * Generated Methods
	 */

	/**
	 * Method selectPage
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 */
	public ActionForward selectPage(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		RecruitmentForm recruitmentForm = (RecruitmentForm) form;// TODO
																	// Auto-generated
																	// method
																	// stub

		RecruitmentDAO dao = new RecruitmentDAO();
		int pagenow = recruitmentForm.getPagenow();
		// 一�2个招募信�
		page.setCurrentPage(pagenow);
		page.setPerRows(12);
		page.setTotalRows(dao.getTotalRows());
		handler.selectPage(page, request);

		return mapping.findForward("hirelist");
	}

	/**
	 * Method selectAllRecruitment
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 */
	public ActionForward selectAllRecruitment(ActionMapping mapping,
			ActionForm form, HttpServletRequest request,
			HttpServletResponse response) {
		RecruitmentDAO dao = new RecruitmentDAO();
		// 一�2个招募信�
		page.setCurrentPage(1);
		page.setPerRows(12);
		page.setTotalRows(dao.getTotalRows());
		handler.selectAllRecruitments(page, request);

		return mapping.findForward("hirelist");
	}

	public ActionForward selectRecentRecruitment(ActionMapping mapping,
			ActionForm form, HttpServletRequest request,
			HttpServletResponse response) {

		page.setCurrentPage(1);
		page.setPerRows(3);
		page.setTotalRows(3);
		handler.selectRecentRecruitments(page, request);

		request.setAttribute("flag", "success");

		return mapping.findForward("index");
	}

	/**
	 * Method selectRecruitment
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 */
	public ActionForward selectRecruitment(ActionMapping mapping,
			ActionForm form, HttpServletRequest request,
			HttpServletResponse response) {
		RecruitmentForm recruitmentForm = (RecruitmentForm) form;// TODO
																	// Auto-generated
																	// method
																	// stub

		int id = recruitmentForm.getId();
		handler.selectRecruitment(id, request);

		return mapping.findForward("hireitem");
	}

	/**
	 * Method addNewRecruitment
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 */
	public ActionForward addNewRecruitment(ActionMapping mapping,
			ActionForm form, HttpServletRequest request,
			HttpServletResponse response) {

		RecruitmentForm recruitmentForm = (RecruitmentForm) form;// TODO
		HttpSession session = request.getSession();
		Publisher publisher = (Publisher) session.getAttribute("Publisher");
		if (publisher == null) {
			return mapping.findForward("publisherLogin");
		} // Auto-generated
			// method
			// stub
		String title = recruitmentForm.getTitle();
		int online = recruitmentForm.getOnline();
		String place = recruitmentForm.getPlace();
		String brief = recruitmentForm.getBrief();
		String content = recruitmentForm.getContent();

		String sdate = recruitmentForm.getStartdate();
		String edate = recruitmentForm.getEnddate();

		Date startdate = null;
		Date enddate = null;

		try {
			java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(
					"MM/dd/yyyy");

			startdate = sdf.parse(sdate);
			enddate = sdf.parse(edate);			
		} catch (ParseException e) {
			System.out.println("String to Date error");
		}

		String company = recruitmentForm.getCompany();	

		handler.addNewRecruitment(title, online, startdate, enddate, place, brief, content, company, request);
				brief, content, company, publisher, request);

		return this.publisherList(mapping, recruitmentForm, request, response);
		// return this.gotoList(mapping, form, request, response);
	}

	/**
	 * Method reviceRecruitment
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 */
	public ActionForward reviceRecruitment(ActionMapping mapping,
			ActionForm form, HttpServletRequest request,
			HttpServletResponse response) {
		RecruitmentForm recruitmentForm = (RecruitmentForm) form;// TODO
																	// Auto-generated
																	// method
																	// stub
		int id = recruitmentForm.getId();
		String title = recruitmentForm.getTitle();
		String place = recruitmentForm.getPlace();
		String brief = recruitmentForm.getBrief();
		String content = recruitmentForm.getContent();
		String company = recruitmentForm.getCompany();

		handler.reviceRecruitment(id, title, place, brief, content, company,
				request);

		return this.publisherList(mapping, recruitmentForm, request, response);
		// return this.gotoList(mapping, recruitmentForm, request, response);
	}

	public ActionForward gotoBackStage(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {

		return mapping.findForward("backstage");
	}

	public ActionForward gotoPub(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {

		request.setAttribute("isLegal", "legal");

		return mapping.findForward("additem");
	}

	/*
	 * public ActionForward gotoList(ActionMapping mapping, ActionForm form,
	 * HttpServletRequest request, HttpServletResponse response) {
	 * RecruitmentForm recruitmentForm = (RecruitmentForm) form;// TODO //
	 * Auto-generated // method // stub RecruitmentDAO dao = new
	 * RecruitmentDAO(); int perrow = recruitmentForm.getPerrow(); if (perrow ==
	 * 0) perrow = 5; System.out.println(perrow); // 后台一�个招募信�
	 * page.setCurrentPage(1); page.setPerRows(perrow);
	 * page.setTotalRows(dao.getTotalRows());
	 * handler.selectAllRecruitments(page, request); perrow = 0;
	 * 
	 * return mapping.findForward("checklist"); }
	 */

	public ActionForward gotoItem(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		RecruitmentForm recruitmentForm = (RecruitmentForm) form;// TODO
																	// Auto-generated
																	// method
																	// stub

		int id = recruitmentForm.getId();
		handler.selectRecruitment(id, request);

		return mapping.findForward("edititem");
	}

	/**
	 * 发布者管理招募的列表
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward publisherList(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {

		RecruitmentForm f = (RecruitmentForm) form;
		HttpSession session = request.getSession();
		Publisher publisher = (Publisher) session.getAttribute("Publisher");
		if (publisher == null) {
			return mapping.findForward("publisherLogin");
		}

		PageIdForm pageIDForm = new PageIdForm();
		if (f != null) {
			pageIDForm.setId(f.getId() + "");
			pageIDForm.setPage(f.getPage());
			pageIDForm.setSubType(f.getSubType());
		}

		request.setAttribute("isLegal", "legal");
		// 交给事务处理
		handler.ListHandle(pageIDForm, request, MethodNumber.MethodOne); // 调用第一个接�
		return mapping.findForward("checklist");
	}

	/**
	 * 发布者查看招募信息的具体信息
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward publisherDetail(ActionMapping mapping, ActionForm form, HttpServletRequest request,
		HttpServletResponse response) {
		RecruitmentForm f = (RecruitmentForm) form;
		HttpSession session = request.getSession();
		Publisher publisher = (Publisher) session.getAttribute("Publisher");
		if (publisher == null) {
			return mapping.findForward("publisherLogin");
		}
		
		PageIdForm pageIDForm = new PageIdForm();
		if (f != null) {
			pageIDForm.setId(f.getId() + "");
			pageIDForm.setPage(f.getPage());
			pageIDForm.setSubType(f.getSubType());
		}
		handler.detailHandle(pageIDForm, request, MethodNumber.MethodOne);
		request.setAttribute("isLegal", "legal");
		return mapping.findForward("edititem");

	}
	
	

}