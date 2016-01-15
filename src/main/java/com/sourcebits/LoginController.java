package main.java.com.sourcebits;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseBody;

import main.java.com.constants.Users;

@Controller
public class LoginController {
	
	@Autowired
	private LoginBean loginBean;
	
/*
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public @ResponseBody List<Mark> getMarks() {
		
		return test.getMarks();
	}*/
	@RequestMapping(value = "/loginName", method = RequestMethod.POST)
	 @ResponseBody
	 //@RequestBody
	public  String getlogindetails(@RequestParam String Type,@RequestParam   String login,@RequestParam   String Password) {
		
		//return test.getlogindetails(login);
		 System.out.println("Type:"+Type);
		 System.out.println("login:"+login);
		 System.out.println("Password:"+Password);
		 System.out.println(Users.INSTALLER.toString());
		 System.out.println(Type.equals(Users.INSTALLER.toString()));
		
		 if(Type.toUpperCase().equals(Users.INSTALLER.toString())|| Type.toUpperCase().equals(Users.CONTRACTOR.toString()) ||
				 Type.toUpperCase().equals(Users.EVENTTEAM.toString()))
		 {
				return  (loginBean.getInstallerLogin(login,Password));
		 }
		 else if (Type.toUpperCase().equals(Users.SGBROS.toString()))
		 {
			 return  (loginBean.getlogindetails(login,Password));
		 }
		 else if (Type.toUpperCase().equals(Users.SALESMAN.toString()))
		 {
			 return  (loginBean.getSalesMenLogin(login,Password));
		 }
		 else
		 {
			return  "unsuccessful";
			 	//return new ResponseEntity<List<Res_Users>>(test.getlogindetails(login), HttpStatus.OK);
		 }
	}
}
	

