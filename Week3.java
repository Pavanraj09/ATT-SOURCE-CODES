import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Week3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Create new account")).click();
		Thread.sleep(2000);
		WebElement fn=driver.findElement(By.name("firstname"));
		fn.sendKeys("Shubhang");
		Thread.sleep(2000);
		WebElement surName=driver.findElement(By.name("lastname"));
		surName.sendKeys("Guntaka");
		Thread.sleep(2000);
		WebElement moblieNoOrEmailId=driver.findElement(By.name("reg_email__"));
		moblieNoOrEmailId.sendKeys("123456789");
		Thread.sleep(2000);
		WebElement password=driver.findElement(By.name("reg_passwd__"));
		password.sendKeys("123456789");
		Thread.sleep(2000);
		Select dateDropdown=new Select(driver.findElement(By.name("birthday_day")));
		dateDropdown.selectByValue("1");
		Thread.sleep(2000);
		Select monthDropdown=new Select(driver.findElement(By.name("birthday_month")));
		monthDropdown.selectByIndex(8);
		Thread.sleep(2000);
		Select yearDropdown=new Select(driver.findElement(By.name("birthday_year")));
		yearDropdown.selectByValue("2005");
		Thread.sleep(2000);
		WebElement mrb=driver.findElement(By.xpath("(//label[normalize-space()='Male'])[1]"));
		mrb.click();
		Thread.sleep(2000);
		WebElement signUpBtn=driver.findElement(By.name("websubmit"));
		signUpBtn.click();
	}

}
