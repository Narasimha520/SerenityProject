package com.serenity.stepDefinations;


import com.serenity.steps.RetailRegisterStep;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class RTTC_002_LoginStepDefination {
	
	@Steps
	RetailRegisterStep login;
	
	@Given("I am on login page")
	public void i_am_on_loginpage() {
	    
					
		}
	@When ("I enter the user name and password click on Login button")
	public void enter_details_login()
	{
		login.retaillogin();
		
	}
	@Then("User logged in successfully in retail page")
	public void login_successful()
	{
		
		
	}
}
