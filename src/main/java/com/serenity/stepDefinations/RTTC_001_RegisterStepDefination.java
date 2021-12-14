package com.serenity.stepDefinations;

import com.serenity.steps.GoogleStep;
import com.serenity.steps.MakemytripStep;
import com.serenity.steps.RetailRegisterStep;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class RTTC_001_RegisterStepDefination {
	
	@Steps
	RetailRegisterStep reg;
	
	
	@Given("I am on Registration page")
	public void i_am_on_registration() {
	    reg.RetailLaunch();
	    }
	@When("I am Registering the user by entering the required details")
	public void register_details(io.cucumber.datatable.DataTable dataTable) {
		
		reg.RetailRegister();
	}
	@Then("User registerd successully")
	public void register_successfuly()
	{
		
		
	}
}
