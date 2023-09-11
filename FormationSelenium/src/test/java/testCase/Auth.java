package testCase;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import junit.framework.Assert;
 
public class Auth {
	WebDriver driver;
	@Given("acceder au navigateur")
	public void acceder_au_navigateur() {
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe"); 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	}

	@And("taper Url {string}")
	public void taper_url(String string) {
		driver.navigate().to(string);
	    
	}

	@When("saisir user {string}")
	public void saisir_user(String string) {
		WebElement Username;
		Username = driver.findElement(By.name("username"));
		Username.sendKeys(string);
	    
	}

	@And("saisir mdp {string}")
	public void saisir_mdp(String string) {
		WebElement Password;
		Password = driver.findElement(By.name("password"));
		Password.sendKeys(string);
	    
	}

	@When("cliquer sur le bouton se connecter")
	public void cliquer_sur_le_bouton_se_connecter() {
		WebElement Login = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		Login.click();
	    
	}

	@Then("verifier le nom de profil {string}")
	public void verifier_le_nom_de_profil(String string) {
		
		WebElement Profil;
		Profil = driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']"));
		String texte;
		texte = Profil.getText();
		Assert.assertEquals(texte,string);
		System.out.println("Test OK");
	    
	}


}

