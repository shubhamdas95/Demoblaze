package stepDefinitions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Steps {
	WebDriver driver;
	
	@Given("^Open Chrome browser and start application$")
	public void Open_Chrome_browser_and_start_application() throws Throwable {
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\sd21101\\Downloads\\chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   driver.get("https://www.demoblaze.com/index.html");
	   
		//System.out.println("This step opens the Chrome browser and launch the application");
	}
	
	
	@When("^user clicks on laptops button$")
	public void user_clicks_on_laptops_button() throws Throwable {
		WebElement lnk = driver.findElement(By.xpath("//a[contains(text(),'Laptops')]"));
		lnk.click();
		
		//System.out.println("This step navigates through all available categories");
	}
	
	@And("^user clicks on Sony vaio i5$")
	public void user_clicks_on_Sony_vaio_i5() throws Throwable {
		WebElement lnk = driver.findElement(By.linkText("Sony vaio i5"));
		lnk.click();
		
	}
	
	@And("^user clicks on Add to cart button$")
	public void user_clicks_on_Add_to_cart_button() throws Throwable {
		WebElement lnk = driver.findElement(By.xpath("//a[contains(text(),'Add to cart')]"));
		lnk.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@Then("^user accepts pop up confirmation$")
	public void user_accepts_pop_up_confirmation() throws Throwable
	{
		driver.switchTo().alert().accept();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@Given("^user navigates back to home page$")
	public void user_navigates_back_to_home_page() throws Throwable {
	   WebElement lnk = driver.findElement(By.xpath("//body/nav[1]/div[1]/div[1]/ul[1]/li[1]/a[1]"));
		lnk.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	@When("^user clicks on laptop button$")
	public void user_clicks_on_laptop_button() throws Throwable {
		WebElement lnk = driver.findElement(By.xpath("//a[contains(text(),'Laptops')]"));
		lnk.click();
		
		
	}
	
	@And("^user clicks on Dell i7 8gb")
	public void user_clicks_on_Dell_i7_8gb() throws Throwable {
		WebElement lnk = driver.findElement(By.linkText("Dell i7 8gb"));
		lnk.click();
		
	}
	
	@And("^user clicks on add to cart button$")
	public void user_clicks_on_add_to_cart_button() throws Throwable {
		WebElement lnk = driver.findElement(By.xpath("//a[contains(text(),'Add to cart')]"));
		lnk.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@Then("^user accepts pop up confirmation$")
	public void user_accept_pop_up_confirmation() throws Throwable
	{
		driver.switchTo().alert().accept();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@Given("^user navigates to cart section$")
	public void user_navigates_to_cart_section() throws Throwable {
	   WebElement lnk = driver.findElement(By.xpath("//a[@id='cartur']"));
		lnk.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	@Then("^user deletes Dell i7 8gb from cart$")
	public void user_deletes_Dell_i7_8gb_from_cart() throws Throwable {
		WebElement lnk = driver.findElement(By.xpath("//tbody/tr[1]/td[4]/a[1]"));
		lnk.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	}
	
	@Given("^user clicks on place order$")
	public void user_clicks_on_place_order() throws Throwable {
	   WebElement btn = driver.findElement(By.xpath("//button[contains(text(),'Place Order')]"));
		btn.click();

	}
	
	
	@When("^user fills out the details$")
	public void user_fills_out_the_details() throws Throwable {
		WebElement name = driver.findElement(By.id("name"));
		name.sendKeys("Shubham");
		WebElement country = driver.findElement(By.id("country"));
		country.sendKeys("India");
		WebElement city = driver.findElement(By.id("city"));
		city.sendKeys("Pune");
		WebElement card = driver.findElement(By.id("card"));
		card.sendKeys("123");
		WebElement month = driver.findElement(By.id("month"));
		month.sendKeys("Oct");
		WebElement year = driver.findElement(By.id("year"));
		year.sendKeys("2021");
	}
	
	@And("^user clicks on Purchase button$")
	public void user_clicks_on_Purchase_button() throws Throwable{
		WebElement btn = driver.findElement(By.xpath("//button[contains(text(),'Purchase')]"));
		btn.click();
		
	}
	
	@Then("^user clicks on ok button$")
	public void user_clicks_on_ok_button() throws Throwable{
		
		WebElement btn = driver.findElement(By.xpath("//button[contains(text(),'OK')]"));
		btn.click();
	}
	

}
