package com.serenity.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class MakemytripHome extends PageObject{
	
	
	@FindBy(xpath = "//li[@data-cy='oneWayTrip']")
	public WebElementFacade oneway_select;

	@FindBy(xpath="//a[@class='primaryBtn font24 latoBold widgetSearchBtn '][contains(.,'Search')]")
	public WebElementFacade oneway_search;
	@FindBy(xpath="//input[contains(@value,'New Delhi')]")
	public WebElementFacade from_city;
	@FindBy(xpath="//input[contains(@value,'Bangalore')]")
	public WebElementFacade to_city;
	
	
}
