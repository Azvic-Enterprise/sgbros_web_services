package main.java.com.sourcebits;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Manjushree
 * SELECT id, product, charge_as_tpv_cash, write_date, reference, cash_product, 
       qty, cash_brand, special_rate, cash_service_type, cash_qty, create_date, 
       write_uid, brc, create_uid, inches_moved0, cash_is_return, cash_model, 
       cash_special_rate, is_return, cash_inches, charge_as_tpv, service_type, 
       cash_price, model, brand, charge_as, inches, state, is_special_rate, 
       is_dealer, dealer_charge_as, price, reference_so_number, reference_name, 
       reference_contact_address, reference_customer_name, reference_commission_status, 
       reference_done_by, reference_bill_to, reference_plan_delivery_date, 
       reference_bracket_return_status, reference_branch, reference_customer_mobile, 
       reference_vendor_id, reference_amount_collection_status, reference_amount, 
       return_qty, inches_text, is_model, cons_qty, is_cons, cons_installer, 
       pending_return_qty, amount, amount_collection_status, pending_date, 
       commission_status, remarks, bracket_return_status, reference_pending_date, 
       reference_filter_date, plan_delivery_time_to_minute, plan_delivery_time_from_hour, 
       plan_delivery_date, plan_delivery_time_from_minute, plan_delivery_time_to_hour, 
       filter_date, done_by, reference_duplicate_job, reference_street_name, 
       reference_doc_type, reference_building_name, reference_block_number, 
       reference_received_date, reference_total_amount_collected, reference_commission_total, 
       reference_postal_code, reference_promoter, reference_sales_type, 
       reference_completion_date, reference_collected_from, reference_unit_number, 
       reference_promoter_mobile
  FROM sgbros_sales_order_line
 *
 */
@Entity
@Table(name="sgbros_sales_order_line")
public class Sgbros_Sales_Order_Line {
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="product")
	private int product;
	
	@Column(name="charge_as_tpv_cash")
	private int charge_as_tpv_cash;
	
	@Column(name="write_date")
	private Timestamp write_date;
	
	@ManyToOne
    @JoinColumn(name="reference")
	private Sgbros_Contractor department;
	
	@Id
	@Column(name="reference")
	private int reference;
	
	
	
	
	

}
