import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//selenium code - 
		  //Create Driver object for chorme Browser
        // We will stricctly implement method of webdriver 
        /* Class name = Chorme Driver
             X driver = new X();
         */
        // invoke.exe file first 
		System.setProperty("webdriver.chrome.driver", "C:\\auto\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");// Hit url on the browser
		System.out.println(driver.getTitle()); // validate if your Page title is correct 
		
		System.out.println(driver.getCurrentUrl()); // Validate if you are landed on correct url 
		
		// System.out.println(driver.getPageSource());
		
		driver.get("http://yahoo.com");
		//driver.navigate().back();
		//driver.navigate().forward();
		driver.close();
		//driver.quit();
		
	}

}
