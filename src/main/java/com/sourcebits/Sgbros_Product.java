package main.java.com.sourcebits;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

//import java.sql.Blob;
//import javax.persistence.Entity;
 import javax.persistence.Lob;
//import org.hibernate.annotations.Type;
//import org.hibernate.type.BlobType;

//import org.hibernate.annotations.Type;

/**
 * @author Manjushree
 *
 */
@Entity
@Table(name="sgbros_product")
public class Sgbros_Product {
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="create_uid")
	private int create_uid;
	
	@Type(type = "org.hibernate.type.BinaryType")
	@Lob
	@Column(name="image_medium")
	private byte image_medium[];

	@Column(name="product_type")
	private Integer product_type;
	
	@Column(name="name")
	private String name;
	
	@Column(name="product_uom")
	private Integer product_uom;
	
	@Column(name="product_desc")
	private String product_desc;
	
	@Column(name="write_uid")
	private int write_uid;
	
	@Lob
	@Type(type = "org.hibernate.type.BinaryType")
	@Column(name="image")
	private byte image[];
	
	
	@Column(name="write_date")
	private Timestamp write_date;
	
	@Column(name="supplier")
	private String supplier;
		
	@Column(name="po_no")
	private String po_no;
	
	@Column(name="stock_on_hand")
	private double stock_on_hand;
	
	@Column(name="provision_stock")
	private double provision_stock;
	
	@Column(name="active")
	private boolean active;

	@Column(name="stock_in_date")
	private Date stock_in_date;
	
	@Column(name="create_date")
	private Timestamp create_date;
	
	@Column(name="product_code")
	private String product_code;
	
	@Column(name="approved")
	private String approved;
	
	@Column(name="stock_cons")
	private double stock_cons;
	
	public int getCreate_uid() {
		return create_uid;
	}

	public void setCreate_uid(int create_uid) {
		this.create_uid = create_uid;
	}

	public byte[] getImage_medium() {
		return image_medium;
	}

	public void setImage_medium(byte[] image_medium) {
		this.image_medium = image_medium;
	}

	public Integer getProduct_type() {
		if (product_type != null) {
			  return product_type;}
			else
			  return -1;
		//return product_type;
	}

	public void setProduct_type(Integer product_type) {
		this.product_type = product_type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getProduct_uom() {
		if (product_uom != null) {
			  return product_uom;}
			else
			  return -1;
		//return product_uom;
	}

	public void setProduct_uom(Integer product_uom) {
		this.product_uom = product_uom;
	}

	public String getProduct_desc() {
		return product_desc;
	}

	public void setProduct_desc(String product_desc) {
		this.product_desc = product_desc;
	}

	public int getWrite_uid() {
		return write_uid;
	}

	public void setWrite_uid(int write_uid) {
		this.write_uid = write_uid;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public Timestamp getWrite_date() {
		return write_date;
	}

	public void setWrite_date(Timestamp write_date) {
		this.write_date = write_date;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public String getPo_no() {
		return po_no;
	}

	public void setPo_no(String po_no) {
		this.po_no = po_no;
	}

	public double getStock_on_hand() {
		return stock_on_hand;
	}

	public void setStock_on_hand(double stock_on_hand) {
		this.stock_on_hand = stock_on_hand;
	}

	public double getProvision_stock() {
		return provision_stock;
	}

	public void setProvision_stock(double provision_stock) {
		this.provision_stock = provision_stock;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Date getStock_in_date() {
		return stock_in_date;
	}

	public void setStock_in_date(Date stock_in_date) {
		this.stock_in_date = stock_in_date;
	}

	public Timestamp getCreate_date() {
		return create_date;
	}

	public void setCreate_date(Timestamp create_date) {
		this.create_date = create_date;
	}

	public String getProduct_code() {
		return product_code;
	}

	public void setProduct_code(String product_code) {
		this.product_code = product_code;
	}

	public String getApproved() {
		return approved;
	}

	public void setApproved(String approved) {
		this.approved = approved;
	}

	public double getStock_cons() {
		return stock_cons;
	}

	public void setStock_cons(double stock_cons) {
		this.stock_cons = stock_cons;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	

}
