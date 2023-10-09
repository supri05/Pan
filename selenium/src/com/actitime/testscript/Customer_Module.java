package com.actitime.testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;
@Listeners(com.actitime.generic.ListenerImplementation.class)
public class Customer_Module extends BaseClass{
	
 @Test//(annotation is talk with java coppiler and is used
public void createCustomer()
{
	 Assert.fail();
	Reporter.log("createCustomer",true);
}
 
@Test(dependsOnMethods = "createCustomer")
public void deleteCustomer()
{
	Reporter.log("deleteCustomer",true);
	}
	@Test
public void modifyCustomer()
{
	//do refresh 
	//instead of using print we will use reporter bcz it is not print in console and if i want print in report we have to use) 	
	Reporter.log("modifyCustomer",true);
}
}
