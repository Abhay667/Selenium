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

public class Solvative {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		

		driver.get("https://solvative.com/");
driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		WebElement element = driver.findElement(By.xpath("//h1[@class='elementor-heading-title elementor-size-default']"));
		String Actual_text =element.getText();
		System.out.println(Actual_text);
		Assert.assertEquals(Actual_text,"INNOVATION MADE"); //verifying whether we are at the correct page. 
		//div[@class='header_inner_right']
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//        WebElement headerInnerRightDiv = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='header_inner_right']")));


	driver.findElement(By.xpath("//div[@class='header_inner_right']"));
//		WebElement menuElement = driver.findElement(By.xpath("//nav[contains(@class, 'main_menu') and contains(@class, 'drop_down') and contains(@class, 'right')]"));
Thread.sleep(10000);
System.out.println("hi");
//	WebElement menuElement = driver.findElement(By.cssSelector("nav.main_menu.drop_down.right"));
//WebElement eleement = driver.findElement(By.xpath("//header/div/nav/ul/li[5]/a/span"));



//WebElement ulElement = driver.findElement(By.xpath("//ul[@id='menu-main-menu']"));
//ul[@id='menu-main-menu']/li[@id='nav-menu-item-831']
		//WebElement ulElement = driver.findElement(By.xpath("//ul[@id='menu-main-menu']/li[@id='nav-menu-item-831']"));
//ul[@id='menu-main-menu']/li[@id='nav-menu-item-831']/a ***
//WebElement ulElement = driver.findElement(By.xpath("ul[@id='menu-main-menu']/li[@id='nav-menu-item-831']//a"));

//String linkText = "Let’s Talk"; // Replace with the actual link text you want to click
//WebElement elemente = driver.findElement(By.linkText(linkText));
//elemente.click();
//List<WebElement> links = driver.findElements(By.tagName("a"));
//
//
//for (WebElement link : links) {
//    System.out.println(link.getText());
//}
//LET'S TALK →
String linkText = "LET'S TALK →"; // Replace with the actual link text you want to click
WebElement elemente = driver.findElement(By.linkText(linkText));
elemente.click();

System.out.println("hihi");
//div[@data-id='33b10ad9']/div[@class='elementor-widget-container']/p
//WebElement paragraph = driver.findElement(By.xpath("//div[@data-id='33b10ad9']/div[@class='elementor-widget-container']/p"));
WebElement paragraph = driver.findElement(By.xpath("//div[@data-id='33b10ad9']/div[@class='elementor-widget-container']/p"));
//System.out.println(paragraph.getText());
String paragraph_=paragraph.getText();
System.out.println("hidhi");
Assert.assertEquals(paragraph_,"We’d love to hear from you and see how we can help.");
//input[@id='your-name']
JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
jsExecutor.executeScript("window.scrollBy(0, 490)");
//WebElement inputElementNmae = driver.findElement(By.xpath("//input[@id='your-name']"));
driver.findElement(By.xpath("//input[@id='your-name']")).click();
System.out.println("hh");
Thread.sleep(1000);
//WebElement activatedText = driver.findElement(By.xpath("//div[@class='form-group']//p/label[@for='your-name']"));
//
//activatedText.sendKeys("abhay agrawal");
//*****
driver.findElement(By.xpath("//input[@id='your-name']")).sendKeys("automation testing 1234 56 checking");
System.out.println("name is done");
//**
//input[@id='your-email']
driver.switchTo().defaultContent();
driver.findElement(By.xpath("//input[@id='your-email']")).click();
driver.findElement(By.xpath("//input[@id='your-email']")).sendKeys("abcdefghit@gmail.com");
driver.switchTo().defaultContent();
//input[@type='submit']
driver.findElement(By.xpath("//input[@type='submit']")).click();
System.out.println("form is filled");
//div.visible-only-if-sent.cf8-thank-you
//driver.findElement(By.cssSelector("div.visible-only-if-sent.cf8-thank-you"));
//WebElement element3 = driver.findElement(By.xpath("//div[contains(@class, 'visible-only-if-sent') and contains(@class, 'cf8-thank-you')]"));
//class="visible-only-if-sent cf8-thank-you"
//WebElement element3 = driver.findElement(By.xpath("//div[@id='wpcf7-f752-p830-o1']"));
//div[@id='wpcf7-f752-p830-o1']/div[@class='screen-reader-response']
//WebElement element3 = driver.findElement(By.xpath("//div[@id='wpcf7-f752-p830-o1']/div[@class='screen-reader-response']"));
//div[@id='wpcf7-f752-p830-o1']/div[@class='screen-reader-response']/p
//WebElement element3 = driver.findElement(By.xpath("//div[@id='wpcf7-f752-p830-o1']/div[@class='screen-reader-response']/p"));
//String element3 = driver.findElement(By.xpath("//div[@id='wpcf7-f752-p830-o1']//div[@class='screen-reader-response']//p")).getText();
//System.out.println(element3);
//String statusElement = driver.findElement(By.xpath("//div[@id='wpcf7-f752-p830-o1']//div[@class='screen-reader-response']//p[@role='status']")).getText();
//System.out.println(statusElement);
//***
//WebElement thanksElement = driver.findElement(By.xpath("//h2[normalize-space()='Thanks']"));
//String thanksText = thanksElement.getText();
//System.out.println(thanksElement);
//WebElement thanksElement = driver.findElement(By.xpath("//div[@class='cf7-thank-you']/h2"));
WebElement thanksElement = driver.findElement(By.xpath("//div[@class='visible-only-if-sent cf7-thank-you']/h2"));

String thanksText = thanksElement.getText();
System.out.println(thanksText);
	}

}