package MavenPackage2.SecondMavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Then;

public class UseScenarioOutline {
	WebDriver driver;
	String path1;
	@Then("^open the fb login page$")
	public void open_the_fb_login_page()  {
		path1 = System.getProperty("user.dir")+"\\\\Drivers\\\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

	@Then("^enter the \"([^\"]*)\" in user name$")
	public void enter_the_in_user_name(String arg1) {
		driver.findElement(By.id("email")).sendKeys(arg1);
		
	}

	@Then("^enter the \"([^\"]*)\" in password$")
	public void enter_the_in_password(String arg1) {
		driver.findElement(By.id("pass")).sendKeys(arg1);
	}


}
