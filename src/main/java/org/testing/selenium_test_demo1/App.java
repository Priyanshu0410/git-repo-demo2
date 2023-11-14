package org.testing.selenium_test_demo1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    System.out.println("Script Started");
        //initializing web driver  	
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahoo\\chrome-driver\\chromedriver-win64\\chromedriver.exe");
    WebDriverManager.chromedriver().setup(); 	
    //setting properties
    ChromeOptions ChromeOptions = new ChromeOptions();
    //open url
    System.out.println("Driver opening up the url in brower");
    WebDriver driver = new ChromeDriver(ChromeOptions);
    driver.get("http://18.136.194.129:8080/addressbook-2.0/");
    
    //invole implicit waits to load the page
    driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
    
    System.out.println("Enter details in the form");
   //enter details
    driver.findElement(By.className("v-button")).click();
    //firstname gwt-uid-5
    driver.findElement(By.id("gwt-uid-5")).sendKeys("Shubham Singh");
    //lastname gwt-uid-7
    driver.findElement(By.id("gwt-uid-7")).sendKeys("Kushwah");
    //contactno id="gwt-uid-9"
    driver.findElement(By.id("gwt-uid-9")).sendKeys("9999999999");
    //email gwt-uid-11
    driver.findElement(By.id("gwt-uid-11")).sendKeys("shubham@xyz.com");
    //date of birth gwt-uid-13
    driver.findElement(By.id("gwt-uid-13")).sendKeys("04/09/2023,");
    //click on save -by class = v-button-primary
    driver.findElement(By.className("v-button-primary")).click();
    System.out.println("Saving details");
    
    System.out.println("Test Case execution completed ");
    driver.quit();
    
    
    
    	
  //submit form
    	
  //validate results
    	
  //take and store screenshots.
    	
    	
    	
    	
    	
    	
    	
        System.out.println( "Hello World!" );
    }
}
