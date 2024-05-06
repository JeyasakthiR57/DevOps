package module3Assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class MuthootFinance
{
	WebDriver driver;
	public MuthootFinance(WebDriver driver) 
	{
			this.driver = driver;
	}
	public void setUSERNAME(String username)
	{
		driver.findElement(By.id("UserName")).sendKeys(username);
	}
	public void setPASSWORD(String password)
	{
		driver.findElement(By.id("Password")).sendKeys(password);
	}
	public void LOGIN()
	{
		driver.findElement(By.id("loginFormSubmitButton")).click();
	}
	public void CAPTCHA()
	{
		driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor-label\"]")).click();
	}
	public void getMESSAGE()
	{
		 driver.findElement(By.xpath("//*[@id=\"swal2-html-container\"]")).getText();
	}
}