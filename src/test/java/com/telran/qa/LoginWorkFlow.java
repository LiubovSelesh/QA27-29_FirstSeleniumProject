package com.telran.qa;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginWorkFlow extends TestBase {
    @BeforeMethod
    public void ensurePrecondition() {
        if(!isElementPresent2(By.cssSelector(".login.center-block"))) {
            click(By.cssSelector("#userName"));
        }

    }

    @Test
    public void loginUserPositiveTest() {

        click(By.cssSelector(".login.center-block"));

        type(By.cssSelector("#username"), "tester");
        type(By.cssSelector("#password"), "K35G3U");
        click(By.xpath("//label[contains(text(),'Запомнить меня')]"));
        click(By.cssSelector("#login_button"));

        Assert.assertTrue(isElementPresent2(By.xpath("//span[@id='userName']")));

    }

}
