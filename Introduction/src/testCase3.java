import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class testCase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// IE driver
				System.setProperty("webdriver.ie.driver", "C:\\auto\\drivers\\IEDriverServer.exe");
				
				WebDriver driver = new InternetExplorerDriver();
				driver.get("https://www.google.com/");
				System.out.println(driver.getTitle());
				;
	}

}