package com.serenity.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class RetailHome extends PageObject{
	
	@FindBy(xpath="(//a[@href='http://retailm1.upskills.in/account/account'])[1]")
	public WebElementFacade accountIcon;
	@FindBy(xpath="//span[@class='tb_text'][contains(.,'LOGIN / REGISTER')]")
	public WebElementFacade LoginIcon;
	@FindBy(xpath="//a[contains(.,'Register')]")
	public WebElementFacade register;
	@FindBy(id="input-firstname")
	public WebElementFacade FirstName;
	@FindBy(id="input-lastname")
	public WebElementFacade LastName;
	@FindBy(id="input-email")
	public WebElementFacade emailId;
	@FindBy(id="input-telephone")
	public WebElementFacade tel;
	@FindBy(name="address_1")
	public WebElementFacade addr1;
	@FindBy(name="address_2")
	public WebElementFacade addr2;
	@FindBy(name="city")
	public WebElementFacade city;
	@FindBy(name="postcode")
	public WebElementFacade pcode;
	@FindBy(xpath="//select[contains(@name,'country_id')]")
	public WebElementFacade country;
	@FindBy(xpath="//select[contains(@name,'zone_id')]")
	public WebElementFacade State;
	@FindBy(id="input-password")
	public WebElementFacade password;
	@FindBy(id="input-confirm")
	public WebElementFacade confirmPass;
	
	@FindBy(xpath="//label[@class='radio-inline'][contains(.,'No')]")
	public WebElementFacade Subscribe;
	
	@FindBy(xpath="//input[contains(@type,'checkbox')]")
	public WebElementFacade Ppolicy;
	
	@FindBy(xpath="//input[@type='submit']")
	public WebElementFacade submit;
	
	@FindBy(xpath="input-email")
	public WebElementFacade inputEmail;
	
	@FindBy(xpath="input-password")
	public WebElementFacade inputPassword;
	
	@FindBy(xpath="//p[contains(.,'Congratulations! Your new account has been successfully created!')]")
	public WebElementFacade Confirmpage;
	@FindBy(xpath="(//h2[contains(.,'My Account')])[1]")
	public WebElementFacade LoginSuccess;
	
	
}
