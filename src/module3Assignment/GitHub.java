package module3Assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
public class GitHub 
{
	WebDriver driver;
	public GitHub(WebDriver driver)
	{
		this.driver = driver;
	}
	public void Username(String usr)
	{
		driver.findElement(By.id("login_field")).sendKeys(usr);	
		}
	public void Password(String pwd)
	{
		driver.findElement(By.name("password")).sendKeys(pwd);;
	}
	public void Signin()
	{
		JavascriptExecutor j= (JavascriptExecutor)driver;
		j.executeScript("arguments[0].click()", driver.findElement(By.xpath
				("//*[@id=\"login\"]/div[4]/form/div/input[13]")));
	}
	public String message() throws InterruptedException
	{
		Thread.sleep(5000);
		return driver.findElement(By.xpath("//*[@id=\"js-flash-container\"]/div/div/div")).getText();
	}}