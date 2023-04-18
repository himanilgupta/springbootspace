package demo1;

import org.springframework.stereotype.Component;

@Component(value= "mysql")
public class MySQLConnection implements Connection {

	@Override
	public void open() {
		System.out.println("mysql connection open invoked");
	}

	@Override
	public void close() {
		System.out.println("mysql connection close invoked");
	}

}
