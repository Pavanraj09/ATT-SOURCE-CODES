package expiri11;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class WEEK11 {

	public static void main(String[] args)throws InterruptedException  {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome..driver","C:\\Users\\student\\Desktop\\Selenium Lab\\chromedriver-win64\\chromedriver-win64");
		WebDriver driver=new ChromeDriver();
		Actions builder = new Actions(driver);
		driver.get("https://www.google.co.in/");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		Actions bulider = new Actions(d);
		d.get("https://www.myntra.com/");
		Thread.sleep(5000);WebElement profileHyperlink = d.findElement(By.xpath("(//span[normalize-space()='Profile'])"));
		profileHyperlink.click();
		WebElement loginbtn = d.findElement(By.xpath("(//a[normalize-space()='login / Signup'])"));
		loginbtn.click();
		WebElement mobileno = d.findElement(By.xpath("(//input[@type='tel'])[1]"));
		mobileno.sendKeys("8340064809");
		WebElement continuebtn = d.findElement(By.xpath("(//div[@class='submitBottomOption'])[1]"));
		continuebtn.click();
		Thread.sleep(500);
		WebElement otp01 =d.findElement(By.xpath("(//input[@name='otp0'])[1]"));
		otp01.sendKeys("2");
		WebElement otp02 =d.findElement(By.xpath("(//input[@name='otp1'])[1]"));
		otp02.sendKeys("4");
		WebElement otp03 =d.findElement(By.xpath("(//input[@name='otp2'])[1]"));
		otp03.sendKeys("2");
		WebElement otp04 =d.findElement(By.xpath("(//input[@name='otp3'])[1]"));
		otp04.sendKeys("6");
		d.close();
		
	}

}

