package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ForgetPasswordTest extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {
        driver.findElement(By.className("orangehrm-login-forgot")).click();
        String expectedText = "Reset Password";
        WebElement actualTextElement = driver.findElement(By.className("orangehrm-forgot-password-button--reset"));  //finds the element and verify if actual and expected match
        String actualText = actualTextElement.getText();
        Assert.assertEquals("Text Error", expectedText, actualText); //compares if expected and actual is equal
    }
    @After
    public void tearDown() {
        closeBrowser();
    }
}
