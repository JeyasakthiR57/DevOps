package module3Assignment;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class RegistrationForm {
	public static void main(String[] args) throws InterruptedException {
		
		// Registration form Open
		WebDriver driver= new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/register");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		System.out.println("Titile is :" +driver.getTitle());
		
		//Gender Selection
		WebElement radiobutton = driver.findElement(By.xpath("//*[@id=\"gender-female\"]"));
		radiobutton.click();
		System.out.println("Radio Button Displayed: " +radiobutton.isDisplayed());
		System.out.println("Female Selected? "+radiobutton.isSelected());
		
		//Input Firstname & Lastname
		WebElement firstname = driver.findElement(By.xpath("//*[@id=\"FirstName\"]"));
		firstname.sendKeys("Jeya");
		WebElement lastname = driver.findElement(By.xpath("//*[@id=\"LastName\"]"));
		lastname.sendKeys("Sakthi");
		
		//Input Mail
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("jeyasakthi1223@gmail.com");
		
		//Input Password & confirm password
		driver.findElement(By.name("Password")).sendKeys("jeya123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("jeya123");
		
		//Register
		WebElement register=driver.findElement(By.cssSelector("#register-button"));
		register.click();
		
		
		String currenturl=driver.getCurrentUrl();
		String expurl = "https://demowebshop.tricentis.com/registerresult/1";
		
		//For NewUser
		if (expurl==currenturl)
		{
		
		System.out.println("Registration Status: " +driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]")).getText());
		}
		
		else
		//Already Registered User
			
			System.out.println("Registration Status: " +driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div"
					+ "[2]/form/div/div[2]/div[1]/div/ul/li")).getText());
		
			Thread.sleep(5000);
			
		driver.close();
	}
}
