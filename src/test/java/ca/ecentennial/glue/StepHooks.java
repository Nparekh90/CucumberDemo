package ca.ecentennial.glue;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepHooks {

    public static WebDriver driver;

    @Before
    public  void setUpBrowser () {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver"); //launch chrome driver
        driver = new ChromeDriver();
        driver.manage().window().maximize(); //maximize window

    }

    @After
    public void quitBrowser () {

//        driver.quit();


    }
}
