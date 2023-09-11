package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigateur {
	

	public static void main(String[] args) {
		// identification (chemin) chromedriver
		//y3ni execution a3mlheli 3l navigateur moch fl console
		System.setProperty("webdriver.chrome.driver","src/test/ressources/chromedriver.exe");
		//ouverture chrome
		// je dois déclarer navigateur vide
		WebDriver driver ;
		//driver copie m driver
		driver = new ChromeDriver();
		//maximize window
		driver.manage().window().maximize();
		//delete cookies
		driver.manage().deleteAllCookies();
		//ouvrir url 
		//driver.get("https://www.google.com/");
		driver.navigate().to("https://www.google.com/");
		//declaration variable 
		WebElement recherche;
		//identification des variables
		recherche = driver.findElement(By.id("input"));
		//action 
		//keys houma les lettres eli bch nda5lhom
		recherche.sendKeys("tunisie");
		//close chrome
		//driver.close();

	}

}
