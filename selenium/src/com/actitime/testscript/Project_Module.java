package com.actitime.testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class Project_Module extends BaseClass {
	@Test
	public void createProject()
	{
		Reporter.log("createProject",true);
	}
	@Test
	public void deleteProject()
	{
		Reporter.log("deleteProject",true);
	}
	@Test
	public void modifyProject()
	{
		
		Reporter.log("modifyProject",true);
	}
}
