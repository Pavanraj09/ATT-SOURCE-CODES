package week10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class week10 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		WebElement creation=driver.findElement(By.xpath("//span[normalize-space()='Create account']"));
		creation.click();
		Thread.sleep(2000);
		WebElement formyself =driver.findElement(By.xpath("//span[normalize-space()='For my personal use']"));
		formyself.click();
		Thread.sleep(2000);
		WebElement firstName =driver.findElement(By.name("firstName"));
		firstName.sendKeys("dhanush");
		WebElement lastName =driver.findElement(By.name("lastName"));
		lastName.sendKeys("reddy");
		Thread.sleep(2000);
		WebElement bn1 =driver.findElement(By.xpath("(//span[normalize-space()='Next'])"));
		bn1.click();
		Thread.sleep(2000);
		Select month=new Select(driver.findElement(By.xpath("(//select[@id='month'])[1]")));
		month.selectByValue("2");
		Thread.sleep(2000);
		WebElement day=driver.findElement(By.xpath("(//input[@id='day'])[1]"));
		day.sendKeys("3");
		Thread.sleep(2000);
		WebElement year =driver.findElement(By.xpath("(//input[@id='year'])[1]"));
		year.sendKeys("2004");
		Thread.sleep(2000);
		Select gender=new
		Select(driver.findElement(By.xpath("(//select[@id='gender'])[1]")));
		gender.selectByValue("1");
		Thread.sleep(2000);
		WebElement bn2=driver.findElement(By.xpath("(//span[normalize-space()='Next'])"));
		bn2.click();
		Thread.sleep(2000);
		WebElement uid =driver.findElement(By.name("Username"));
		uid.sendKeys("dhanush123");
		WebElement bn3 =driver.findElement(By.xpath("(//span[normalize-space()='Next'])"));
		bn3.click();
		Thread.sleep(2000);
		WebElement pswd=driver.findElement(By.name("Passwd"));
		pswd.sendKeys("1234@");
		WebElement pswd1=driver.findElement(By.name("PasswdAgain"));
		pswd1.sendKeys("1234@");
		WebElement bn4 =driver.findElement(By.xpath("(//span[normalize-space()='Next'])"));
		bn4.click();
		Thread.sleep(2000);

		
	}
}
