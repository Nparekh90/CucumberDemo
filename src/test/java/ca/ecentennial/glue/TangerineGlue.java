package ca.ecentennial.glue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class TangerineGlue {

    @Given("I launch Tangerine website")
    public void tangerinelaunch(){
        System.out.println("hello");
        StepHooks.driver.get("https://www.tangerine.ca/en/index.html");

    }

    @When("I click LogMeIn button")
    public void clickLogMeIn() {

        StepHooks.driver.findElement(By.xpath("//a[@id= 'mainnav_login']")).click();

    }

    @Then("I validate LogIn button is disabled")
    public void validateDisable() {

        boolean isDisabled = StepHooks.driver.findElement(By.id("login_logMeIn")).isEnabled();
        Assert.assertFalse(isDisabled);

    }

    @When ("I enter in userNAme field value")
    public void userName() throws InterruptedException {
        StepHooks.driver.findElement(By.xpath("//input[@id='login_clientId']")).sendKeys("12345");
        Thread.sleep(3000);
    }

    @Then ("I Validate Log Me In button is enabled on the page")
    public void validateEnable() {
        boolean isEnable = StepHooks.driver.findElement(By.id("login_logMeIn")).isEnabled();
        Assert.assertTrue(isEnable);
    }
}
