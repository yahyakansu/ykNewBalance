package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utilities.Config;
import utilities.Driver;

public class BuyShoes {
    private WebDriver driver;

    @Given("On NewBalance home page")
    public void on_new_balance_home_page() {
        driver= Driver.getDriver();
        driver.get(Config.getProperties("url"));
        Assert.assertTrue(driver.getTitle().equals("Athletic Footwear & Fitness Apparel - New Balance"));
    }

    @When("I show the popUp pass it")
    public void i_show_the_pop_up_pass_it() {

    }

    @When("I search boys shoes")
    public void i_search_boys_shoes() {

    }

    @When("I select the running shoes")
    public void i_select_the_running_shoes() {

    }

    @When("I select size and color")
    public void i_select_size_and_color() {

    }

    @Then("I show the results")
    public void i_show_the_results() {

    }
}
