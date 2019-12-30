package MavenPackage2.SecondMavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MultiScenarioGerkin {
	String path1;
	WebDriver driver;
	@When("^open the webpage(\\d+)$")
	public void open_the_webpage(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    path1 = System.getProperty("user.dir")+"\\\\Drivers\\\\chromedriver.exe";
	    System.setProperty("webdriver.chrome.driver", path1);
	    driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	}

	@Then("^enter the emailid$")
	public void enter_the_emailid() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.id("email")).sendKeys("7889143616");
	}

	@Then("^enter the pas$")
	public void enter_the_pas() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("pass")).sendKeys("seerat@4");
	}

	@Then("^click on loginButton$")
	public void click_on_loginButton() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("loginbutton")).click();
	}

	@When("^open the fb webpage$")
	public void open_the_fb_webpage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		path1 = System.getProperty("user.dir")+"\\\\Drivers\\\\chromedriver.exe";
	    System.setProperty("webdriver.chrome.driver", path1);
	    driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	}

	@Then("^enter the wrong username$")
	public void enter_the_wrong_username() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("email")).sendKeys("7889143243616");
	}

	@Then("^enter the pass$")
	public void enter_the_pass() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("pass")).sendKeys("seerat@4");
	}

	@Then("^click on login$")
	public void click_on_login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("loginbutton")).click();
	}

	@When("^open the fb page$")
	public void open_the_fb_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		path1 = System.getProperty("user.dir")+"\\\\Drivers\\\\chromedriver.exe";
	    System.setProperty("webdriver.chrome.driver", path1);
	    driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	}

	@Then("^enter the valid username$")
	public void enter_the_valid_username() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("email")).sendKeys("7889143616");
	}

	@Then("^enter the invalid pass$")
	public void enter_the_invalid_pass() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("pass")).sendKeys("seerat@432");
	}

	@Then("^click on button to login$")
	public void click_on_button_to_login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("loginbutton")).click();
	}
}
