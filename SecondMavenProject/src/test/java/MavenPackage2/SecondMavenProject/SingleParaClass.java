package MavenPackage2.SecondMavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SingleParaClass {
	String path1;
	WebDriver driver;
	@When("^open the fb page in chrome browser$")
	public void open_the_fb_page_in_chrome_browser() {
		path1 = System.getProperty("user.dir")+"\\\\Drivers\\\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

	@Then("^enter the username as \"([^\"]*)\"$")
	public void enter_the_username_as(String arg1) {
		driver.findElement(By.id("email")).sendKeys(arg1);
	}

	@Then("^enter the pass as \"([^\"]*)\"$")
	public void enter_the_pass_as(String arg1) {
		driver.findElement(By.id("pass")).sendKeys(arg1);
	}

	@Then("^click on fb login button$")
	public void click_on_fb_login_button() {
		driver.findElement(By.id("loginbutton")).click();
	}
}
