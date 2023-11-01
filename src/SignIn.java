import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignIn {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		// using implicit wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		
 driver.get("https://rahulshettyacademy.com/locatorspractice/");
 driver.findElement(By.id("inputUsername"))/* select the element*/.sendKeys("Abhay");/* sending data to that text box*/
 driver.findElement(By.name("inputPassword")).sendKeys("1234567890"); /*same here but using name as locator*/
 //driver.findElement(By.className("submit")).click();
 //or
 //submit signInBtn
 driver.findElement(By.className("signInBtn")).click();
 System.out.println(driver.findElement(By.cssSelector("p.error")).getText()); // getting warning message

 
 // forgot password
 driver.findElement(By.linkText("Forgot your password?")).click();
 Thread.sleep(2000); //thread.seep
 
 
 driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("abhay"); //using Xpath
 driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("abc@gmail.com"); // using CSS selector
 driver.findElement(By.xpath("//input[@type='text'][2]")).clear();// using Xpath and clear method
 driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("newmail@gmail.com");// css selector
 driver.findElement(By.xpath("//form/input[3]")).sendKeys("9876435789"); // x path using only tags
 driver.findElement(By.cssSelector(".reset-pwd-btn")).click(); //CSS selector using DotClassName
  System.out.print(driver.findElement(By.cssSelector("form p")).getText());// suing parent tag space child tag
 //
 //trying  to login
  driver.findElement(By.xpath("//div[contains(@class,'pwd')]/button[1]")).click();// x path,dynamic,child parent relationship
  Thread.sleep(1000);// to stabilizing the view
 driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Rahul"); // using #Id
 driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");// TagName[Attribute* ="val"]  for dynamic
  driver.findElement(By.id("chkboxOne")).click();
  driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click(); // dynamic x path
  
	}

}
