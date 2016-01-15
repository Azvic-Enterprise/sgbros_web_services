package main.java.com.sourcebits;
import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
//import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

/**
 * @author Manjushree
 * SELECT id, upload_date, create_date, payment_method, write_uid, remarks, 
       street, promoter, customer_name, amount_collection_status, city, 
       pending_date, zip, country_id, state, received_date, branch_moved0, 
       invoice_ref, commission_status, so_number, cancel_reason, create_uid, 
       plan_delivery_time_to, street2,vendor_id, promoter_mobile, customer_mobile, 
       sales_type, write_date,entry_by, bracket_return_status, plan_delivery_time_from, 
       doc_type, name, completion_date, bill_to, plan_delivery_date, 
       amount, done_by_moved0, state_id, collected_from, done_by, branch, 
       block_number, street_name, postal_code, building_name, unit_number, 
       is_dealer, bill_to_name, message_last_post, filename, is_foc, 
       plan_delivery_date_time, filter_date, plan_delivery_time_to_minute, 
       plan_delivery_time_from_hour, plan_delivery_time_from_minute, 
       plan_delivery_time_to_hour, duplicate_job, level_number
  FROM sgbros_sales_order;

 *
 */
@Entity
@Table(name="sgbros_sales_order")
public class Sgbros_Sales_Order {
	@Id
	@Column(name="id")
	private int id;
	
	
	@Column(name="upload_date")
	private Date upload_date;
	
	@Column(name="create_date")
	private Timestamp create_date;
	
	@Column(name="payment_method")
	private String payment_method;
	
	@Column(name="write_uid")
	private int write_uid;
	
	@Column(name="remarks")
	private String remarks;
	
	@Column(name="street")
	private String street;

	@Column(name="promoter")
	private int promoter;
	
	@Column(name="customer_name")
	private String customer_name;
	
	@Column(name="amount_collection_status")
	private String amount_collection_status;
	
	@Column(name="city")
	private String city;
	
	@Column(name="pending_date")
	private Date pending_date;
	
	@Column(name="zip")
	private String zip;
	
	@Column(name="country_id")
	private int country_id;
	
	@Column(name="state")
	private String state;
	
	@Column(name="received_date")
	private Date received_date;
	
	@Column(name="branch_moved0")
	private String branch_moved0;
	
	@Lob
	@Type(type = "org.hibernate.type.BinaryType")
	@Column(name="invoice_ref")
	private byte invoice_ref[];
	
	@Column(name="commission_status")
	private String commission_status;
	
	@Column(name="so_number")
	private String so_number;
	
	@Column(name="cancel_reason")
	private String cancel_reason;
	
	@Column(name="create_uid")
	private int create_uid;
	
	@Column(name="plan_delivery_time_to")
	private double plan_delivery_time_to;
	
	
	@Column(name="street2")
	private String street2;
		
	@Column(name="vendor_id")
	private int vendor_id;
	
	@Column(name="promoter_mobile")
	private String promoter_mobile;	
	
	@Column(name="customer_mobile")
	private String customer_mobile;	
	
	@Column(name="sales_type")
	private String sales_type;
	
	@Column(name="write_date")
	private Timestamp write_date;
	
	@Column(name="entry_by")
	private int entry_by;
	
	@Column(name="bracket_return_status")
	private String bracket_return_status;
	
	@Column(name="plan_delivery_time_from")
	private double plan_delivery_time_from;
	
	@Column(name="amount")
	private double amount;
	 
	@Column(name="done_by_moved0")
	private String done_by_moved0;
	 
	@Column(name="state_id")
	private String state_id;
	
	@Column(name="collected_from")
	private String collected_from;
	
	@Column(name="done_by")
	private int done_by;
	
	@Column(name="branch")
	private int branch;
	
	@Column(name="block_number")
	private String block_number;
	
	@Column(name="street_name")
	private String street_name;
	
	@Column(name="postal_code")
	private String postal_code;
	
	@Column(name="building_name")
	private String building_name;
	
	@Column(name="unit_number")
	private String unit_number;
	
	@Column(name="is_dealer")
	private boolean is_dealer;
	
	@Column(name="bill_to_name")
	private String bill_to_name;
	
	@Column(name="message_last_post")
	private Timestamp message_last_post;
	
	@Column(name="filename")
	private String filename;
	
	@Column(name="is_foc")
	private boolean is_foc;
	
	@Column(name="plan_delivery_date_time")
	private Timestamp plan_delivery_date_time;
	
