/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package cn.com.crowdsourcedtesting.controller;

import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import cn.com.crowdsourcedtesting.model.RegistrationHandler;
import cn.com.crowdsourcedtesting.struts.form.RegistrationPublisherForm;
import cn.com.crowdsourcedtesting.struts.form.RegistrationTesterForm;

import javax.mail.Address;   
import javax.mail.Authenticator;
import javax.mail.BodyPart;   
import javax.mail.Message;   
import javax.mail.Multipart;   
import javax.mail.PasswordAuthentication;
import javax.mail.Session;   
import javax.mail.Transport;   
import javax.mail.internet.InternetAddress;   
import javax.mail.internet.MimeBodyPart;   
import javax.mail.internet.MimeMessage;   
import javax.mail.internet.MimeMultipart;   
import java.util.Properties;

/** 
 * MyEclipse Struts
 * Creation date: 05-02-2014
 * 
 * XDoclet definition:
 * @struts.action path="/registrationTester" name="registrationTesterForm" scope="request" validate="true"
 */
public class RegistrationRouter extends DispatchAction {
	/*
	 * Generated Methods
	 */

	private RegistrationHandler handler = new RegistrationHandler();
	
	
	
	
	/** 
	 * Method execute
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 */
	public ActionForward testerRegistrationActivate(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		RegistrationTesterForm registrationTesterForm = (RegistrationTesterForm) form;// TODO Auto-generated method stub

		RandomCode randomcode = new RandomCode();
		
		registrationTesterForm.setCode(randomcode.getRandomCode(4));
		
		MyAuthenticator authenticator = new MyAuthenticator("lin1014582610@163.com","zhaoyunting36057");
		
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.163.com");   
	    props.put("mail.smtp.port", "25");  
	    props.put("mail.transport.protocol", "smtp");
	    props.put("mail.smtp.auth", "true");
		
		Session sendMailSession = Session.getDefaultInstance(props,authenticator);
		
		try {
			
			Message mailMessage = new MimeMessage(sendMailSession);
			Address fromaAddress = new InternetAddress("lin1014582610@163.com");
			mailMessage.setFrom(fromaAddress);
			Address toAddress = new InternetAddress(registrationTesterForm.getEmail());
			mailMessage.setRecipient(Message.RecipientType.TO, toAddress);
			mailMessage.setSubject("注册验证码");
			mailMessage.setSentDate(new Date());
			Multipart mainpart = new MimeMultipart();
			BodyPart html = new MimeBodyPart();
			html.setContent(registrationTesterForm.getCode(),"text/html;charset=utf-8");
			mainpart.addBodyPart(html);
			mailMessage.setContent(mainpart);
			
			
			Transport transport = sendMailSession.getTransport("smtp");
		    transport.connect("smtp.163.com","lin1014582610@163.com", "zhaoyunting36057");
		    transport.sendMessage(mailMessage, mailMessage.getAllRecipients());
		    transport.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		request.setAttribute("randomcode", registrationTesterForm.getCode());
		request.setAttribute("name", registrationTesterForm.getName());
		request.setAttribute("email", registrationTesterForm.getEmail());
		request.setAttribute("password", registrationTesterForm.getPassword());
		request.setAttribute("gender", registrationTesterForm.getGender());
		request.setAttribute("mobile", registrationTesterForm.getMobile());
		request.setAttribute("birthday", registrationTesterForm.getBirthday());
		
		return mapping.findForward("activate");
	}
	
	public ActionForward testerRegistration(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		RegistrationTesterForm registrationTesterForm = (RegistrationTesterForm) form;// TODO Auto-generated method stub
		
		handler.handleRegistrationTester(request,registrationTesterForm);
			
		return mapping.findForward("success");

	}
	
	public ActionForward publisherRegistrationActive(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		RegistrationPublisherForm registrationPublisherForm =(RegistrationPublisherForm) form;
		
		RandomCode randomcode = new RandomCode();
		
		registrationPublisherForm.setCode(randomcode.getRandomCode(4));
		
		MyAuthenticator authenticator = new MyAuthenticator("lin1014582610@163.com","zhaoyunting36057");
		
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.163.com");   
	    props.put("mail.smtp.port", "25");  
	    props.put("mail.transport.protocol", "smtp");
	    props.put("mail.smtp.auth", "true");
		
		Session sendMailSession = Session.getDefaultInstance(props,authenticator);
		
		try {
			
			Message mailMessage = new MimeMessage(sendMailSession);
			Address fromaAddress = new InternetAddress("lin1014582610@163.com");
			mailMessage.setFrom(fromaAddress);
			Address toAddress = new InternetAddress(registrationPublisherForm.getLogEmail());
			mailMessage.setRecipient(Message.RecipientType.TO, toAddress);
			mailMessage.setSubject("注册验证码");
			mailMessage.setSentDate(new Date());
			Multipart mainpart = new MimeMultipart();
			BodyPart html = new MimeBodyPart();
			html.setContent(registrationPublisherForm.getCode(),"text/html;charset=utf-8");
			mainpart.addBodyPart(html);
			mailMessage.setContent(mainpart);
			
			
			Transport transport = sendMailSession.getTransport("smtp");
		    transport.connect("smtp.163.com","lin1014582610@163.com", "zhaoyunting36057");
		    transport.sendMessage(mailMessage, mailMessage.getAllRecipients());
		    transport.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		request.setAttribute("randomcode", registrationPublisherForm.getCode());
		request.setAttribute("authority", registrationPublisherForm.getAuthority());
		request.setAttribute("logEmail", registrationPublisherForm.getLogEmail());
		request.setAttribute("publisherName", registrationPublisherForm.getPublisherName());
		request.setAttribute("type", registrationPublisherForm.getType());
		request.setAttribute("credit", registrationPublisherForm.getCredit());
		request.setAttribute("password", registrationPublisherForm.getPassword());
		request.setAttribute("connectEmail", registrationPublisherForm.getConnectEmail());
		request.setAttribute("companyName", registrationPublisherForm.getCompanyName());
		request.setAttribute("license", registrationPublisherForm.getLicense());
		request.setAttribute("photo", registrationPublisherForm.getPhoto());
		
		
		return mapping.findForward("activate");
	}
	
	public ActionForward publisherRegistration(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		RegistrationPublisherForm registrationPublisherForm = (RegistrationPublisherForm) form;
		
		handler.handleRegistrationPublisher(request,registrationPublisherForm);
		
		return mapping.findForward("success");
	}
}
class MyAuthenticator extends Authenticator{  
    String userName=null;  
    String password=null;  
       
    public MyAuthenticator(){  
    }  
    public MyAuthenticator(String username, String password) {   
        this.userName = username;   
        this.password = password;   
    }   
    @Override
	protected PasswordAuthentication getPasswordAuthentication(){  
        return new PasswordAuthentication(userName, password);  
    }  
}  