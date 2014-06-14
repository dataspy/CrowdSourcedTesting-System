package cn.com.crowdsourcedtesting.testing;


import java.io.File;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import servletunit.struts.MockStrutsTestCase;

public class QuestionnaireTesting extends MockStrutsTestCase {

	@Before
	protected void setUp() throws Exception {
		super.setUp();
		setContextDirectory(new File("WebRoot"));
		setContextDirectory(new File("WebRoot"));
		setRequestPathInfo("/manage");
		addRequestParameter("username", "SHAWN@126.COM");
		addRequestParameter("password", "123456");
		addRequestParameter("method", "manage");
		actionPerform();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public final void testManagePublisherList() {
		setRequestPathInfo("/information");
		addRequestParameter("method", "managePublisherList");
		addRequestParameter("id", "1");
		addRequestParameter("page", "3");
		addRequestParameter("subType", "pageNum");
		actionPerform();
		verifyForward("publisherList");
	}

	@Test
	public final void testManageCompanyList() {
		setRequestPathInfo("/information");
		addRequestParameter("method", "manageCompanyList");
		addRequestParameter("id", "1");
		addRequestParameter("page", "3");
		addRequestParameter("subType", "previousPage");
		actionPerform();
		verifyForward("publisherList");
		assertEquals("true", getRequest().getAttribute("isLegal"));
	}

	@Test
	public final void testManagePersonList() {
		setRequestPathInfo("/information");
		addRequestParameter("method", "managePersonList");
		addRequestParameter("id", "1");
		addRequestParameter("page", "3");
		addRequestParameter("subType", "nextPage");
		actionPerform();
		verifyForward("publisherList");
		assertEquals("true", getRequest().getAttribute("isLegal"));
	}
	@Test
	public final void testMaintainPublisherFail() {
		//id == null 
		setRequestPathInfo("/information");
		addRequestParameter("method", "maintainPublisher");
		addRequestParameter("username", "linyiwei");
		addRequestParameter("status", "1");
		addRequestParameter("license", "营业执照00XX11");
		addRequestParameter("company", "网易公司");
		addRequestParameter("credit", "10000");
		actionPerform();
		verifyForward("publisherDetail");
		assertEquals("failed", getRequest().getAttribute("modify"));
		//id == wrong
		setRequestPathInfo("/information");
		addRequestParameter("method", "maintainPublisher");
		addRequestParameter("id", "1");
		addRequestParameter("username", "linyiwei");
		addRequestParameter("status", "1");
		addRequestParameter("license", "营业执照00XX11");
		addRequestParameter("company", "网易公司");
		addRequestParameter("credit", "10000");
		actionPerform();
		verifyForward("publisherDetail");
		assertEquals("failed", getRequest().getAttribute("modify"));
		//username = null
		setRequestPathInfo("/information");
		addRequestParameter("method", "maintainPublisher");
		addRequestParameter("id", "47");
		addRequestParameter("status", "1");
		addRequestParameter("license", "营业执照00XX11");
		addRequestParameter("company", "网易公司");
		addRequestParameter("credit", "10000");
		actionPerform();
		verifyForward("publisherDetail");
		assertEquals("success", getRequest().getAttribute("modify"));
	}
	
	@Test
	public final void testMaintainTesterSuccess() {
		setRequestPathInfo("/information");
		addRequestParameter("method", "maintainTester");
		addRequestParameter("id", "29");
		addRequestParameter("username", "linyiwei");
		actionPerform();
		verifyForward("testerDetail");
		assertEquals("success", getRequest().getAttribute("modify"));
	}
	

}
