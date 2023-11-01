

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		try
		{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("/html/body/div[3]/div/span")).click();
		Thread.sleep(2000);
		Actions a = new Actions(driver);
		
		
			a.moveToElement(driver.findElement(By.xpath("//div[@class='exehdJ']"))).build().perform();
		}
		catch (NoSuchElementException e) {
            System.out.println("Element found but handling exception");
        }
		
		
	}

}
