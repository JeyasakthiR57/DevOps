package module3Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateWebsite1 
{
	public static void main(String[] args) throws InterruptedException
		
	{

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.zomato.com/india");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/header/nav/ul[2]/li[2]/a")).click();
		driver.close();
	
	}

}
