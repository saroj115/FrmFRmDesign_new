package stepDefinations;

import Resources.Base;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.chrome.ChromeDriver;
import pageObjectModel.LandingPage;

import java.io.IOException;

public class loginRetool extends Base {

    @Given("^Initialise browser with chrome$")
    public void initialise_browser_with_chrome() throws IOException {
        // Write code here that turns the phrase above into concrete actions
        driver= initializeDriver();

    }

    @When("^navigate to retool login page$")
    public void navigate_to_retool_login_page() throws Throwable {
        driver.get("https://dashboard.staging.intranet.parcelpoint.com.au/");
    }
    @Then("^Provide (.+) and (.+) to login$")
    public void provide_and_to_login(String username, String password) throws Throwable {
        LandingPage lp = new LandingPage(driver);
        lp.getEmail().sendKeys(username);
        lp.getPassword().sendKeys(password);
    }

    @Then("^Provide \"([^\"]*)\" and \"([^\"]*)\" to login$")
    public void provide_something_and_something_to_login(String strArg1, String strArg2)  {
        LandingPage lp = new LandingPage(driver);
        lp.getEmail().sendKeys(strArg1);
        lp.getPassword().sendKeys(strArg2);


    }

    @And("^User clicks login$")
    public void user_clicks_login()  {
        LandingPage lp = new LandingPage(driver);
        lp.getsignIn().click();// driver.find elements by can be used

    }


}
