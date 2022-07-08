package com.gcr.scripts;



//import org.testng.Assert;
import org.testng.annotations.Test;
import com.gcr.config.StartBrowser;
//import com.gcr.reuse.ElectronicsFunctions;
import com.gcr.reuse.Registerfunctions;
//import com.gcr.reuse.Registerfunctions;



public class RegisterScript extends StartBrowser{
	@Test
	public void RegisterScriptTestCase() throws Exception {
		Registerfunctions rfs= new Registerfunctions();
		  
		 rfs.RegisterinHomepage();
		// rfs.FilltheDetails();
		 rfs.Selectcategory();
		// rfs.Fillthedetails2();
		  //efs.Emailafriend();
		  //String pName=ffs.Shoppingcart();
		  //Assert.assertEquals(pName);
		   Thread.sleep(9000);
		
		
		
	
		
		
	}
}
