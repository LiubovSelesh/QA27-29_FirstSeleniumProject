package com.telran.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class HomePageWorkFlowTests extends TestBase {

    @Test
    public void loginUser(){


        driver.findElement(By.cssSelector("#username"));
        driver.findElement(By.cssSelector("#password"));
        driver.findElement(By.xpath("//label[contains(text(),'Запомнить меня')]"));
        driver.findElement(By.cssSelector("#login_button"));
        isElementFormPresent(By.cssSelector(".login.center-block"));
        isElementPresent2(By.cssSelector(".login.center-block"));


    }


}
