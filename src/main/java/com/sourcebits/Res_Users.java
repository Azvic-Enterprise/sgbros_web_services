/**
 * 
 */
package main.java.com.sourcebits;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Manjushree
 *
 */
@Entity
@Table(name="res_users")
public class Res_Users {
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="login")
	private String login;
	
	@Column(name="password")
	private String password;
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	@Column(name="logged_in")
	private boolean logged_in;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getlogin() {
		return login;
	}
	
	public void setlogin(String login) {
		this.login = login;
	}
	
	public boolean getlogged_in() {
		return logged_in;
	}
	public void setlogged_in(boolean logged_in) {
		this.logged_in = logged_in;
	}
}
