import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Solvative2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		

		driver.get("https://solvative.com/");
driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		WebElement element = driver.findElement(By.xpath("//h1[@class='elementor-heading-title elementor-size-default']"));
		String Actual_text =element.getText();
		System.out.println(Actual_text);
		Assert.assertEquals(Actual_text,"INNOVATION MADE"); //verifying whether we are at the correct page. 
		
		
		System.out.println("now you are at the homepage ");



	driver.findElement(By.xpath("//div[@class='header_inner_right']"));
//Thread.sleep(10000);


String linkText = "LET'S TALK →"; 
WebElement elemente = driver.findElement(By.linkText(linkText));
elemente.click();


WebElement paragraph = driver.findElement(By.xpath("//div[@data-id='33b10ad9']/div[@class='elementor-widget-container']/p"));
//System.out.println(paragraph.getText());
String paragraph_=paragraph.getText();

Assert.assertEquals(paragraph_,"We’d love to hear from you and see how we can help.");

JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
jsExecutor.executeScript("window.scrollBy(0, 490)");
driver.findElement(By.xpath("//input[@id='your-name']")).click();
System.out.println("hh");
Thread.sleep(1000);

driver.findElement(By.xpath("//input[@id='your-name']")).sendKeys("automation testing 1234 56 checking");
System.out.println("name is done");

driver.switchTo().defaultContent();
driver.findElement(By.xpath("//input[@id='your-email']")).click();
driver.findElement(By.xpath("//input[@id='your-email']")).sendKeys("abcdefghit@gmail.com");
driver.switchTo().defaultContent();

driver.findElement(By.xpath("//input[@type='submit']")).click();
System.out.println("form is filled");

WebElement thanksElement = driver.findElement(By.xpath("//div[@class='visible-only-if-sent cf7-thank-you']/h2"));

String thanksText = thanksElement.getText();
System.out.println(thanksText);
	}

}