package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Simple s1 = new Simple();
		ApplicationContext context = new ClassPathXmlApplicationContext("demo.xml");
		System.out.println("----------Context is loaded----------");
		Simple s1 = context.getBean("simple", Simple.class);
		Simple s2 = context.getBean("simple", Simple.class);
		s1.m1();
		s2.m1();
	}
}
