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
 *SELECT id, create_uid, last_name, create_date, name, mobile, vendor_id, 
 *write_date, note, phone, branch_moved0, acct_number, acct_type, 
 *write_uid, email, branch
 *FROM sgbros_salesman;
 */
@Entity
@Table(name="sgbros_salesman")
public class Sgbros_Salesman {
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="create_uid")
	private int create_uid;
	
	@Column(name="last_name")
	private String last_name;
	
	@Column(name="create_date")
	private Timestamp create_date;
	
	@Column(name="name")
	private String name;
	
	@Column(name="mobile")
	private String mobile;
	
	@Column(name="vendor_id")
	private int vendor_id;
	
	@Column(name="write_date")
	private Timestamp write_date;
	
	@Column(name="note")
	private String note;
	
	
	@Column(name="phone")
	private String phone;
	
	@Column(name="branch_moved0")
	private String branch_moved0;
	
	@Column(name="acct_number")
	private String acct_number;
	
	@Column(name="acct_type")
	private String acct_type;
	
	@Column(name="write_uid")
	private int write_uid;
	
	
	@Column(name="email")
	private String email;
	
	@Column(name="branch")
	private int branch;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCreate_uid() {
		return create_uid;
	}

	public void setCreate_uid(int create_uid) {
		this.create_uid = create_uid;
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

	public int getVendor_id() {
		return vendor_id;
	}

	public void setVendor_id(int vendor_id) {
		this.vendor_id = vendor_id;
	}

	public Timestamp getWrite_date() {
		return write_date;
	}

	public void setWrite_date(Timestamp write_date) {
		this.write_date = write_date;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getBranch_moved0() {
		return branch_moved0;
	}

	public void setBranch_moved0(String branch_moved0) {
		this.branch_moved0 = branch_moved0;
	}

	public String getAcct_number() {
		return acct_number;
	}

	public void setAcct_number(String acct_number) {
		this.acct_number = acct_number;
	}

	public String getAcct_type() {
		return acct_type;
	}

	public void setAcct_type(String acct_type) {
		this.acct_type = acct_type;
	}

	public int getWrite_uid() {
		return write_uid;
	}

	public void setWrite_uid(int write_uid) {
		this.write_uid = write_uid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getBranch() {
		return branch;
	}

	public void setBranch(int branch) {
		this.branch = branch;
	}




}
