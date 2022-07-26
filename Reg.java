package aa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Reg {
	@Test()
	 public void sign() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./vv/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mobileworld.azurewebsites.net/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='btn btn-warning my-2 my-sm-0']")).click();
		driver.findElement(By.xpath("//a[@href='signup.html']")).click();
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("priyanka");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("achar");
		Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder=\"Enter Email\"]")).sendKeys("priyanka@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("Abc123");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type=\"date\"]")).sendKeys("12/07/2022");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//textarea[@placeholder='Short Bio']")).sendKeys("Hello");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='btn btn-info form-control']")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        driver.findElement(By.xpath("//button[@type='Submit']")).click();
        driver.switchTo().alert().accept();
        Thread.sleep(2000);
        driver.findElement(By.id("username")).sendKeys("priya");
        Thread.sleep(2000);
        driver.findElement(By.id("password")).sendKeys("priya@123");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@class='btn btn-primary btn-block']")).click();
        driver.quit();
        }    
        

 
	}


