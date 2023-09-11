package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {
		// 
		System.setProperty("webdriver.chrome.driver","src/test/ressources/chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://demoqa.com/buttons");
        Thread.sleep(5000);
		WebElement Rightbtn;
		Rightbtn =driver.findElement(By.id("rightClickBtn"));
		Actions action = new Actions(driver);
		action.contextClick(Rightbtn).perform();
		//verfication
		WebElement message;
		message = driver.findElement(By.id("rightClickMessage"));
		String texte;
		texte = message.getText();
		Assert.assertEquals(texte,"You have done a right click");
		System.out.println("Right click done");
		driver.close();
		
		
		
		

	}

}