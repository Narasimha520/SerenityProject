package com.serenity.steps;

import com.serenity.pages.GooglePage;
import com.serenity.pages.MakemytripHome;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class MakemytripStep extends ScenarioSteps {

	MakemytripHome myTripPage;

	@Step
	public void search_oneway_trip() {
		myTripPage.openUrl("https://www.makemytrip.com/");
		myTripPage.oneway_select.select();
		myTripPage.from_city.select();
		myTripPage.to_city.select();
		myTripPage.oneway_search.select();
		
	}

}
