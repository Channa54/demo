package ppack;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class C2 {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("newTabBtn")).click();
		Set<String> windowids = driver.getWindowHandles();
		
  Iterator<String> itr = windowids.iterator();
		
	     String parent = itr.next();
	     
	     String child = itr.next();
	     driver.switchTo().window(child);
	    String st = driver.findElement(By.xpath("//h1[@itemprop='name']")).getText();
	    System.out.println(st);
		
		
		
		
	}

}
