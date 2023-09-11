package testCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeysEvent {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","src/test/ressources/chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//temp de chargement 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://demoqa.com/tex-box");
		//declaration et identification des elelment 
		WebElement currentadress;
		WebElement permanentadress;
		
		currentadress = driver.findElement(By.id("currentAdress"));
		permanentadress = driver.findElement(By.id("permanentAdress"));
		
		//action 
		Actions action = new Actions(driver);
		currentadress.sendKeys("200 avenue la liberté tunis");
		//nmchi lel elemnt elu bch n3mlou controle
		//key down nenzel 3l controle 
		action.keyDown(currentadress, Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(permanentadress, Keys.CONTROL);
		action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();

	}

}
