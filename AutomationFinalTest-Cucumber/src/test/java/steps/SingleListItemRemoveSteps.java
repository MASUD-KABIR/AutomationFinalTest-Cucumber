package steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.SingleListItemRemovePage;

import util.BrowserFactory;
import util.DataBase;

public class SingleListItemRemoveSteps extends DataBase{

	WebDriver driver;

	@Before
	public void startFirst() {
		driver = BrowserFactory.launchBrowser();
	}

	@Given("^user goes to techFios test webpage$")
	public void user_goes_to_techFios_test_webpage() {
		WebElement techFiostestWebPage = driver.findElement(By.xpath("//*[@id=\"label-first\"]/b"));
		Assert.assertTrue(techFiostestWebPage.isDisplayed());
	}

	@When("^user select single check box$")
	public void user_select_single_check_box() throws Exception {
//		Thread.sleep(4000);
		SingleListItemRemovePage SingleCBR = PageFactory.initElements(driver, SingleListItemRemovePage.class);
		SingleCBR.ClickSingleCheckBox();
		screenShot(driver, ".\\Screen Shot\\SingleListItemSelected.jpg");
	}

	@Then("^click on remove button to remove single list item$")
	public void click_on_remove_button_to_remove_single_list_item() throws Exception {
		SingleListItemRemovePage SCBRbutton = PageFactory.initElements(driver, SingleListItemRemovePage.class);
		SCBRbutton.ClickRemoveButton();

	}

	@Then("^validate single list item is removed$")
	public void validate_single_list_item_is_removed() throws Exception {
		SingleListItemRemovePage RSListItem = PageFactory.initElements(driver, SingleListItemRemovePage.class);
		RSListItem.verifySinglecheckboxIsRemoved();
		screenShot(driver, ".\\Screen Shot\\SelectedSingleListItemRemoved.jpg");

	}
	@After
	public void close() {
		BrowserFactory.tearDown();
	}

}
