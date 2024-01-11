package com.e2eTest.automation.step_definitions;

import org.junit.Assert;

import com.e2eTest.automation.page_objects.BlogspotPage;
import com.e2eTest.automation.utils.ConfigFileReader;
import com.e2eTest.automation.utils.DateUtil;
import com.e2eTest.automation.utils.SelectFromListUtils;
import com.e2eTest.automation.utils.SeleniumUtils;
import com.e2eTest.automation.utils.Setup;
import com.e2eTest.automation.utils.Validations;
import com.e2eTest.automation.utils.Wait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BlogspotStepdefinition {

	public BlogspotPage blogspotpage;
	public SeleniumUtils seliniumUtils;
	public Validations validation;
	public SelectFromListUtils select;
	public ConfigFileReader configFileReader;
	public Wait wait;
	public DateUtil dateUtil;

	public BlogspotStepdefinition() {

		blogspotpage = new BlogspotPage();
		seliniumUtils = new SeleniumUtils();
		validation = new Validations();
		select = new SelectFromListUtils();
		wait = new Wait(Setup.getDriver());
		configFileReader = new ConfigFileReader();
	}

	@Given("Je me connecte sur l application Blogspot")
	public void jeMeConnecteSurLApplicationBlogspot() {
		seliniumUtils.get(configFileReader.getProperties("home.url"));

	}

	/******************** inscription ***********************/
	
	@When("Je saisis Name {string}")
	public void jeSaisisName(String name) {
		seliniumUtils.writeText(BlogspotPage.getName(), name);
	}

	@When("Je saisis Email {string}")
	public void jeSaisisEmail(String email) {
		seliniumUtils.writeText(BlogspotPage.getEmail(), email);

	}

	@When("Je saisis Phone {string}")
	public void jeSaisisPhone(String phone) {
		seliniumUtils.writeText(BlogspotPage.getPhone(), phone);

	}

	@When("Je saisis Adresse {string}")
	public void jeSaisisAdresse(String address) {
		seliniumUtils.writeText(BlogspotPage.getAddress(), address);
	}

	@When("Je coche la case Female")
	public void jeCocheLaCaseFemale() {
		seliniumUtils.click(BlogspotPage.getFemale());
	}

	@Then("La case Female est coché")
	public void laCaseFemaleEstCoché() {
		validation.isElementSelected(BlogspotPage.getFemale());
		validation.assertTrueBoolean(BlogspotPage.getFemale());

	}

	@When("Je coche la case Monday")
	public void jeCocheLaCaseMonday() {
		seliniumUtils.click(BlogspotPage.getMonday());
	}

	@Then("la case Monday est coché")
	public void laCaseMondayEstCoché() {
		validation.isElementSelected(BlogspotPage.getMonday());
		validation.assertTrueBoolean(BlogspotPage.getMonday());
	}

	@When("Je Choisis le country Germany")
	public void jeChoisisLeCountryGermany() {
		select.selectDropDownListByIndex(BlogspotPage.getCountry(), 1);
	}

	@When("je choisis la couleur Blue")
	public void jeChoisisLaCouleurBlue() {
		select.selectDropDownListByVisibleText(BlogspotPage.getColor(), "Blue");
	}

	@When("Je saisis la date {string}")
	public void jeSaisisLaDate(String date) {
		seliniumUtils.writeText(BlogspotPage.getDate(), date);
	}

	@When("je clique sur la pagination")
	public void jeCliqueSurLaPagination() {
		seliniumUtils.scrollUsingJs(900);
		seliniumUtils.click(BlogspotPage.getPagination());
	}

	@Then("Le produit saffiche {string}")
	public void leProduitSaffiche(String produit) {
		validation.assertEquals(BlogspotPage.getProduit6(), produit);
	}

	@Then("Le carre de la page {int} est bleu {string}")
	public void leCarreDeLaPageEstBleu(Integer pagenumber, String actualbackgroundColor) {
		String expectedbackgroundColor = SeleniumUtils.getBackgroundColor(BlogspotPage.getPagination());
		System.out.println("The background color of the element is:" + expectedbackgroundColor);
		Assert.assertEquals(actualbackgroundColor, expectedbackgroundColor);
	}

	@When("Je coche product {int} dans pagination tableau")
	public void jeCocheProductDansPaginationTableau(Integer int1) {
		seliniumUtils.click(BlogspotPage.getCheckboxProduct2());
	}

	@Then("la case sera selectionnee")
	public void LaCaseSeraSelectionnee() {
		validation.isElementSelected(BlogspotPage.getCheckboxProduct2());
		validation.assertTrueBoolean(BlogspotPage.getCheckboxProduct2());
	}
	
	/******************** Recherche ***********************/

	@When("Je saisis dans le champ de recherche {string}")
	public void jeSaisisDansLeChampDeRecherche(String search) {
		seliniumUtils.writeText(BlogspotPage.getSearch(), search);
	}

	@When("Je clique sur le bouton de recherche")
	public void jeCliqueSurLeBoutonDeRecherche() {
		seliniumUtils.click(BlogspotPage.getSearchbtn());
	}

	@Then("le lien {string} s affiche")
	public void leLienSAffiche(String hello) {
		seliniumUtils.waitForElementToBeClickable(BlogspotPage.getHelloLink());
		validation.assertTrue(BlogspotPage.getHelloLink(), hello);
	}

	@When("je clique sur Hello")
	public void jeCliqueSurHello() {
		// wait.forElementToBeDisplayed(null, BlogspotPage.helloLink, null);
		seliniumUtils.clickOnElementJs(BlogspotPage.getHelloLink());
	}

	@Then("La page wikipedia s affiche")
	public void laPageWikipediaSAffiche() {
		seliniumUtils.switchToNextTab();
		// wait.waitForElementToBePresent(BlogspotPage.getHelloWikipedia());
		seliniumUtils.getText(BlogspotPage.getHelloWikipedia());
		System.out.println("BlogspotPage.getHelloWikipedia()");

	}
	
	/******************** confirmationAlertAndBrowser ***********************/


	@When("Je clique sur New Browser Window")
	public void jeCliqueSurNewBrowserWindow() {
		
	    seliniumUtils.click(BlogspotPage.getBrowserWindow());
	}
	
	@Then("Le site web Opencart s affiche")
	public void leSiteWebOpencartSAffiche() {
		seliniumUtils.switchToNextTab();
		seliniumUtils.getText(BlogspotPage.getFeatured());
		validation.isElementDisplayed(BlogspotPage.getLogo());
		validation.assertTrueBooleanDisplayed(BlogspotPage.getLogo());
		seliniumUtils.closeTabAndReturn();
		
	}
	
	@When("Je clique sur le bouton Confirm Alert dans Automation practice")
	public void jeCliqueSurLeBoutonConfirmAlertDansAutomationPractice() {
		seliniumUtils.click(BlogspotPage.getAlert());
	    
	     
	}
	@When("Je clique sur le bouton OK")
	public void jeCliqueSurLeBoutonOK() {
		seliniumUtils.acceptAlert();
	}
	@Then("le message {string} s affiche")
	public void leMessageSAffiche(String MessageAllert) {
	    validation.assertTrue(BlogspotPage.getMessageConfirmAlert(), MessageAllert);
	}


	/******************** CancelAlert ***********************/

	@When("Je clique sur le bouton Confirm Alert")
	public void jeCliqueSurLeBoutonConfirmAlert() {
		seliniumUtils.click(BlogspotPage.getAlert());
	}
	
	@When("Je clique sur le bouton annuler")
	public void jeCliqueSurLeBoutonAnnuler() {
	    seliniumUtils.cancelAlert();
	}
	
	@Then("le message {string} s affiche pour annuller")
	public void leMessageSAffichePourAnnuller(String MessageAllert) {
	    validation.assertTrue(BlogspotPage.getMessageCancelAlert(), MessageAllert);
	}
	
	/******************** doubleClick ***********************/

	@When("Je double clique sur copy text")
	public void jeDoubleCliqueSurCopyText() {
//		seliniumUtils.switchToNewFrame(Setup.getDriver(), String );
	    seliniumUtils.doubleClickOnElementUsingActions(BlogspotPage.getDoubleClick());
	}
	
	@Then("le message {string} s affiche dans Field2")
	public void leMessageSAfficheDansField2(String message) {
	   seliniumUtils.getAttribute(BlogspotPage.getField());
	   //validation.assertEquals(BlogspotPage.getField(), message);
	}


	/******************** frame ***********************/

	@When("Je choisis un job")
	public void jeChoisisUnJob() {
		seliniumUtils.switchToNewFrame(Setup.getDriver(), BlogspotPage.getFrame());
		wait.waitForElementToBePresent(BlogspotPage.getJob());
		select.selectDropDownListByIndex(BlogspotPage.getJob(), 2);
	}
	@Then("le job {string} est selectionné")
	public void leJobEstSelectionné(String job) {
		String actualJob = seliniumUtils.getText(BlogspotPage.getJob());
	    Assert.assertTrue(actualJob.contains(job));
	}
}
