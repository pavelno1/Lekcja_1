package bulldogjob;


import jxl.read.biff.BiffException;
import org.apache.xerces.impl.xpath.XPath;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.internal.FindsByXPath;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.io.IOException;
import java.sql.Array;
import java.lang.Integer;
import java.lang.Double;


/**
 * Created by Paweł on 2017-08-13.
 */
public class TestRunner {
    private static final String SYSTEM_PROPERTY_KEY = "webdriver.chrome.driver";
    private static final String SYSTEM_PROPERTY_VALUE = "chromedriver.exe";

    private WebDriver driver;

    private MainPage mainPage;


    @Before
    public void setUp() {
        System.setProperty(SYSTEM_PROPERTY_KEY, SYSTEM_PROPERTY_VALUE);
        driver = new ChromeDriver();
        mainPage = PageFactory.initElements(driver, MainPage.class);
    }


    @Test
    public void test() throws IOException, BiffException{
        mainPage.test_integera(0, "TEST" );
    }

    @Test
    public void showZadanie1() throws IOException, BiffException {
        //  driver.get("http://hokus:pokus@test.bulldogjob.com/");



        driver.get("https://cmonitor.pl/sprawdz-pozycje");
        mainPage.wpisz_domene();
        mainPage.czytaj_pozycje();
        //    mainPage.ExcelSheetDriver();


        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //   String wartosc="10";
        //  mainPage.wyszukiwaczElementuListy(driver, "QA Engineer - czyli tester do zadań specjalnych");


        //ProfilesIni profile = new ProfilesIni();
        //FirefoxProfile myprofile = profile.getProfile("WebDriver");


        //    WebDriver driver = new FirefoxDriver();//myprofile);
        //  driver.get("http://www.google.pl");
        // driver.findElement(By.id("gb_70")).click();
        // driver.findElement(By.id("Email")).sendKeys(fraza);

        //driver.findElement(By.id("next")).sendKeys(Keys.ENTER);

        /*driver.findElement(By.t("Passwd")).sendKeys(fraza2);
        driver.findElement(By.id("SignIn")).sendKeys(Keys.ENTER);*/

        /*driver.findElement(By.id("lst-ib")).sendKeys(fraza);
        driver.findElement(By.id("lst-ib")).sendKeys(Keys.ENTER);*/



    }
}

//    @After
//    public void close (){
//
//        driver.close();
//    }

