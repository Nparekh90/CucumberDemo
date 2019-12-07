package ca.ecentennial.glue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class LoginGlue {

    @Given ("user launch ecentennial")
    public void login () throws IOException {

        StepHooks.driver.get(PropertyReader.getValue("url"));

    }
    @When("user enters credentials")
    public void enterCredential() {
        StepHooks.driver.findElement(By.xpath("//input[@id='username']")).sendKeys("301000838");
        StepHooks.driver.findElement(By.xpath("//input[@id='password']")).sendKeys("12345");
        StepHooks.driver.findElement(By.xpath("//*[@value='Sign In']")).click();
    }

    @Then("Then  user logged into the site")
    public void validateLogIn() {

        String currentUrl = StepHooks.driver.getCurrentUrl();

        Assert.assertEquals(currentUrl, "https://e.centennialcollege.ca/d2l/home");
    }

}
