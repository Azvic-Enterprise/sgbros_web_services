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
@Table(name="sgbros_progress_order")
public class Sgbros_Progress_Order {
		
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
	
	@Column(name="doc_type")
	private String doc_type;
	
	@Column(name="name")
	private String name;
	
	@Column(name="completion_date")
	private Date completion_date;
	
	@Column(name="bill_to")
	private int bill_to;
	
	@Column(name="plan_delivery_date")
	private Date plan_delivery_date;
	
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
	
}
