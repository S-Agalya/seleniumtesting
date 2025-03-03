package selenium_scripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class LaunchingChromeBrowser{
	public static void main(String args[]) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();

	        // Open Google
	        driver.get("https://www.google.com");
	        System.out.println("Page Title: " + driver.getTitle());
	        
	        WebElement searchbox = driver.findElement(By.name("q"));
	        searchbox.sendKeys("swiggy");
	        searchbox.submit();
	        System.out.println("Page Title After Search: " + driver.getTitle());
	         Thread.sleep(9000);
	        
	        
	        // Find all search results
	        List<WebElement> searchResults = driver.findElements(By.cssSelector("h3"));
	        
	        // Print each search result
	        System.out.println("Search Results:");
	        for (WebElement result : searchResults) {
	            System.out.println(result.getText());
	        }
	}
}