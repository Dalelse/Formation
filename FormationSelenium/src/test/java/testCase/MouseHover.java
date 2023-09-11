package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","src/test/ressources/chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://demoqa.com/menu");
        Thread.sleep(5000);
        WebElement MainItem2;
        MainItem2 = driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/a"));
        
        Actions action = new Actions(driver);
		action.moveToElement(MainItem2).perform();	
		System.out.println("test ok");

		driver.close();
        
        

	}

}
