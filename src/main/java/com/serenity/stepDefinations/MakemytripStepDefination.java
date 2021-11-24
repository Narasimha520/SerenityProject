package com.serenity.stepDefinations;

import com.serenity.steps.GoogleStep;
import com.serenity.steps.MakemytripStep;

import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Steps;

public class MakemytripStepDefination {
	
	@Steps
	MakemytripStep ow;
	
	
	@Given("search oneway trip")
	public void search_oneway_trip() {
		
		ow.search_oneway_trip();
		
	}

}
