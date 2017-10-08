package com.elsevier.steps;

import java.util.List;
import org.junit.Assert;

import com.elsevier.base.BaseUtil;
import com.elsevier.base.GenUtil;
import com.elsevier.pages.Feedpage;
import com.elsevier.pages.Homepage;
import com.elsevier.pages.Joinpage;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefintion extends BaseUtil {

	private BaseUtil base;

	public Stepdefintion(BaseUtil base) {
		this.base = base;
	}

	@Given("^I am on the Create account page$")
	public void i_am_on_the_Create_account_page() throws Throwable {
		base.Driver.navigate().to("https://www.mendeley.com");
	}

	@When("^I click create account link$")
	public void i_click_create_account_link() throws Throwable {
		Homepage hpage = new Homepage(base.Driver);
		hpage.click_create_account_link();
	}

	@When("^I enter valid details as follows$")
	public void i_enter_correct_details_as_follows(DataTable table) throws Throwable {
		List<List<String>> data = table.raw();
		Joinpage jpage = new Joinpage(base.Driver);
		jpage.enterEmail(GenUtil.getrandomnumber() + data.get(1).get(1));
		jpage.enterFirstname(data.get(2).get(1));
		jpage.enterLastname(data.get(3).get(1));
		jpage.enterPassword(data.get(4).get(1));

	}

	@When("^I click continue button$")
	public void i_click_continue_button() throws Throwable {
		Joinpage jpage = new Joinpage(base.Driver);
		jpage.clickContinueButton();

	}

	@When("^I select a Field of study from the drop down$")
	public void i_select_a_Field_of_study_from_the_drop_down() throws Throwable {
		Joinpage jpage = new Joinpage(base.Driver);
		jpage.selectFieldOfStudy();
	}

	@When("^I select an Academic status from the drop down$")
	public void i_select_an_Academic_status_from_the_drop_down() throws Throwable {
		Joinpage jpage = new Joinpage(base.Driver);
		jpage.selectAcademicStatus();
	}

	@When("^I click on Create account button$")
	public void i_click_on_Create_account_button() throws Throwable {
		Joinpage jpage = new Joinpage(base.Driver);
		jpage.clickCreatAccountButton();
	}

	@Then("^\"([^\"]*)\" page is displayed$")
	public void page_is_displayed(String pagename) throws Throwable {
		Feedpage fpage = new Feedpage(base.Driver);
		fpage.waitForVisibilityOfFeedPage();
		Assert.assertEquals(pagename, base.Driver.getTitle());
	}

}
