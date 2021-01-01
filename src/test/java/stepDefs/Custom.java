package stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Custom {
    @When("I select custom option")
    public void i_select_custom_option() {
        System.out.println("select custom shoe option");
    }

    @When("I select a model")
    public void i_select_a_model() {
        System.out.println("select model 990v5");
    }

    @Then("I see the customize page")
    public void i_see_the_customize_page() {
        System.out.println("you will see the custom page");
    }
}
