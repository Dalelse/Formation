package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		// 
		System.setProperty("webdriver.chrome.driver","src/test/ressources/chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://demoqa.com/buttons");
        Thread.sleep(5000);
		WebElement Doublebtn;
		Doublebtn=driver.findElement(By.id("doubleClickBtn"));
		Actions action = new Actions(driver);
		action.doubleClick(Doublebtn).perform();
		//verfication
		WebElement message;
		message = driver.findElement(By.id("doubleClickMessage"));
		String texte;
		texte = message.getText();
		Assert.assertEquals(texte,"You have done a double click");
		System.out.println("Doucle click done");
		driver.close();
		
		
		
		

	}

}
