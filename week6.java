package week6;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.zeromq.ZStar.Set;

public class week6 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		Thread.sleep(2000);
		WebElement creation=driver.findElement(By.xpath("//spam[Normalize-sapce()='Sign In / Join Ajio\']"));
		creation.click();
		Thread.sleep(2000);
		WebElement facebookBtn=driver.findElement(By.xpath("//sapm[Noemalize-space()='Facebook']"));
		facebookBtn.click();
		Thread.sleep(2000);
		String parentWindow=driver.getWindowHandle();
		Iterable<E> iterable=parentWindow.iterator();
		while (iterable.hasNext());
		{
			String childwindow=(string)iterable.next();
			if (!parentWindow.equals(childwindow));
			{
				driver.switchTo().window(childwindow);
			}
			WebElement email or mobile no=driver.findElement(By.xpath("//input @id='Email:']"));
			emailormobile No.sendKeys("dhanush@gmail.com");
			pwd.sendKeys("@123");
			
			
		}
		
	}

}
