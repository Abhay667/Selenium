import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
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
System.out.println(paragraph.getText());
System.out.println("hidhi");
	}

}