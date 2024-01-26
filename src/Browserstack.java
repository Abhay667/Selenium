import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browserstack {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		 driver.get("https://www.google.com/");
		 WebElement element = driver.findElement(By.xpath("//div[@class='a4bIc']"));
		 element.click();
		 driver.findElement(By.xpath("//div[@class='RNNXgb']//textarea[@id='APjFqb']")).sendKeys("browserstack.com ", Keys.ENTER);

		 
		
	}

}
