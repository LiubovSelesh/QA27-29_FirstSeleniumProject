package com.telran.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LocatorsForMyStore {
    WebDriver wd;

    @BeforeMethod
    public void setUp() {
        wd = new ChromeDriver();
        wd.get("http://automationpractice.com/index.php");
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void FindCssLocators() {
        wd.findElement(By.cssSelector("#search_block_top"));
        wd.findElement(By.cssSelector("#header_logo"));

        wd.findElement(By.cssSelector(".banner"));
        wd.findElement(By.cssSelector(".columns-container"));

        wd.findElement(By.cssSelector("div.rte"));
        wd.findElement(By.cssSelector("#columns"));

        wd.findElement(By.cssSelector(".footer-container"));
        wd.findElement(By.cssSelector("#center_column"));

        wd.findElement(By.cssSelector(".tab-content"));
        wd.findElement(By.cssSelector(".header-container"));

    }

    @Test
    public void FindXpathLocators() {
        wd.findElement(By.xpath("//div[@id='search_block_top']"));
        wd.findElement(By.xpath("//div[@id='header_logo']"));
//
        wd.findElement(By.xpath("//div[@class='banner']"));
        wd.findElement(By.xpath("//div[@class='columns-container']"));
//
        wd.findElement(By.xpath("//div[@class='rte']"));
        wd.findElement(By.xpath("//div[@id='columns']"));
//
        wd.findElement(By.xpath("//div[@class='footer-container']"));
        wd.findElement(By.xpath("//div[@id='center_column']"));

        wd.findElement(By.xpath("//div[@class='tab-content']"));
        wd.findElement(By.xpath("//div[@class='header-container']"));

    }

    @AfterMethod
    public void tearDown() {
        wd.quit();
    }
}
