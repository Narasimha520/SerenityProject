package com.serenity.steps;

import com.serenity.pages.RetailHome;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class RetailRegisterStep extends ScenarioSteps {

	RetailHome Retailpage;

	@Step
	public void RetailLaunch()
	{
		Retailpage.open("http://retailm1.upskills.in/");
		Retailpage.accountIcon.select();
		Retailpage.LoginIcon.click();
		Retailpage.register.click();
	}
	
	@Step
	public void RetailRegister()
	{
		Retailpage.FirstName.sendKeys("manzoor");
		Retailpage.LastName.sendKeys("mehadi");
		Retailpage.emailId.sendKeys("manzoor@gmail.com");
		Retailpage.tel.sendKeys("9876543210");
		Retailpage.addr1.sendKeys("yeshwanthapur");
		Retailpage.addr2.sendKeys("bangalore");
		Retailpage.city.sendKeys("bangalore");
		Retailpage.pcode.sendKeys("560022");
		Retailpage.country.select();
		Retailpage.State.select();
		Retailpage.password.sendKeys("manzoor1");
		Retailpage.confirmPass.sendKeys("manzoor1");
		Retailpage.Ppolicy.select();
		Retailpage.register.click();
		
	}
	@Step
	public void retaillogin() 
	{
		Retailpage.inputEmail.sendKeys("manzoor@gmail.com");
		Retailpage.inputPassword.sendKeys("manzoor1");
		Retailpage.submit.click();
	}
	@Step
	public void confirmpage()
	{
	
		
		
	}
}