package STTA.MavenProject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebDriverTest {
  @Test
  public void testLaunch() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\IBM_ADMIN\\SC4BP\\SalesConnectAutomation_SVT4\\driver\\chromedriver.exe");
		 ChromeDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://google.in/");
		 Thread.sleep(5000);
		 driver.quit();
  }
}
