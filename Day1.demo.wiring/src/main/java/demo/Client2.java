package demo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import demo1.EmpDAO;

@Configuration
@ComponentScan(basePackages = "demo, demo1")
public class Client2 {
	@Bean
	@Scope(value = "prototype")
    public Simple ss() {
        System.out.println("getSS method invoked ");
        return new Simple();
    }

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Client2.class);
        System.out.println("-------------Context Loaded----------------");
        System.out.println("Bean Names = " + Arrays.toString(ctx.getBeanDefinitionNames()));
//        Simple s1 = ctx.getBean("s1", Simple.class);
//        s1.m1();
//        Simple s2 = ctx.getBean("s1", Simple.class);
//        s2.m1();
//        Simple ss = ctx.getBean("ss", Simple.class);
//        ss.m1();
//        Simple ss1 = ctx.getBean("ss", Simple.class);
//        ss1.m1();
        
//        DeptDAO dao = ctx.getBean("deptdao", DeptDAO.class);
//		dao.save();
//		ctx.close();
		
        EmpDAO dao1 = ctx.getBean("empdao", EmpDAO.class);
        dao1.save();
        ctx.close();

    
	}
	

	}