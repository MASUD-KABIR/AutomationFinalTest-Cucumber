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
import page.AllListItemRemovePage;
import util.BrowserFactory;
import util.DataBase;

public class AllListItemRemoveSteps extends DataBase {

	WebDriver driver;

	@Before
	public void startFirst() {
		driver = BrowserFactory.launchBrowser();
	}

	@Given("^user is on techFios homepage$")
	public void user_is_on_techFios_homepage() {
		WebElement techFiostestWebPage = driver.findElement(By.xpath("//*[@id=\"label-first\"]/b"));
		Assert.assertTrue(techFiostestWebPage.isDisplayed());

	}

	@When("^user select toggel all check box$")
	public void user_select_toggel_all_check_box() throws Throwable {
		Thread.sleep(2000);
		AllListItemRemovePage toggelAllBox = PageFactory.initElements(driver, AllListItemRemovePage.class);
		toggelAllBox.ClickCheckBox();
		screenShot(driver, ".\\Screen Shot\\toggelAllSelected.jpg");
	}

	@Then("^click on remove button to remove all list item$")
	public void click_on_remove_button_to_remove_all_list_item() throws InterruptedException {
		Thread.sleep(5000);
		AllListItemRemovePage removeALI = PageFactory.initElements(driver, AllListItemRemovePage.class);
		removeALI.ClickRemoveButton();

	}

	@Then("^validate all list items are removed$")
	public void validate_all_list_items_are_removed() throws Throwable {
		AllListItemRemovePage AllListItemRemoved = PageFactory.initElements(driver, AllListItemRemovePage.class);
		AllListItemRemoved.verifyAllListItemsAreRemoved();
		screenShot(driver, ".\\Screen Shot\\AllListItemRemoved.jpg");
	}

	@After
	public void close() {
		BrowserFactory.tearDown();
	}
}
