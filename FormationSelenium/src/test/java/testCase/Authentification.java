package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Authentification {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","src/test/ressources/chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
		Thread.sleep(5000);
		WebElement username;
		username = driver.findElement(By.name("username"));
		WebElement password;
		password = driver.findElement(By.name("password"));
		WebElement Login;
		Login = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")); 
		username.sendKeys("Admin");
		password.sendKeys("admin123");
		Login.click();
		Thread.sleep(5000);
		WebElement profil;
		profil = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span"));
		//contenu element texte de type string
		String texte;
		texte = profil.getText();
		Assert.assertEquals(texte,"Rutuja Gawde");
		System.out.print("test ok");
		
		

	}

}
