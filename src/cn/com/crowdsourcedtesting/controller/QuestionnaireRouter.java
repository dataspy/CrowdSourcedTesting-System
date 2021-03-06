/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package cn.com.crowdsourcedtesting.controller;

import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import cn.com.crowdsourcedtesting.model.QuestionnaireHandler;
import cn.com.crowdsourcedtesting.modelhelper.MethodNumber;
import cn.com.crowdsourcedtesting.struts.form.CheckQuestionnaireDetailForm;
import cn.com.crowdsourcedtesting.struts.form.PageIdForm;
import cn.com.crowdsourcedtesting.struts.form.PublisherQuestionnaireForm;
import cn.com.crowdsourcedtesting.struts.form.QuestionnaireDisplayForm;
import cn.com.crowdtest.factory.DAOFactory;
import cn.com.crowdtest.factory.HibernateSessionFactory;
import cn.com.crowdsourcedtesting.DAO.QuestionnaireDAO;
import cn.com.crowdsourcedtesting.bean.*;
import cn.com.other.page.Page;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * MyEclipse Struts Creation date: 05-02-2014
 * 
 * XDoclet definition:
 * 
 * @struts.action validate="true"
 */
public class QuestionnaireRouter extends DispatchAction {
	/*
	 * Generated Methods
	 */

	QuestionnaireHandler myHandler = new QuestionnaireHandler();

	/**
	 * 跳转到发布页�
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward goToPublish(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {

		
		return mapping.findForward("add");
	}

	/**
	 * 添加问卷
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward Publish(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

		return mapping.findForward("add");
	}

	/**
	 * 创建问卷
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward createItem(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

		PublisherQuestionnaireForm f = (PublisherQuestionnaireForm) form;

		/*
		 * PrintWriter out; try { out = response.getWriter();
		 * out.print(f.getChoices()); } catch (IOException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */

		HttpSession session = request.getSession();

		if (session.getAttribute("Publisher") != null) {
			Publisher publisher = (Publisher) session.getAttribute("Publisher");

			myHandler.createItem(f, request);

		} else {
			return mapping.findForward("publisherLogin");
		}

