package cn.com.crowdsourcedtesting.bean;

import java.util.List;

import org.hibernate.Session;


import cn.com.crowdsourcedtesting.DAO.*;
import cn.com.crowdsourcedtesting.base.BaseHibernateDAO;
import cn.com.crowdsourcedtesting.base.HibernateSessionFactory;

import cn.com.crowdtest.factory.BeanFactory;
import cn.com.crowdtest.factory.DAOFactory;

public class testing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 /*  GiftDAO gd=  DAOFactory.getGiftDAO();
		
		List<Gift> gifts=gd.findAll();
		System.out.println();
		System.out.println(gifts.size());
		
		Gift g =  new  Gift();
	
		g.setGiftName("礼品");
		g.setGiftPhoto("000");
		g.setGiftCredit(12.00);
		g.setGiftAmount(22);
		
		
		gd.save(g);
		
		System.out.println(gd.getTotalRows());
*/
		/*Tester tester = new Tester();
		tester.setTesterEmail("ezhihan@gmail.com");
		tester.setTesterPassword("1234");
		tester.setTesterName("ezhihan");
		
		DAOFactory.getTesterDAO().save(tester);*/
		
//		Tester tester = DAOFactory.getTesterDAO().isTester("ezhihan@gmail.com", "123");
//		
//		if(tester!=null)
//		{
//			System.out.println(tester.getTesterId());
//		}
		
		/*Session session = HibernateSessionFactory.getSession();
		Questionnaire q = BeanFactory.getQuestionnaire();
		Question q1 = BeanFactory.getQuestion();
		Choice c1= BeanFactory.getChoice();
		c1.setChoiceContent("怎么样");
		q1.setQuestionContent("你喜欢那个英雄");
		q.setTitle("游戏问卷");
		
		q1.getChoices().add(c1);
		q.getQuestions().add(q1);
		
		DAOFactory.getChoiceDAO().save(c1);
		DAOFactory.getQuestionDAO().save(q1);
		DAOFactory.getQuestionnaireDAO().save(q);*/
	}

}
