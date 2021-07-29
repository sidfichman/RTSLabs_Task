package com.RSTLabs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetToWebsite {

    public static void main(String[] args) {


        //Open chrome browser
        //setup the browser driver
        WebDriverManager.chromedriver().setup();

        //create instance of Webdriver to open the browser

        WebDriver driver = new ChromeDriver();

        //go to "https://www.google.com"

        driver.get("https://www.google.com");

        // find google search field web element and populate search field

        driver.findElement(By.name("q")).sendKeys("RTS Labs"+ Keys.ENTER);
/*
 click the rts link from the search list. Wasn't sure if you wanted me to click any first link generically
 or specifically the rts link which was first
 */
        driver.findElement(By.xpath("//cite[@class='iUh30 Zu0yb tjvcx']")).click();




    }
}