package demo;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client3 {
public static void main(String[] args) {
	ApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfig.class);
	System.out.println(Arrays.toString(ctx.getBeanDefinitionNames()));
	Inventory inv = ctx.getBean(Inventory.class);
	inv.print();
}
}
