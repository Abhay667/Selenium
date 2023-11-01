import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window()/*means we are menaging the window*/.maximize();
		driver.get("https://jqueryui.com/droppable/"); // navigating to the URL
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		WebElement source= driver.findElement(By.id("draggable")); // element which we have to drop
		WebElement Destination= driver.findElement(By.id("droppable")); // element where we have to drop
		Thread.sleep(2000); // wait for 2 seconds
	Actions a = new Actions(driver);  // Using  Actions class to get dragAndDrop method
	a.dragAndDrop(source, Destination).build().perform(); // performing drag and drop 
	}

}
