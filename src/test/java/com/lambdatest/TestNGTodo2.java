package com.lambdatest;

import java.lang.reflect.Method;
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

// Import WebDriverManager
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGTodo2 {

    private RemoteWebDriver driver;
    private String Status = "failed";

    @BeforeMethod
    public void setup(Method m, ITestContext ctx) throws MalformedURLException {
        // Use WebDriverManager to setup ChromeDriver
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void basicTest() throws InterruptedException {
        String spanText;
        System.out.println("Loading Url");

        driver.get("https://lambdatest.github.io/sample-todo-app/");

        System.out.println("Checking Box");
        driver.findElement(By.name("li1")).click();

        System.out.println("Checking Another Box");
        driver.findElement(By.name("li2")).click();

        System.out.println("Checking Box");
        driver.findElement(By.name("li3")).click();

        System.out.println("Checking Another Box");
        driver.findElement(By.name("li4")).click();

        driver.findElement(By.id("sampletodotext")).sendKeys(" List Item 6");
        driver.findElement(By.id("addbutton")).click();

        driver.findElement(By.id("sampletodotext")).sendKeys(" List Ite
