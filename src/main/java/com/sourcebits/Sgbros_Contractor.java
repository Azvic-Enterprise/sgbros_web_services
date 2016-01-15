package main.java.com.sourcebits;
import java.sql.Timestamp;

import javax.persistence.Column;
//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Manjushree
 *
 */
@Entity
@Table(name="sgbros_contractor")
public class Sgbros_Contractor {
	@Id
	@Column(name="id")
	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public Timestamp getCreate_date() {
		return create_date;
	}

	public void setCreate_date(Timestamp create_date) {
		this.create_date = create_date;
	}

	public String getJob_type() {
		return job_type;
	}

	public void setJob_type(String job_type) {
		this.job_type = job_type;
	}

	public int getWrite_uid() {
		return write_uid;
	}

	public void setWrite_uid(int write_uid) {
		this.write_uid = write_uid;
	}

	public Timestamp getWrite_date() {
		return write_date;
	}

	public void setWrite_date(Timestamp write_date) {
		this.write_date = write_date;
	}

	public int getCreate_uid() {
		return create_uid;
	}

	public void setCreate_uid(int create_uid) {
		this.create_uid = create_uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name="last_name")
	private String last_name;
	
	@Column(name="create_date")
	private Timestamp create_date;
	
	@Column(name="job_type")
	private String job_type;
	
	@Column(name="write_uid")
	private int write_uid;
	
	@Column(name="write_date")
	private Timestamp write_date;
	
	@Column(name="create_uid")
	private int create_uid;
	
	@Column(name="name")
	private String name;
	
	@Column(name="mobile")
	private String mobile;
	
	
	@Column(name="note")
	private String note;
	
	@Column(name="email")
	private String email;
	

}