	@Column(name="filter_date")
	private String filter_date;
	
	@Column(name="plan_delivery_time_to_minute")
	private int plan_delivery_time_to_minute;
	
	@Column(name="plan_delivery_time_from_hour")
	private int plan_delivery_time_from_hour;
	
	@Column(name="plan_delivery_time_from_minute")
	private int plan_delivery_time_from_minute;
	
	@Column(name="plan_delivery_time_to_hour")
	private int plan_delivery_time_to_hour;
	
	@Column(name="duplicate_job")
	private int duplicate_job;
	
	
	@Column(name="level_number")
	private boolean level_number;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Date getUpload_date() {
		return upload_date;
	}


	public void setUpload_date(Date upload_date) {
		this.upload_date = upload_date;
	}


	public Timestamp getCreate_date() {
		return create_date;
	}


	public void setCreate_date(Timestamp create_date) {
		this.create_date = create_date;
	}


	public String getPayment_method() {
		return payment_method;
	}


	public void setPayment_method(String payment_method) {
		this.payment_method = payment_method;
	}


	public int getWrite_uid() {
		return write_uid;
	}


	public void setWrite_uid(int write_uid) {
		this.write_uid = write_uid;
	}


	public String getRemarks() {
		return remarks;
	}


	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public int getPromoter() {
		return promoter;
	}


	public void setPromoter(int promoter) {
		this.promoter = promoter;
	}


