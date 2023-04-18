package demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration(value = "myconfig")
@ComponentScan(basePackages = "demo")
public class MyConfig {

}
