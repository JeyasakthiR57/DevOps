package module3Assignment;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
public class PageObejectModel {
	WebDriver driver;
	GitHub gh;
  @Test
  public void f() throws InterruptedException {
	  gh.Username("Jeyasakthi");
	  gh.Password("Jeya123");
	  gh.Signin();
	  System.out.println(gh.message());
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	  driver.get("https://github.com/login");
	  gh=new GitHub(driver);
  }
  @AfterTest
  public void afterTest()
  {
	  driver.close();
  }}
