package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class DiscountServiceTest {
    DiscountService service = null;
    String discountPercentage = "";

    @Given("Execute DiscountService business")
    public void execute_discount_service_business() {
        service = new DiscountService();
    }

    @When("If we enter {int}")
    public void if_we_enter(Integer amount) {
        discountPercentage = service.getDiscount(amount);
    }

    @Then("We should not get any discount")
    public void weShouldNotGetAnyDiscount() {
        Assert.assertEquals("NA", discountPercentage);
    }

    @Then("We will get ten percent discount")
    public void weWillGetTenPercentDiscount() {
        Assert.assertEquals("10%", discountPercentage);
    }

    @Then("We will get fifteen percent discount")
    public void weWillGetFifteenPercentDiscount() {
        Assert.assertEquals("15%", discountPercentage);
    }


}
