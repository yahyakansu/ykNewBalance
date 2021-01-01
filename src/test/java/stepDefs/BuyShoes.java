package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.HomePage;
import pages.KidsPage;
import utilities.Config;
import utilities.Driver;

public class BuyShoes {
    private WebDriver driver;
    private HomePage homePage=new HomePage();
    private KidsPage kidsPage=new KidsPage();

    @Given("On NewBalance home page")
    public void on_new_balance_home_page() {
        driver= Driver.getDriver();
        driver.get(Config.getProperties("url"));
        Assert.assertTrue(driver.getTitle().equals("Athletic Footwear & Fitness Apparel - New Balance"));
    }

    @When("I show the popUp pass it")
    public void i_show_the_pop_up_pass_it() {
        WebElement popUp=homePage.popUp;
        if (popUp.isDisplayed()){
            popUp.click();
        }
    }

    @When("I search boys shoes")
    public void i_search_boys_shoes() {
        homePage.search.sendKeys("boys shoes"+ Keys.ENTER);
    }

    @When("I select the running shoes")
    public void i_select_the_running_shoes() {
        homePage.runningShoes.click();
    }

    @When("I select size and color")
    public void i_select_size_and_color() {
        kidsPage.type.click();
        kidsPage.size.click();
        kidsPage.color.click();
    }

    @Then("I show the results")
    public void i_show_the_results() {
        WebElement yellowShoe = kidsPage.yellowShoe;
        System.out.println(yellowShoe.getText());

        String price = kidsPage.price.getText();
        System.out.println("price for boys shoes: " + price);

    }
}
