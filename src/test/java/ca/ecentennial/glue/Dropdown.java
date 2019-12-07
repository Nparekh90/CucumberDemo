package ca.ecentennial.glue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

    @Given("user launch seleniumeasy")
    public void launch () {

        StepHooks.driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");

    }

    @When("user select a day from single select dropdown list")
    public  void select_a_day () {

        Select dropdown = new Select(StepHooks.driver.findElement(By.id("select-demo")));
        dropdown.selectByVisibleText("Thursday");

    }

    @Then("user can see a selected day in message")
    public void validateMessage () {

        String day = StepHooks.driver.findElement(By.id("select-demo")).getAttribute("value");
        Assert.assertEquals("Thursday", day );


        String message = StepHooks.driver.findElement(By.className("selected-value")).getText();
        Assert.assertEquals("Day selected :- Thursday", message);

    }



}
