package demo;

import org.springframework.stereotype.Component;

@Component(value="dbconnection")
public class DBConnection {
	private String url ="jdbc:oracle:thin";
    private String username;
    private String password;

    public DBConnection() {
        System.out.println("DBConnection constructor invoked ");
    }
    
    public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void open() {
        System.out.println("opening connection");
    }
    public void close() {
        System.out.println("closing connection");
    }

	@Override
	public String toString() {
		return "DBConnection [url=" + url + ", username=" + username + ", password=" + password + "]";
	}     
    
}
