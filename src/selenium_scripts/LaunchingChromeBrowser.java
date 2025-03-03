package selenium_scripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class LaunchingChromeBrowser{
	public static void main(String args[]) {
		 WebDriver driver = new ChromeDriver();

	        // Open Google
	        driver.get("https://www.google.com");
	        System.out.println("Page Title: " + driver.getTitle());
	        
	        WebElement searchbox = driver.findElement(By.name("q"));
	        searchbox.sendKeys("swiggy");
	        searchbox.submit();
	        System.out.println("Page Title After Search: " + driver.getTitle());
	        
	        
	}
}