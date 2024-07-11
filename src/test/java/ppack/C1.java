package ppack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class C1 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		/*driver.get("https://www.google.com/search?q=download+chrome+117&rlz=1C1GCEB_enIN976IN976&oq=&gs_lcrp=EgZjaHJvbWUqCQgCEEUYOxjCAzIJCAAQRRg7GMIDMgkIARBFGDsYwgMyCQgCEEUYOxjCAzIJCAMQRRg7GMIDMgkIBBBFGDsYwgMyCQgFEEUYOxjCAzIJCAYQRRg7GMIDMgkIBxBFGDsYwgPSAQozMzU0MzBqMGo3qAIIsAIB&sourceid=chrome&ie=UTF-8");
        driver.manage().window().maximize();
       
        driver.findElement(By.xpath("//h3[contains(text(),'Chrome 117 download')]")).click();		
		String s = driver.findElement(By.id("category")).getText();
		
	   System.out.println(s);*/
	 /* driver.get("https://demo.automationtesting.in/Alerts.html");
	   driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
	   Alert alr = driver.switchTo().alert();
	   String textonalert = alr.getText();
	   alr.accept();
	   driver.switchTo().defaultContent();
	   */
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		driver.manage().window().maximize();
	   
	  /*WebElement multi = driver.findElement(By.xpath("//span[text()='Profession']"));
	  Select selet = new Select(multi);
	  selet.selectByIndex(0);*/
		
		/*WebElement dropdown = driver.findElement(By.id("continents"));
		Select se = new Select(dropdown);
		se.selectByVisibleText("Europe");
		se.selectByIndex(4);*/
		
		WebElement mu = driver.findElement(By.xpath("//span[text()='Profession']"));
		Select see =new Select(mu);
		see.selectByVisibleText("Manual Tester");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
