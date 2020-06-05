package stepdefinations;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefs {

    WebDriver driver;

    @Before
    public void buyproduct() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
    }

    @Given("I navigate to {string} page")
    public void i_navigate_to_page(String string) {
        driver.get(string);
        System.out.println("Browser opened");
    }

    @When("I click to search")
    public void i_click_to_search() throws InterruptedException {
        driver.findElement(By.xpath("(//input[@type='text'])[1]")).click();
        System.out.println("clicked on search");
        Thread.sleep(2000);
    }

    @When("I search for ipad")
    public void i_search_for_ipad() {
        driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("ipad");

    }

    @When("I should see all ipad models")
    public void i_should_see_all_ipad_models() throws InterruptedException {
        driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
        Thread.sleep(3000);
        System.out.println("clicked on search button");
    }

    @When("I click on ipad")
    public void i_click_on_ipad() {
        driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[2]")).click();
    }

    @When("I click on buy now button")
    public void i_click_on_buy_now_button() throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='buy-now-button']")).click();
        System.out.println("clicked on buy now button");
        Thread.sleep(3000);
    }

    @Then("I can see signin page")
    public void I_can_see_signin_page(){
    }

    @After
    public void afterBuyProduct() {
        driver.quit();
    }
}