package selenium_scripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import java.util.Set;
public class LaunchingChromeBrowser{
	WebDriver driver ;
	public void setup() {
	    // Open Google
		driver= new ChromeDriver();
	    driver.get("https://www.google.com");
	    System.out.println("Page Title: " + driver.getTitle());
		
	}
	public void performsearch(String query) throws InterruptedException {
		 WebElement searchbox = driver.findElement(By.name("q"));
		    searchbox.sendKeys(query);
		    searchbox.submit();
		    System.out.println("Page Title After Search: " + driver.getTitle());
		     Thread.sleep(50000);
		    
		    
	}
	
    
   public void Printresults() {
	   List<WebElement> searchResults = driver.findElements(By.cssSelector("h3"));
	    
	    // Print each search result
	    System.out.println("Search Results:");
	    for (WebElement result : searchResults) {
	        System.out.println(result.getText());
		
   }
    // Find all search results
   }
   
   public void ClickFirstLink() {
	   List<WebElement> searchResults = driver.findElements(By.cssSelector("h3"));
       
       
           WebElement firstLink = searchResults.get(0);
           System.out.println("Clicking on: " + firstLink.getText());
           firstLink.click();
           
           Set<String> windowhandles=driver.getWindowHandles();
           for(String handle:windowhandles) {
        	   driver.switchTo().window(handle);
           }
           //color change
           JavascriptExecutor js=(JavascriptExecutor) driver;
           js.executeScript("document.body.style.backgroundColor='lightblue';");
           System.out.println("bg color changed!!");
       
   }
//	
//	
	
	public static void main(String args[]) throws InterruptedException {
		 LaunchingChromeBrowser test= new LaunchingChromeBrowser();
		 test.setup();
		 test.performsearch("swiggy");
		 test.Printresults();
		 test.ClickFirstLink();
		
		
	        }
	
}