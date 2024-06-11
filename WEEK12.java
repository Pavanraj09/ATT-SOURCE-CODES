package expiri11;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WEEK12 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		Thread.sleep(2000);
		WebElement searchBar=driver.findElement(By.name("q"));
		searchBar.sendKeys("convert word to pdf online");
		searchBar.sendKeys(Keys.ENTER);
		WebElement pdfToWord=driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[2]"));
		pdfToWord.click();
		Thread.sleep(500);
		WebElement chooseFileBtn=driver.findElement(By.xpath("(//span[normalize-space()='Choose Files'])[1]"));
		chooseFileBtn.click();
		Thread.sleep(500);
		Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
		StringSelection str=new StringSelection("Downloads\\STUDY HIVE (1).docx");
		clipboard.setContents(str,null);
		Thread.sleep(500);
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(10000);
		WebElement download=driver.findElement(By.xpath("(//span[normalize-space()='Download'])"));
		download.click();
	}
}
