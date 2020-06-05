import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//selenium code - 
		  //Create Driver object for Firefox Browser
      // We will stricctly implement method of webdriver 
      /* Class name = Chorme Driver
           X driver = new X();
       */
      // gecko driver
		System.setProperty("webdriver.gecko.driver", "C:\\auto\\drivers\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		;
		
	}

}
