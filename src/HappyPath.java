import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HappyPath {

	

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		// using implicit wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		String name ="abhay"; //declaring variable
		
 driver.get("https://rahulshettyacademy.com/locatorspractice/");
 driver.findElement(By.id("inputUsername")).sendKeys(name); //using variable
 driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy"); 
 driver.findElement(By.className("signInBtn")).click();
 Thread.sleep(1000); //stabilize the  new view
     System.out.println(driver.findElement(By.tagName("p")).getText());
    Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
    		driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText();
    		 
    Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+ name+",");// using variable		 
    		 //Log out
           driver.findElement(By.xpath("//button[text()='Log Out']")).click();
	}

}
