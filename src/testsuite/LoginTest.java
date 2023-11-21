package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        driver.findElement(By.name("username")).sendKeys("Admin");  //finds the computer button and clicks
        driver.findElement(By.name("password")).sendKeys("admin123");  //finds the computer button and clicks
        driver.findElement(By.className("orangehrm-login-action")).click(); //clicks on login button
        String expectedText = "Dashboard";
        WebElement actualTextElement = driver.findElement(By.xpath("//h6"));  //finds the element and verify if actual and expected match
        String actualText = actualTextElement.getText();
        Assert.assertEquals("Text Error", expectedText, actualText); //compares if expected and actual is equal
    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}