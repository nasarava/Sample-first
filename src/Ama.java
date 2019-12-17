
public class Ama {
	package sel;

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Amazon {
		
			public static void main(String[] args)
			{
				System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				
				
				
				JavascriptExecutor js = (JavascriptExecutor)driver;
				
				driver.get("https://www.amazon.in/");
				

				//driver.findElementByXPath("(//span[@class='nav-line-2'])[2]").click();
				driver.findElement(By.xpath("(//span[@class='nav-line-2'])[2]")).click();
				
			//	WebElement webl=driver.findElementByXPath("//input[@id='ap_email']");
				WebElement webl=driver.findElement(By.xpath("(//span[@class='nav-line-2'])[2]"));
				js.executeScript("arguments[0].value='Avinash Mishra';", webl);
				
				
				//js.executeScript("arguments[0].value='Avinash Mishra';",Lt);
				
				
			}





			
				
			}





}
