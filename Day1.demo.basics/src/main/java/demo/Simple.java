package demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "singleton")
public class Simple {
        public Simple() {
            System.out.println("Simple Constructor invoked ");
        }
        public void m1() {
            System.out.println("m1 invoked ");
        }
        public void m2() {
            System.out.println("m2 invoked ");
        }
    }

