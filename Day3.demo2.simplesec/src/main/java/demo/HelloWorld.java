package demo;

import org.springframework.security.access.annotation.Secured;

public class HelloWorld {
	public String method1() {
		System.out.println("in method1 ...");
		return "method1";
	}

	public String method2() {
		System.out.println("in method2 ...");
		return "method2";
	}
}
