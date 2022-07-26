package aa;
	
import java.util.Iterator;
import java.util.List;
import java.util.Set;  
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;  
public class Order 
	{ 
	@Test()
	public void Order() throws InterruptedException
	{
     System.setProperty("webdriver.chrome.driver","./vv/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://mobileworld.azurewebsites.net");
	driver.manage().window().maximize();
	//AllMobiles
	driver.findElement(By.xpath("//a[@href='mobile.html']")).click();
	Thread.sleep(1000);
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,500)");
	driver.findElement(By.xpath("//tbody[@id='myTable']/tr[2]/td[5]/a")).click();
	Set<String> windows = driver.getWindowHandles();
	Iterator<String> it = windows.iterator();
	String parentId = it.next();
	String childId = it.next();
	driver.switchTo().window(childId);
	driver.findElement(By.xpath("//input[@id='inputFirstName']")).sendKeys("priyanka");
	driver.findElement(By.xpath("//body/div[@class='container']/div[1]/div[2]/form[1]/div[1]/div[2]/input")).sendKeys("achar");
	driver.findElement(By.id("inputEmail")).sendKeys("priyan@gmail.com");
	driver.findElement(By.id("inputPassword")).sendKeys("priyanka@gmail.com");
	driver.findElement(By.xpath("//input[@type='number']")).sendKeys("9945263393");
	driver.findElement(By.id(" address1")).sendKeys("jayanagar");
	driver.findElement(By.id("address2")).sendKeys("Davanagere");
	driver.findElement(By.id("inputCity")).sendKeys("Davanagere");
	WebElement State=driver.findElement(By.id("inputState"));
	Select S=new Select(State);
	S.selectByIndex(2);
	driver.findElement(By.id("inputZip")).sendKeys("577002");
	driver.findElement(By.xpath("//input[@rel='apple']")).click();
	driver.findElement(By.xpath("//input[@rel='samsung']")).click();
	driver.findElement(By.xpath("//div[@class='apple']//option[2]")).click();
	driver.findElement(By.xpath("//input[@placeholder='no of mobiles']")).sendKeys("1");
	WebElement Count = driver.findElement(By.id("bought"));
	Select s3= new Select( Count );
	s3.selectByIndex(1);
	Thread.sleep(2000);
	List<WebElement> a=driver.findElements(By.id("gridCheck1"));
	a.get(0).click();
	a.get(1).click();
	driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@class='btn btn-secondary']")).click();
	driver.quit();
	}
	}
	
	