	public String getCustomer_name() {
		return customer_name;
	}


	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}


	public String getAmount_collection_status() {
		return amount_collection_status;
	}


	public void setAmount_collection_status(String amount_collection_status) {
		this.amount_collection_status = amount_collection_status;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public Date getPending_date() {
		return pending_date;
	}


	public void setPending_date(Date pending_date) {
		this.pending_date = pending_date;
	}


	public String getZip() {
		return zip;
	}


	public void setZip(String zip) {
		this.zip = zip;
	}


	public int getCountry_id() {
		return country_id;
	}


	public void setCountry_id(int country_id) {
		this.country_id = country_id;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public Date getReceived_date() {
		return received_date;
	}


	public void setReceived_date(Date received_date) {
		this.received_date = received_date;
	}


	public String getBranch_moved0() {
		return branch_moved0;
	}


	public void setBranch_moved0(String branch_moved0) {
		this.branch_moved0 = branch_moved0;
	}


	public byte[] getInvoice_ref() {
		return invoice_ref;
	}


	public void setInvoice_ref(byte[] invoice_ref) {
		this.invoice_ref = invoice_ref;
	}


	public String getCommission_status() {
		return commission_status;
	}


	public void setCommission_status(String commission_status) {
		this.commission_status = commission_status;
	}


	public String getSo_number() {
		return so_number;
	}


	public void setSo_number(String so_number) {
		this.so_number = so_number;
	}


	public String getCancel_reason() {
		return cancel_reason;
	}


	public void setCancel_reason(String cancel_reason) {
		this.cancel_reason = cancel_reason;
	}


	public int getCreate_uid() {
		return create_uid;
	}


	public void setCreate_uid(int create_uid) {
		this.create_uid = create_uid;
	}


	public double getPlan_delivery_time_to() {
		return plan_delivery_time_to;
	}


	public void setPlan_delivery_time_to(double plan_delivery_time_to) {
		this.plan_delivery_time_to = plan_delivery_time_to;
	}


	public String getStreet2() {
		return street2;
	}


	public void setStreet2(String street2) {
		this.street2 = street2;
	}


	public int getVendor_id() {
		return vendor_id;
	}


	public void setVendor_id(int vendor_id) {
		this.vendor_id = vendor_id;
	}


	public String getPromoter_mobile() {
		return promoter_mobile;
	}


	public void setPromoter_mobile(String promoter_mobile) {
		this.promoter_mobile = promoter_mobile;
	}


	public String getCustomer_mobile() {
		return customer_mobile;
	}


	public void setCustomer_mobile(String customer_mobile) {
		this.customer_mobile = customer_mobile;
	}


	public String getSales_type() {
		return sales_type;
	}


	public void setSales_type(String sales_type) {
		this.sales_type = sales_type;
	}


	public Timestamp getWrite_date() {
		return write_date;
	}


	public void setWrite_date(Timestamp write_date) {
		this.write_date = write_date;
	}


	public int getEntry_by() {
		return entry_by;
	}


	public void setEntry_by(int entry_by) {
		this.entry_by = entry_by;
	}


	public String getBracket_return_status() {
		return bracket_return_status;
	}


	public void setBracket_return_status(String bracket_return_status) {
		this.bracket_return_status = bracket_return_status;
	}


	public double getPlan_delivery_time_from() {
		return plan_delivery_time_from;
	}


	public void setPlan_delivery_time_from(double plan_delivery_time_from) {
		this.plan_delivery_time_from = plan_delivery_time_from;
	}


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}


	public String getDone_by_moved0() {
		return done_by_moved0;
	}


	public void setDone_by_moved0(String done_by_moved0) {
		this.done_by_moved0 = done_by_moved0;
	}


	public String getState_id() {
		return state_id;
	}


	public void setState_id(String state_id) {
		this.state_id = state_id;
	}


	public String getCollected_from() {
		return collected_from;
	}


	public void setCollected_from(String collected_from) {
		this.collected_from = collected_from;
	}


	public int getDone_by() {
		return done_by;
	}


	public void setDone_by(int done_by) {
		this.done_by = done_by;
	}


	public int getBranch() {
		return branch;
	}


	public void setBranch(int branch) {
		this.branch = branch;
	}


	public String getBlock_number() {
		return block_number;
	}


	public void setBlock_number(String block_number) {
		this.block_number = block_number;
	}


	public String getStreet_name() {
		return street_name;
	}


	public void setStreet_name(String street_name) {
		this.street_name = street_name;
	}


	public String getPostal_code() {
		return postal_code;
	}


	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}


	public String getBuilding_name() {
		return building_name;
	}


	public void setBuilding_name(String building_name) {
		this.building_name = building_name;
	}


	public String getUnit_number() {
		return unit_number;
	}


	public void setUnit_number(String unit_number) {
		this.unit_number = unit_number;
	}


	public boolean isIs_dealer() {
		return is_dealer;
	}


	public void setIs_dealer(boolean is_dealer) {
		this.is_dealer = is_dealer;
	}


	public String getBill_to_name() {
		return bill_to_name;
	}


	public void setBill_to_name(String bill_to_name) {
		this.bill_to_name = bill_to_name;
	}


	public Timestamp getMessage_last_post() {
		return message_last_post;
	}


	public void setMessage_last_post(Timestamp message_last_post) {
		this.message_last_post = message_last_post;
	}


	public String getFilename() {
		return filename;
	}


	public void setFilename(String filename) {
		this.filename = filename;
	}


	public boolean isIs_foc() {
		return is_foc;
	}


	public void setIs_foc(boolean is_foc) {
		this.is_foc = is_foc;
	}


	public Timestamp getPlan_delivery_date_time() {
		return plan_delivery_date_time;
	}


	public void setPlan_delivery_date_time(Timestamp plan_delivery_date_time) {
		this.plan_delivery_date_time = plan_delivery_date_time;
	}


	public String getFilter_date() {
		return filter_date;
	}


	public void setFilter_date(String filter_date) {
		this.filter_date = filter_date;
	}


	public int getPlan_delivery_time_to_minute() {
		return plan_delivery_time_to_minute;
	}


	public void setPlan_delivery_time_to_minute(int plan_delivery_time_to_minute) {
		this.plan_delivery_time_to_minute = plan_delivery_time_to_minute;
	}


	public int getPlan_delivery_time_from_hour() {
		return plan_delivery_time_from_hour;
	}


	public void setPlan_delivery_time_from_hour(int plan_delivery_time_from_hour) {
		this.plan_delivery_time_from_hour = plan_delivery_time_from_hour;
	}


	public int getPlan_delivery_time_from_minute() {
		return plan_delivery_time_from_minute;
	}


	public void setPlan_delivery_time_from_minute(int plan_delivery_time_from_minute) {
		this.plan_delivery_time_from_minute = plan_delivery_time_from_minute;
	}


	public int getPlan_delivery_time_to_hour() {
		return plan_delivery_time_to_hour;
	}


	public void setPlan_delivery_time_to_hour(int plan_delivery_time_to_hour) {
		this.plan_delivery_time_to_hour = plan_delivery_time_to_hour;
	}


	public int getDuplicate_job() {
		return duplicate_job;
	}


	public void setDuplicate_job(int duplicate_job) {
		this.duplicate_job = duplicate_job;
	}


	public boolean isLevel_number() {
		return level_number;
	}


	public void setLevel_number(boolean level_number) {
		this.level_number = level_number;
	}

}
