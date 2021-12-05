package com.serenity.steps;

import com.serenity.pages.GooglePage;
import com.serenity.pages.MakemytripHome;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class MakemytripStep extends ScenarioSteps {

	MakemytripHome myTripPage;

	@Step
	
	public void Make_my_Trip()
	{
		myTripPage.openUrl("https://www.makemytrip.com/");
		
		
	}
	@Step
	public void search_oneway_trip() {
		
		myTripPage.oneway_select.select();
		myTripPage.from_city.select();
		myTripPage.to_city.select();
		myTripPage.oneway_search.select();
		
		
	}
	@Step
	public void search_twoway_trip() {
		
		myTripPage.twoway_select.select();
		myTripPage.from_city2.select();
		myTripPage.to_city2.select();
		myTripPage.twoway_search.select();
		
	}

	@Step
	public void search_results(){	
		myTripPage.page_results.click();
	}
	}