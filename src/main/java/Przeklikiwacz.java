import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SourceType;

import java.net.SocketPermission;
import java.util.List;

/**
 * Created by Paweł on 2017-03-23.
 */
public class Przeklikiwacz {
    public static void main(String[] args) {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println(driver);
        driver.get("www.google.pl");
        driver.manage().window().maximize();
        WebElement szukaj = driver.findElement(By.id("lst-ib"));
        szukaj.sendKeys("Co to jest krztusiec");
        szukaj.sendKeys(Keys.ENTER);
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
        }

        WebElement tools = driver.findElement(By.xpath("//a[@id='hdtb-tls']"));
        tools.click();
        if (tools.isDisplayed()) {
            System.out.println("JEEEEEEEEEEEEST");


        }
        List<WebElement> nazwa=driver.findElements(By.xpath("//a"));
        nazwa.stream().forEach((x) -> System.out.println(x));
    }
}
