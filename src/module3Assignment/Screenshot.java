package module3Assignment;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
public class Screenshot 
{
	public static void main(String[] args) throws IOException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		driver.manage().window().maximize();
		driver.get("https://www.pizzahut.co.in/");
		File prtsc= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(prtsc, new File("C:\\Users\\Jeya\\Desktop\\New folder\\photo.jpeg"));
		driver.close();
		
	}
}
