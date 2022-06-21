package com.telran.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class IlcarroTest {
    WebDriver driver;

    @BeforeMethod
    public void SetUp() {
        driver = new ChromeDriver();
        driver.get("https://ilcarro-1578153671498.web.app/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void findElementsByClassTest() {
        String element = driver.getTitle(); // можно найти только таким спопсобом, так как <title> есть метатегом и находится в сегда в <head>
        System.out.println(element);

//        driver.findElement(By.className("title"));

        List<WebElement> title1 = driver.findElements(By.className("title"));
        System.out.println(title1.size());

//        driver.findElements(By.className("title"))
        List<WebElement> title = driver.findElements(By.className("title"));
        for (int i = 0; i < title.size(); i++) {
            String newTitle = title.get(i).getText();
            System.out.println(newTitle);
        }



    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}

