package demo1;

import org.springframework.stereotype.Component;

@Component(value= "ora")
public class OracleConnection implements Connection {

	@Override
	public void open() {
		System.out.println("oracle connection open invoked");
		
	}

	@Override
	public void close() {
		System.out.println("oracle connection close invoked");
	}

}
