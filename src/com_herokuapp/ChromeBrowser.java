package com_herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser {
    public static void main(String[] args) {

        String MyURL = "http://the-internet.herokuapp.com/login";

        //Setup Chrome Driver
        WebDriver MyDriver = new ChromeDriver();

        //Open URL
        MyDriver.get(MyURL);

        //maximise browser
        MyDriver.manage().window().maximize();

        //implicit
        MyDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Print the title of the page
        System.out.println("Page Title is : " + MyDriver.getTitle());

        //Print URL
        System.out.println("Page URL is : " + MyURL);

        //Print page source code
        System.out.println("Page Sourcecode is : " + MyDriver.getPageSource());

        //Enter Email in to the email field
        MyDriver.findElement(By.name("username")).sendKeys("Jaydeep@Primetisting.com");


        //Enter Password into the password field
        MyDriver.findElement(By.name("password")).sendKeys("PrimeTestingPassword");


        //Close the Browser
        MyDriver.close();


    }

}





