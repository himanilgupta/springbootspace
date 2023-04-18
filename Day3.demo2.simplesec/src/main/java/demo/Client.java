package demo; 

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.context.SecurityContextImpl;

import demo.HelloWorld;

public class Client {

	public static void main(String[] args) {
		SecurityContextImpl scimpl = new SecurityContextImpl();
		Authentication auth = new UsernamePasswordAuthenticationToken("user3", "pass3");
		scimpl.setAuthentication(auth);
		SecurityContextHolder.setContext(scimpl);

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("demo.xml");
		HelloWorld hw = ctx.getBean("hw", HelloWorld.class);
		System.out.println("method1 returned = " + hw.method1());

		System.out.println("method2 returned = " + hw.method2());
	}
}
