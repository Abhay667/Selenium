import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowNavigations {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window()/*means we are menaging the window*/.maximize();
		// from here all wail run in maximize mode
		driver.get("https://www.google.com/");
		// in get all components will be loaded
driver.navigate().to("https://telecomtalk.info/");
// here it will start executing next instructions without loading all components
driver.navigate().back(); // it will get back to google page
Thread.sleep(2000);
driver.navigate().forward();//  it will again move to Telecomtalk

// fetching current  page URL
String CurrentURL;
CurrentURL =driver.getCurrentUrl();
System.out.println(CurrentURL);


	}

}
