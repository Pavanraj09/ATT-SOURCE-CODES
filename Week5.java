import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Week5 {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\student\\Desktop\\Selenium Lab\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://app.dhondi.ai/");
		WebElement num=driver.findElement(By.name("mobile"));
		num.sendKeys("9490654019");
		driver.findElement(By.className("formButton")).click();
		Thread.sleep(3000);
		WebElement fst=driver.findElement(By.name("first"));
		fst.sendKeys("1");
		Thread.sleep(3000);
		WebElement sec=driver.findElement(By.name("second"));
		sec.sendKeys("1");
		Thread.sleep(3000);
		WebElement thr=driver.findElement(By.name("third"));
		thr.sendKeys("1");
		Thread.sleep(3000);
		WebElement fou=driver.findElement(By.name("fourth"));
		fou.sendKeys("1");
		//driver.findElement(By.id("recaptcha-anchor")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("buttonForLogin")).click();
	}

}
