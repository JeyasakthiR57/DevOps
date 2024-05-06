package module3Assignment;
import org.testng.annotations.Test;
import graphql.Assert;
import org.testng.annotations.BeforeTest;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
public class POM_login {
	WedbDriver driver;
	MuthootFinance m;
	  @Test
  public void f() 
  {
	  m.setUSERNAME("StarAgile");
	  m.setPASSWORD("SA0019");
	  m.LOGIN();
	  m.CAPTCHA()
	  System.out.println(m.getMESSAGE());
	  Assert.assertTrue(m.getMESSAGE().contains("Invalid"));
	   }
  @BeforeTest
  public void beforeTest() {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	  driver.get("https://online.muthootfinance.com/");
	  driver.manage().window().maximize();
	  m=new MuthootFinance(driver);
	  }
  @AfterTest
  public void afterTest() 
  {
	  driver.close();
	    }
}
