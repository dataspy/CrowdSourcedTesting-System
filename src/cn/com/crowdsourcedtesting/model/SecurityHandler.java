package cn.com.crowdsourcedtesting.model;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.omg.DynamicAny.DynAnyOperations;

import cn.com.crowdsourcedtesting.bean.Administrator;
import cn.com.crowdsourcedtesting.bean.Publisher;
import cn.com.crowdsourcedtesting.bean.Questionnaire;
import cn.com.crowdsourcedtesting.bean.Tester;
import cn.com.crowdsourcedtesting.struts.form.AdminLoginForm;
import cn.com.crowdsourcedtesting.struts.form.LoginForm;
import cn.com.crowdsourcedtesting.struts.form.PublisherLoginForm;
import cn.com.crowdtest.factory.DAOFactory;
import cn.com.other.page.Page;

public class SecurityHandler extends GeneralHandler {

	// 测试用户的登录
	public Tester handleTesterLogin(LoginForm form)
	{
		Tester tester=DAOFactory.getTesterDAO().isTester(form.getUsername(), form.getPassword());

		return tester;
		
	}
	
	// 发布者的登录
		public Publisher handlePublisherLogin(PublisherLoginForm form)
		{
			Publisher publisher=DAOFactory.getPublisherDAO().isPublisher(form.getUsername(), form.getPassword());

			
			return publisher;
			
			
		}
		
     //管理员的登录
		public Administrator handleAdministratorLogin(AdminLoginForm form)
		{
			Administrator administrator = DAOFactory.getAdministratorDAO().isAdministrator(form.getUsername(), form.getPassword());
			return administrator;
		}

		
	//第一个列表接口： 得到企业注册用户
		@Override
		public void setTargetListOne(Page page, HttpServletRequest request) {
			// TODO Auto-generated method stub
			
			
			page.setTotalRows(DAOFactory.getPublisherDAO().getUncheckedCompanyTotalRows());
			List <Publisher> registers  = DAOFactory.getPublisherDAO().findUncheckedCompanyByPage(page);
			HttpSession session  = request.getSession();
			session.setAttribute("currentPage", page);
			session.setAttribute("registers", registers);
			session.setAttribute("publisherType", "Company");
			
			
		}
  //第二个个列表接口,得到个人注册用户
		@Override
		public void setTargetListTwo(Page page, HttpServletRequest request) {
			// TODO Auto-generated method stub
			
			page.setTotalRows(DAOFactory.getPublisherDAO().getUncheckedPersonTotalRows());
			List <Publisher> registers  = DAOFactory.getPublisherDAO().findUncheckedPersonByPage(page);
			HttpSession session  = request.getSession();
			session.setAttribute("currentPage", page);
			session.setAttribute("registers", registers);
			session.setAttribute("publisherType", "Person");
			
		}

		@Override
		public void setTargetListThree(Page page, HttpServletRequest request) {
			// TODO Auto-generated method stub
			
		}

		
		//DetailHandle的处理接口1
		@Override
		public void setTargetDetailOne(int id, HttpServletRequest request) {
			// TODO Auto-generated method stub
			Publisher publisher = DAOFactory.getPublisherDAO().findById(id);
			HttpSession session  = request.getSession();

			session.setAttribute("publisher", publisher);
			session.setAttribute("publisherType", "Company");
			
		}
		//DetailHandle的处理接口2
		@Override
		public void setTargetDetailTwo(int id, HttpServletRequest request) {
			// TODO Auto-generated method stub
			Publisher publisher = DAOFactory.getPublisherDAO().findById(id);
			HttpSession session  = request.getSession();

			session.setAttribute("publisher", publisher);
			session.setAttribute("publisherType", "Person");
			
		}

		@Override
		public void setTargetDetailThree(int id, HttpServletRequest request) {
			// TODO Auto-generated method stub
			
		}
		
		
		
	
		
		
		}
