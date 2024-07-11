package ppack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class C3 {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();	
		
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.className("dropbtn"));
		
		Actions a = new Actions(driver);
		a.moveToElement(ele).click().build().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
