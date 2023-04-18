package demo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="deptdao")
public class DeptDAO {

	public DeptDAO() {
        System.out.println("in DeptDAO constuctor = "  + con);
    }
    @Autowired
    private DBConnection con;

    @PostConstruct()
    public void xxx() {
        System.out.println("In PostContruct");
        System.out.println("Method should be invoked after all setters");
    }
    @PreDestroy
    public void yyy() {
        System.out.println("PreDestroy invoked");
    }
    public void save() {
        System.out.println("con is " + con);
        con.open();
        System.out.println("saving deptdao");
        con.close();
    }


    public DBConnection getCon() {
        return con;
    }


    public void setCon(DBConnection con) {
        this.con = con;
    }

}
