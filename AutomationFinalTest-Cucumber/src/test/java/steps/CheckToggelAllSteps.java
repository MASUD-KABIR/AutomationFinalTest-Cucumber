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
import page.CheckToggelAllPage;
import util.BrowserFactory;
import util.DataBase;

public class CheckToggelAllSteps extends DataBase {
	WebDriver driver;

	@Before
	public void startFirst() {
		driver = BrowserFactory.launchBrowser();
	}

	@Given("^user is on techFios test webpage$")
	public void user_is_on_techFios_test_webpage() {
		WebElement techFiostestWebPage = driver.findElement(By.xpath("//*[@id=\"label-first\"]/b"));
		Assert.assertTrue(techFiostestWebPage.isDisplayed());

	}

	@When("^user select toggle all check box$")
	public void user_select_toggle_all_check_box() throws Exception {
		CheckToggelAllPage toggelAll = PageFactory.initElements(driver, CheckToggelAllPage.class);
		toggelAll.ClickCheckBox();
		screenShot(driver, ".\\Screen Shot\\CheckToggelAll.jpg");
	}

	@Then("^all check boxes for list items are selected$")
	public void all_check_boxes_for_list_items_are_selected() throws InterruptedException {
		WebElement toggelAll = driver.findElement(By.xpath("//input[@value='on']"));
		Assert.assertTrue(toggelAll.isSelected());
	
	}

	@After
	public void close() {
		BrowserFactory.tearDown();
	}

}
