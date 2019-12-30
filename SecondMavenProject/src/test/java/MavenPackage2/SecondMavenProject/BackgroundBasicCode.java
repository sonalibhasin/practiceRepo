package MavenPackage2.SecondMavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BackgroundBasicCode {

	WebDriver driver;
	String path1;
	@When("^open fb in browserr$")
	public void open_fb_in_browserr() {
		path1 = System.getProperty("user.dir")+"\\\\Drivers\\\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

	@Then("^enter username and pass$")
	public void enter_username_and_pass() {
		driver.findElement(By.id("email")).sendKeys("78891436166");
		driver.findElement(By.id("pass")).sendKeys("seerat@4");
	}

	@Then("^click btn$")
	public void click_btn()  {
		driver.findElement(By.id("loginbutton")).click();
		driver.navigate().back();
	}

	@Then("^enter username$")
	public void enter_username()  {
		driver.findElement(By.id("email")).sendKeys("67789143616");
	}

	@Then("^enter pwd$")
	public void enter_pwd() {
		driver.findElement(By.id("pass")).sendKeys("seerat@4");
	}

	@Then("^enter username \"([^\"]*)\" only$")
	public void enter_username_only(String arg1)  {
		driver.findElement(By.id("email")).sendKeys("7889143616");
	}


}
