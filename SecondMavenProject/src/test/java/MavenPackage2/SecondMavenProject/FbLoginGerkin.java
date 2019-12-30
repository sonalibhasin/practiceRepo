package MavenPackage2.SecondMavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FbLoginGerkin {
	String path1;
	WebDriver driver;
	
	@When("^open the webpage$")
	public void open_the_webpage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		path1 = System.getProperty("user.dir")+"\\\\Drivers\\\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

	@Then("^enter the user name$")
	public void enter_the_user_name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("email")).sendKeys("7889143616");
	}

	@Then("^enter the password$")
	public void enter_the_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("pass")).sendKeys("seerat@4");
	}

	@Then("^click on login button$")
	public void click_on_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("loginbutton")).click();
	}
	@Then("^logout from the fb page$")
	public void logout_from_the_fb_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.close();
	}


}
