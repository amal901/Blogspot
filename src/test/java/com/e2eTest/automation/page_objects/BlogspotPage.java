package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;

public class BlogspotPage extends BasePage {

	@FindBy(how = How.ID, using = "name")
	private static WebElement name;

	@FindBy(how = How.ID, using = "email")
	private static WebElement email;

	@FindBy(how = How.ID, using = "phone")
	private static WebElement phone;

	@FindBy(how = How.ID, using = "textarea")
	private static WebElement address;

	@FindBy(how = How.ID, using = "female")
	private static WebElement female;

	@FindBy(how = How.ID, using = "monday")
	private static WebElement monday;

	@FindBy(how = How.ID, using = "thursday")
	private static WebElement mondayi;

	@FindBy(how = How.ID, using = "country")
	private static WebElement country;

	@FindBy(how = How.ID, using = "colors")
	private static WebElement color;

	@FindBy(how = How.ID, using = "datepicker")
	private static WebElement date;

	@FindBy(how = How.XPATH, using = "//*[@id='pagination']/li[2]/a")
	private static WebElement pagination;

	@FindBy(how = How.XPATH, using = "//*[contains(text(), 'Product 6')]")
	private static WebElement produit6;

	@FindBy(how = How.XPATH, using = "(//input[@type='checkbox'])[9]")
	private static WebElement checkboxProduct2;

	@FindBy(how = How.ID, using = "Wikipedia1_wikipedia-search-input")
	private static WebElement search;

	@FindBy(how = How.CLASS_NAME, using = "wikipedia-search-button")
	private static WebElement searchbtn;

	@FindBy(how = How.ID, using = "public static WebElement searchbtn")
	private static WebElement hello;

	@FindBy(how = How.LINK_TEXT, using = "Hello")
	private static WebElement helloLink;

	@FindBy(how = How.XPATH, using = "//*[contains(text(), 'Confirm Box')]")
	private static WebElement confirmBox;

	@FindBy(how = How.ID, using = "//*[contains(text(), 'Copy Text')]")
	private static WebElement copyText;

	@FindBy(how = How.ID, using = "draggable")
	private static WebElement drag;

	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[3]/main/header/h1/i")
	private static WebElement helloWikipedia;
	
	/******************** confirmationAlertAndBrowser ***********************/
	
	@FindBy(how = How.XPATH, using = "(//button[@onclick='myFunction()'])")
	private static WebElement browserWindow;
	
	@FindBy(how = How.TAG_NAME, using = "h3")
	private static WebElement featured;
	
	@FindBy(how = How.ID, using = "logo")
	private static WebElement logo;
	
	@FindBy(how = How.XPATH, using = "(//button[@onclick='myFunctionConfirm()'])")
	private static WebElement alert;
	
	@FindBy(how = How.ID, using = "demo")
	private static WebElement messageConfirmAlert;
	
	@FindBy(how = How.ID, using = "demo")
	private static WebElement messageCancelAlert;
	
	
	@FindBy(how = How.XPATH, using = "(//button[@ondblclick='myFunction1()'])")
	private static WebElement doubleClick;
	
	@FindBy(how = How.ID, using = "field1")
	private static WebElement field;
	
	@FindBy(how = How.ID, using = "frame-one796456169")
	private static WebElement frame;
	
	@FindBy(how = How.ID, using = "RESULT_RadioButton-3")
	private static WebElement job;
	
	
//	private By helloLink = By.linkText("Hello");
//
//	public WebElement getCustomerIcon() {
//		return getDriver.findElement(helloLink);
//	}

	public BlogspotPage() {
		PageFactory.initElements(Setup.getDriver(), this);
	}

	public static WebElement getName() {
		return name;
	}

	public static WebElement getEmail() {
		return email;
	}

	public static WebElement getPhone() {
		return phone;
	}

	public static WebElement getAddress() {
		return address;
	}

	public static WebElement getFemale() {
		return female;
	}

	public static WebElement getMonday() {
		return monday;
	}

	public static WebElement getCountry() {
		return country;
	}

	public static WebElement getColor() {
		return color;
	}

	public static WebElement getDate() {
		return date;
	}

	public static WebElement getPagination() {
		return pagination;
	}

	public static WebElement getProduit6() {
		return produit6;
	}

	public static WebElement getCheckboxProduct2() {
		return checkboxProduct2;
	}

	public static WebElement getSearch() {
		return search;
	}

	public static WebElement getSearchbtn() {
		return searchbtn;
	}

	public static WebElement getHelloLink() {
		return helloLink;
	}
	
	public static WebElement getHelloWikipedia() {
		return helloWikipedia;
	}

	public static WebElement getBrowserWindow() {
		return browserWindow;
	}
	
	public static WebElement getFeatured() {
		return featured;
	}
	
	public static WebElement getLogo() {
		return logo;
	}
	
	
	public static WebElement getAlert() {
		return alert;
	}
	
	public static WebElement getMessageConfirmAlert() {
		return messageConfirmAlert;
	}
	
	public static WebElement getMessageCancelAlert() {
		return messageCancelAlert;
	}

	public static WebElement getDoubleClick() {
		return doubleClick;
	}
	
	public static WebElement getField() {
		return field;
	}
	
	public static WebElement getFrame() {
		return frame;
	}
	
	public static WebElement getJob() {
		return job;
	}
	
	
	/******************** confirmationAlertAndBrowser ***********************/
	
	
	
}
