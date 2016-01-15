package main.java.com.sourcebits;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProductController {
	
	@Autowired
	private ProductBean productBean;
	
	@RequestMapping(value = "/product", method = RequestMethod.POST)
	public @ResponseBody List<Sgbros_Product> getlogindetails() {
		
		return productBean.getproductdetails();
	    //System.out.println(login);
	   // System.out.println(employee);
		// return new ResponseEntity<EmployeeVO>(employee, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/product_id", method = RequestMethod.POST)
	public @ResponseBody List<Sgbros_Product> getProductDetailsById(@RequestParam int  id) {
		
		return productBean.getProductDetailsById(id);
	    //System.out.println(login);
	   // System.out.println(employee);
		// return new ResponseEntity<EmployeeVO>(employee, HttpStatus.OK);
	}
	

}
