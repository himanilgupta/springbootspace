package demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value="empdao")
public class EmpDAO {

	@Autowired()
	@Qualifier(value = "mysql")
    private Connection con;

    
    public void save() {
        System.out.println("con is " + con);
        con.open();
        System.out.println("saving deptdao");
        con.close();
    }

}
