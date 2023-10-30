import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//invoke the browser
		//ChromeDriver driver = new ChromeDriver(); // creating ChromeDriver class object to access their methods, it has own as well as WebDriver methods.
		//System.setProperty("webdriver.chrome.driver","path");
		WebDriver driver = new ChromeDriver(); // it has only WebDriver methods
		
		driver.get("https://rahulshettyacademy.com/"); // to hit the specific URL
		System.out.println(driver.getTitle()); // to get title
		System.out.print (driver.getCurrentUrl()); // get current URL
		//driver.close();// close only current page
		driver.quit(); // closes all pages
	}

}
