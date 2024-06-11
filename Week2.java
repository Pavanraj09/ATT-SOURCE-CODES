import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Week2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\student\\Desktop\\Selenium Lab\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mercurytravels.co.in/");
		Thread.sleep(2000);
		Actions builder=new Actions(driver);
		WebElement Cl=driver.findElement(By.xpath("/html/body/nav[2]/div/div[2]/ul/li[1]/a"));
		builder.moveToElement(Cl).build().perform();
		WebElement reg=driver.findElement(By.xpath("/html/body/nav[2]/div/div[2]/ul/li[1]/ul/li[2]/a"));
		reg.click();
		Thread.sleep(2000);
		WebElement firstName=driver.findElement(By.id("acc_first_name"));
		firstName.sendKeys("Shubhang");
		WebElement lastName=driver.findElement(By.id("acc_last_name"));
		lastName.sendKeys("Guntaka");
		WebElement emailID=driver.findElement(By.id("acc_user_email"));
		emailID.sendKeys("22r01a7331@gmail.com");
		WebElement setPassword=driver.findElement(By.id("acc_user_password"));
		setPassword.sendKeys("cmrit");
		WebElement confirmPassword=driver.findElement(By.id("acc_user_passconf"));
		confirmPassword.sendKeys("cmrit");
		WebElement moblieNo=driver.findElement(By.id("acc_mobile_no"));
		moblieNo.sendKeys("9490654019");
		WebElement submit=driver.findElement(By.xpath("//*[@id=\"modalUserLogin\"]/div/div/div[2]/form/button"));
		submit.click();
		Thread.sleep(3000);
		driver.close();
	}

}