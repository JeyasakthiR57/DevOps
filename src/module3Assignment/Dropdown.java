package module3Assignment;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Dropdown
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
		Select days = new Select (driver.findElement(By.xpath("//*[@id=\"select-demo\"]")));
		System.out.println("Selected Option is :" +days.getFirstSelectedOption().getText());
		List<WebElement>week=days.getOptions();
		System.out.println("Total Available Options : " +week.size());
		int i=0;
		for(WebElement w : week)
		{
			System.out.println(i +" Options are: " + w.getText());
			i++;
		}
		days.selectByVisibleText("Wednesday");
		System.out.println("Selected Day is: " +days.getFirstSelectedOption().getText());
		driver.close();
	}}
