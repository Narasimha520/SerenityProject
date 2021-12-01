package com.serenity.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class MakemytripHome extends PageObject{
	
	
	@FindBy(xpath = "//li[@data-cy='oneWayTrip'][contains(.,'OneWay')]")
	public WebElementFacade oneway_select;
	@FindBy(xpath="//input[contains(@value,'Delhi')]")
	public WebElementFacade from_city;
	@FindBy(xpath="//input[contains(@value,'Bengaluru')]")
	public WebElementFacade to_city;
	@FindBy(xpath="//a[@class='primaryBtn font24 latoBold widgetSearchBtn '][contains(.,'Search')]")
	public WebElementFacade oneway_search;
	
	@FindBy(xpath="//li[@data-cy='roundTrip'][contains(.,'Round Trip')]")
	public WebElementFacade twoway_select;
	@FindBy(xpath="//input[contains(@value,'Delhi')]")
	public WebElementFacade from_city2;
	@FindBy(xpath="//input[contains(@value,'Bengaluru')]")
	public WebElementFacade to_city2;
	@FindBy(xpath="//li[@data-cy='adults-3'][contains(.,'‎3')]")
	public WebElementFacade deprt;
	@FindBy(xpath="(//span[contains(.,'Nov')])[5]")
	public WebElementFacade retrn;
	@FindBy(xpath="//a[@class='primaryBtn font24 latoBold widgetSearchBtn '][contains(.,'Search')]")
	public WebElementFacade twoway_search;
	@FindBy(xpath="//p[contains(@class,'font24 blackFont whiteText appendBottom20 journey-title')]")
	public WebElementFacade page_results;
	
	
	
}
