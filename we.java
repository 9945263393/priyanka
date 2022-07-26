package aa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class we {
	  @Test()
	    public void sign() throws InterruptedException

	{

	System.setProperty("webdriver.chrome.driver","./vv/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://mobileworld.azurewebsites.net/");
	driver.findElement(By.xpath("//button[@class='btn btn-warning my-2 my-sm-0']")).click();
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Priya");
    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("1234");
    driver.findElement(By.xpath("//label[@class=\"custom-control-label\"]")).click();
  //  driver.findElement(By.xpath("//a[@href=\"index.html\"]")).click();
   // driver.findElement(By.xpath("//a[@href=\"signup.html\"]")).click();
}}
