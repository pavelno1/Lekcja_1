import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;

/**
 * Created by Paweł on 2017-04-20.
 */
public class bulldogjob {
    public static void main(String[] args) {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println(driver);

        driver.get("http://hokus:pokus@www.test.bulldogjob.com/");
        driver.manage().window().maximize();
        WebElement szukaj=driver.findElement(By.cssSelector("#search>div>div:nth-child(3)>div:nth-child(1)>div:nth-child(2)>form>input:nth-child(2)"));
        szukaj.sendKeys("10Clouds");
        szukaj.sendKeys(Keys.ENTER);


       /* WebElement szukaj = driver.findElement(By.id("lst-ib"));
        szukaj.sendKeys("Co to jest krztusiec");
        szukaj.sendKeys(Keys.ENTER);
        */

    }
}
