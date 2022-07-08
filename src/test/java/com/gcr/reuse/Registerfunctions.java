package com.gcr.reuse;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.gcr.config.StartBrowser;
import com.gcr.or.Register;
import com.gcr.or.ScreenRecorderUtil;
import com.gcr.wdcmds.ActionDriver;

public class Registerfunctions {

	
	public ActionDriver aDriver;
	public WebDriver driver;

	public Registerfunctions()
	{
		aDriver = new ActionDriver();
		driver = StartBrowser.driver;
	}

	public void RegisterinHomepage() throws Exception
	{
		ScreenRecorderUtil.startRecord("RegisterinHomepage");
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Register the site");
		aDriver.navigateToApplication("http://demowebshop.tricentis.com/");
		//aDriver.mouseHover(Register.LnkRegister , "Hover to Register");
		//aDriver.click(Register.LnkRegister , "Register Link");
		
		
	}
	
	
/*	public void FilltheDetails() throws Exception
	{
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Fill the details");
		//aDriver.navigateToApplication("http://demowebshop.tricentis.com/");
		//aDriver.click(Register.radiobtnGender,"Gender");
		
		aDriver.type(Register.txtFirstname,"sfefsdc", "First Name");
		aDriver.type(Register.txtLastname,"sadefs", "Last Name");
		aDriver.type(Register.txtEmailid, "pramadini@gmail.com","Text Email");
		aDriver.type(Register.txtpwd, "1234567","Text Password");
		aDriver.type(Register.txtCnfrmpwd,"1234567", "Confirm Password");
		aDriver.click(Register.btnRegister, "Register button");
		aDriver.click(Register.btncontinue, "Continue button");
		
		
       //aDriver.selectByVisibleText(Register.radiobtnGender, "Female");
		
	} */

	public void Selectcategory() throws Exception
	{
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Select the product");
		aDriver.click(Register.lnkComputers, "Computers link");
		Thread.sleep(2000);
		aDriver.click(Register.lnkNotebooks, "Notebooks link");
		Thread.sleep(2000);
		aDriver.click(Register.imgproduct, "Image product");
		Thread.sleep(2000);
		aDriver.click(Register.btncart, "Add to cart");
		Thread.sleep(2000);
		aDriver.click(Register.lnkshoppingcart, "Shopping cart");
		Thread.sleep(2000);
		aDriver.click(Register.checkbox,"Terms of service");
		Thread.sleep(2000);
		aDriver.click(Register.btnchckout, "Checkout");
		Thread.sleep(2000);
		aDriver.type(Register.txtEmailid, "soumya243@gmail.com","email id");
		Thread.sleep(2000);
		aDriver.type(Register.txtpswd, "123456789","pwsd");
		Thread.sleep(2000);
		aDriver.click(Register.btnlogin, "login");
		Thread.sleep(2000);
		aDriver.click(Register.checkbox1,"Terms of service");
		Thread.sleep(2000);
		aDriver.click(Register.btnchckout1, "Checkout");
		Thread.sleep(2000);
		
		aDriver.click(Register.btncntnue, "Continue");
		Thread.sleep(2000);
		aDriver.click(Register.btnshipingcontinue, "Continue shipping");
		Thread.sleep(2000);
		aDriver.click(Register.btnshipingmethodcontinue, "Continue shipping method");
		Thread.sleep(2000);
		aDriver.click(Register.btnpaymentcontinue, "Continue payment ");
		Thread.sleep(2000);
		aDriver.click(Register.btnpayinfocontinue, "Continue payment information");
		Thread.sleep(2000);
		aDriver.click(Register.btncnfrm, "Final confirm");
		Thread.sleep(2000);
		ScreenRecorderUtil.stopRecord();
		
	}
	
/*	public void Fillthedetails2() throws Exception
	{
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Billing address");
		aDriver.type(Register.txtfirstname, "sfefsdc","First name");
		aDriver.type(Register.txtlastname, "sadefs","Last name");
		aDriver.type(Register.txtemail, "pramadini@gmail.com","Email ");
		aDriver.type(Register.ddcountry, "California","Country");
		aDriver.type(Register.ddstate, "Other(Non US)","State");
		aDriver.type(Register.txtcity, "gjhtf","City");
		aDriver.type(Register.txtaddress1, "23/3445","Address1");
		aDriver.type(Register.txtaddress2, "24/3445","Address2");
		aDriver.type(Register.txtzip, "345678","Zip/Postal code");
		aDriver.type(Register.txtPhneno, "3457890876", "Phone no.");
		aDriver.click(Register.btncntnue, "Continue");
		aDriver.click(Register.btnshipingcontinue, "Continue shipping");
		/*aDriver.click(Register.btnshipingmethodcontinue, "Continue shipping method");
		aDriver.click(Register.btnpaymentcontinue, "Continue payment ");
		aDriver.click(Register.btnpayinfocontinue, "Continue payment information");
		aDriver.click(Register.btncnfrm, "Final confirm");
		aDriver.getText(Register.txtthankyou, "Order placed successfully");*/
	
}
	
		
		
	


	    
	    
	    
	

		
		
	

	
		



