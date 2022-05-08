package seleniumLessonOne;

import com.github.dockerjava.api.model.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
public class SearchAnItemInNext {
    /*
     * 1. Find a Browser
     * 2. Open Browser.
     * 3. Enter the site URL.
     * 4. Identify the search text field from UI.
     * 5. Enter text to the text field.
     * 6. Click the search button.
     * 7. Redirects to search results page.
     * 8. Ask selenium to verify its landed on right page - by checking the page title.
     * 9. Close browser
     * */






    @Test
    public void searchAnItemUsingBrandName() {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.next.co.uk/");
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://www.next.co.uk/";
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       WebElement cookieButton = driver.findElement(By.id("onetrust-accept-btn-handler"));
       cookieButton.click();
       WebElement searchTextField = driver.findElement(By.id("header-big-screen-search-box"));
       searchTextField.sendKeys("Nike");
        WebElement searchButton = driver.findElement(By.xpath("//form[@id=\"header-search-form\"]/button/span[1]/img"));
        searchButton.click();
       WebElement searchResultTitleHeader = driver.findElement(By.xpath("//*[@id=\"ResultHeader\"]/div[1]/h1"));
       String actualSearchResultText = searchResultTitleHeader.getText();
       String expectedSearchResultText = "Nike";
       Assert.assertEquals(expectedSearchResultText, actualSearchResultText);
       driver.quit();


    }




  public void searchAnItemUsingProductName(){

    }





}