		return mapping.findForward("add");
	}

	/**
	 * 审核的列�
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 */

	public ActionForward checkList(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

		PageIdForm pageIDForm = (PageIdForm) form;

		// 交给事务处理
		myHandler.ListHandle(pageIDForm, request, MethodNumber.MethodOne); // 调用第一个接�

		return mapping.findForward("list");
	}

	/**
	 * 发布者查看的列表
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 */

	public ActionForward questionnaireList(ActionMapping mapping,
			ActionForm form, HttpServletRequest request,
			HttpServletResponse response) {
		// TODO Auto-generated method stub

		PageIdForm pageIDForm = (PageIdForm) form;
		HttpSession session = request.getSession();
		Publisher publisher = (Publisher) session.getAttribute("Publisher");

		if (publisher == null) {
			return mapping.findForward("publisherLogin");
		}

		// 交给事务处理
		myHandler.ListHandle(pageIDForm, request, MethodNumber.MethodTwo); // 调用第一个接�

		return mapping.findForward("list");
	}

	/**
	 * 进入要审核的问卷详情
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward checkDetail(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

		PageIdForm pageIDForm = (PageIdForm) form;

		// 交给事务处理
		myHandler.detailHandle(pageIDForm, request, MethodNumber.MethodOne);

		return mapping.findForward("detail");
	}

	/**
	 * 发布者要查看的问卷详�
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward questionnaireDetail(ActionMapping mapping,
			ActionForm form, HttpServletRequest request,
			HttpServletResponse response) {
		// TODO Auto-generated method stub

		PageIdForm pageIDForm = (PageIdForm) form;

		// 交给事务处理
		myHandler.detailHandle(pageIDForm, request, MethodNumber.MethodOne);

		return mapping.findForward("detail");
	}

	/**
	 * 显示动态效果图
	 */
	public ActionForward display(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

		QuestionnaireDisplayForm f = (QuestionnaireDisplayForm) form;

		// 交给事务处理
		HttpSession session = request.getSession();
		System.out.println("_---------------------" + f.getQuestionID());
		session.setAttribute("questionID", f.getQuestionID());
		PageIdForm p = new PageIdForm();
		p.setId(f.getQuestionnaireID());

		return this.questionnaireDetail(mapping, p, request, response);

	}

	/**
	 * 审核问卷的处�
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 */

	public ActionForward checkConfirm(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

		CheckQuestionnaireDetailForm detailForm = (CheckQuestionnaireDetailForm) form;

		HttpSession session = request.getSession();

		Administrator admin = (Administrator) session // 得到审核者的信息
				.getAttribute("Administrator");

		if (admin == null) { // 审核者未登录

			return mapping.findForward("adminLogin");

		} else if (form == null) { // 如果传过来的表单为空

			// 如果表单为空，则直接跳转到列�
			Page currentPage = (Page) session.getAttribute("currentPage");
			PageIdForm p = new PageIdForm();
			p.setPage(currentPage.getCurrentPage() + "");

			return this.checkList(mapping, p, request, response);

		} else {

			String subType = detailForm.getSubType(); // 通过或者不通过类型

			int id = Integer.parseInt(detailForm.getId()); // 得到要处理的问卷
			QuestionnaireDAO qd = DAOFactory.getQuestionnaireDAO();
			Questionnaire q = qd.findById(id);
			q.setAdministrator(admin);
			String content="";
			if ("yes".equals(subType)) { // 审核通过

				q.setIsPassed(true);
				content="恭喜您" +
						"您在TC众测网发布的问卷：<br>" +
						"问卷名称："+q.getTitle()+"<br>"+
						
						"审核成功!<br>";

			} else // 审核不通过
			{

				q.setIsPassed(false);
				content="抱歉，" +
						"您在TC众测网发布的问卷：<br>" +
						"问卷名称："+q.getTitle()+"<br>"+
						
						"审核失败！请您及时处理<br>";

			}
			qd.save(q); // 修改数据�
            myHandler.sendEmail(q.getPublisher().getPublisherLogEmail(), content, "问卷审核结果");
			Page currentPage = (Page) session.getAttribute("currentPage");
			PageIdForm p = new PageIdForm();
			p.setPage(currentPage.getCurrentPage() + "");
			return this.checkList(mapping, p, request, response);
		}

	}

	/**
	 * 前台问卷列表显示
	 */
	public ActionForward pageQuestionnaire(ActionMapping mapping,
			ActionForm form, HttpServletRequest request,
			HttpServletResponse response) {
		// TODO Auto-generated method stub

		PageIdForm pageIDForm = (PageIdForm) form;

		// 交给事务处理
		myHandler.ListHandle(pageIDForm, request, MethodNumber.MethodThree); // 调用第一个接�

		return mapping.findForward("list");

	}

	/**
	 * 前台的问卷内�
	 */

	public ActionForward pageDetail(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

		
	
		PageIdForm pageIDForm = (PageIdForm) form;

		// 交给事务处理
		myHandler.detailHandle(pageIDForm, request, MethodNumber.MethodTwo);

		return mapping.findForward("detail");

	}

	/**
	 * 提交问卷的处�
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward subQuestionnaire(ActionMapping mapping,
			ActionForm form, HttpServletRequest request,
			HttpServletResponse response) {
		// TODO Auto-generated method stub

		HttpSession session = request.getSession();
		Tester tester = (Tester) session.getAttribute("Tester");

		if (tester == null) {
			return mapping.findForward("testerLogin");
		}

		CheckQuestionnaireDetailForm detailForm = (CheckQuestionnaireDetailForm) form;

		if (detailForm == null) {
			return mapping.findForward("page_detail");
		}

		String result = detailForm.getSubType(); // 编码格式：||54-34||32-44
		String id = detailForm.getId();

		Session sess = HibernateSessionFactory.getSession();
		Transaction tx = null;
		try {
			tx = sess.beginTransaction();
			
			result = result.substring(result.indexOf("||")+2,result.length());
			while (result != null && !result.equals("")) {
				String item = null;
				System.out.println("result:"+result);
				
				
				if (result.indexOf("||")>-1) {
					item = result.substring(result.indexOf("-")+1
							,result.indexOf("||"));
					
					result = result.substring(result.indexOf("||") + 2,
							result.length());
				} else{
					item = result.substring(result.indexOf("-")+1
						, result.length());
					result = null;
				}
				
				int choiceID = Integer.parseInt(item);
				Choice choice = DAOFactory.getChoiceDAO().findById(choiceID);
				choice.setSelectCount(choice.getSelectCount()+1);
			    sess.saveOrUpdate(choice);
				
			}
			
			int questionnaireID = Integer.parseInt(id);
			Questionnaire questionnaire = DAOFactory.getQuestionnaireDAO()
					.findById(questionnaireID);
			questionnaire.setQuestionnaireCount(questionnaire.getQuestionnaireCount()+1);
			sess.saveOrUpdate(questionnaire);
			JoinQuestionnaire join = new JoinQuestionnaire();
			join.setJoinTime(new Date());
			join.setQuestionnaire(questionnaire);
			join.setTester(tester);
            sess.save(join);
			tx.commit();
			session.setAttribute("hasJoined", "true");

		} catch (RuntimeException e) {
			e.printStackTrace();
			if (tx != null) {
				tx.rollback();
			}
		} finally {
			sess.close();
		}

		
		return mapping.findForward("page_detail");

	}
}