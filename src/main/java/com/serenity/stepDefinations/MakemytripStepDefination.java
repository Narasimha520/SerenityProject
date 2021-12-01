package com.serenity.stepDefinations;

import com.serenity.steps.GoogleStep;
import com.serenity.steps.MakemytripStep;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class MakemytripStepDefination {
	
	@Steps
	MakemytripStep opn;
	@Steps
	MakemytripStep ow;
	
	@Given("I am on makemytrip")
	public void i_am_on_makemytrip() {
	    
		opn.Make_my_Trip();		
			
		}
	@When("I am booking one way search with following information")
	public void i_am_booking_one_way_search_with_following_information(io.cucumber.datatable.DataTable dataTable) {
		 ow.search_oneway_trip();
	}
	
}
