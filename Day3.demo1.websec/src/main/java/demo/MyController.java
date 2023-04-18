package demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class MyController {
	@GetMapping
	public String index() {
		System.out.println("in index of MyController");
		return "<h1>Index Page</h1><h1><a href='admin/m1'>Admin method1</a></h1><h1><a href='admin/m2'>Admin method2</a></h1>";
	}

	@GetMapping(value = "/admin/m1")
	public String m1() {
		System.out.println("in m1 of MyController");
		return "<h1>Method1 Page</h1><h2><a href='/'>Home</a> ";
	}

	@GetMapping(value = "/admin/m2")
	public String m2() {
		System.out.println("in m2 of MyController");
		return "<h1>Method2 Page</h1><h2><a href='/'>Home</a> ";
	}
}
