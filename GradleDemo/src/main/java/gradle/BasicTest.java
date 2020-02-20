package gradle;

import org.junit.Test;

public class BasicTest {
	@Test
	public void login() {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\BLTuser.BLT1201\\Downloads\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.linkedin.com");
	driver.manage().window().maximize();
}
}