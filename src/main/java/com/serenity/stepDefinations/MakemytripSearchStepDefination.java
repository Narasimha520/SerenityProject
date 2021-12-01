package com.serenity.stepDefinations;

import com.serenity.steps.MakemytripStep;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class MakemytripSearchStepDefination {
	
	@Steps
	MakemytripStep tw;
	//@Steps
	//MakemytripStep sr;
	
	
		
	@When("I perform roundtrip search")
	public void i_perform_roundtrip_search(io.cucumber.datatable.DataTable dataTable) {
	tw.search_twoway_trip();

	}

	//@Then("Seach results should be display availabe flights")
	//public void seach_results_should_be_display_availabe_flights() {
	//sr.search_results();	
		
	//}

	

}
