package bulldogjob;

import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.lang.Integer;
import java.lang.Double;
import jxl.Sheet;
import jxl.read.biff.BiffException;
import java.io.File;
import java.io.IOException;
import java.util.Hashtable;


import java.io.FileOutputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import java.io.File;
import java.io.IOException;
import java.util.Hashtable;

/**
 * Created by Paweł on 2017-08-13.
 */
//public class czekaj {
// private WebDriver driver;
// private final Wait<WebDriver> wait;

//    public czekaj(WebDriver driver) {
//      this.driver = driver;
//    wait = new WebDriverWait(driver, 5);
//}


public class MainPage {

    private WebDriver driver;
    private final Wait<WebDriver> wait;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }


    @FindBy(xpath = "//input[@name=\"phrases\"]")

    private WebElement searcher;

    private Actions actions;

    @FindBy(xpath = "//input[@name='domain']")
    private WebElement domain;

    @FindBy(xpath = "//a[text()[contains(.,'SPRAWDŹ POZYCJE')]]")
    private WebElement sprawdz_pozycje;

    @FindBy(id = "result_0")
    private WebElement rezultat;

    @FindBy(xpath = "//td[@class='phrase']")
    private WebElement fraza;

//
//    @FindBys({
//            @FindBy(css = ".article-content")
//    })
//    private List<WebElement> listaElementow;

    public void wpisz_domene() {
        domain.clear();

    }

    public void test_integera(Integer td_index, String testowy)
    {

        if(td_index==1) {
            System.out.println(testowy);
        }
        else{}

    }




    public void czytaj_pozycje() {

        String[] Tablica;
        Tablica = new String[44];
        String[] Fraza;
        Fraza = new String[44];
        Fraza[0] = "rejsy żeglarskie sailing week";
        Fraza[1] = "rejsy żeglarskie";
        Fraza[2] = "sailing week";
        Fraza[3] = "rejsy żeglarskie sailing";
        Fraza[4] = "sailing week 14";
        Fraza[5]="rejsy sailing week";
        Fraza[6]="żagle sailing week";
        Fraza[7]="żagle sailing";
        Fraza[8]="sailing week żagle";
        Fraza[9]="sailing week rejsy";
        Fraza[10]="sailing week rejsy morskie";
        Fraza[11]="sailing week rejsy żeglarskie";
        Fraza[12]="żeglarstwo sailing";
        Fraza[13]="żeglarstwo sailing week";
        Fraza[14]="żeglowanie sailing";
        Fraza[15]="sailing chorwacja";
        Fraza[16]="chorwacja katamaranem";
        Fraza[17]="chorwacja sailing week";
        Fraza[18]="wyjazd żeglarski";
        Fraza[19]="wyjazd na żagle";
        Fraza[20]="żagle w chorwacji";
        Fraza[21]="sailing.week.14";
        Fraza[22]="sailing week chorwacja";
        Fraza[23]="sailing chorwacja";
        Fraza[24]="rejsy żeglarskie chorwacja";
        Fraza[25]="rejsy żeglarskie sailing week chorwacja";
        Fraza[26]="rejsy żeglarskie sailing week grecja";
        Fraza[27]="sailing week pl";
        Fraza[28]="sailing week katamaran";
        Fraza[29]="sailing week katamarany";
        Fraza[30]="sailing week katamaranem";
        Fraza[31]="sailing katamaranem";
        Fraza[32]="rejs żeglarski katamaranem";
        Fraza[33]="rejs żeglarski sailing week";
        Fraza[34]="chorwacja sailing week";
        Fraza[35]="rejs jachtem sailing week";
        Fraza[36]="sailingweek";
        Fraza[37]="katamaran chorwacja";
        Fraza[38]="katamaran w chorwacji";
        Fraza[39]="organizacja rejsu";
        Fraza[40]="rejs katamaranem";
        Fraza[41]="rejs w chorwacji";
        Fraza[42]="rejsy morskie";
        Fraza[43]="rejs morski";


        for (int i = 0; i < Fraza.length; i++) {

            domain.sendKeys("www.sailingweek.pl");
            searcher.sendKeys(Fraza[i]);
            sprawdz_pozycje.click();

            //fluentWait(By.xpath("//td[@class='phrase']"));
            //fluentWait(By.xpath("//h2"));

            wait.until(ExpectedConditions.presenceOfElementLocated(By.id(("result_0"))));
//            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h2")));
            searcher.clear();
            Tablica[i] = fluentWait(By.id("result_0")).getText();
            driver.get("https://cmonitor.pl/sprawdz-pozycje");
            domain.clear();
  //          driver.manage().deleteAllCookies();
        }

        System.out.println(Fraza[0]);
        System.out.println(Tablica[0]);
        System.out.println(Fraza[1]);
        System.out.println(Tablica[1]);
        System.out.println(Fraza[2]);
        System.out.println(Tablica[2]);
        System.out.println(Fraza[3]);
        System.out.println(Tablica[3]);
        System.out.println(Fraza[4]);
        System.out.println(Tablica[4]);


        System.out.println("od teraz:");

        for (int j=0;j<Tablica.length;j++){
            System.out.println(Tablica[j]);
        }




    }

//    public void wyszukiwaczElementuListy(WebDriver driver, String Warunek) {
//        actions = new Actions(driver);
//        for (WebElement element : listaElementow) {
//            if (element.getText().contains(Warunek)) {
//                WebElement text = element.findElement(By.xpath("//a[text()='" + Warunek + "']"));
//                actions.moveToElement(text).perform();
//                text.click();
//                break;
//            }
//        }

//    }


    private WebElement fluentWait(final By locator) {
        FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(10, TimeUnit.SECONDS)
                .pollingEvery(3, TimeUnit.SECONDS)
                .ignoring(StaleElementReferenceException.class);
        WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                returnVisibleElement();
                return driver.findElement(locator);
            }

            private WebElement returnVisibleElement (){
                czekajNaZmianeTekstu();
                return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            }

            private void czekajNaZmianeTekstu(){
                for(int i =0; i<10; i++){
                    if (czekajNaTekst(driver.findElement(locator))) {
                        break;
                    }else{
                        try{
                            TimeUnit.SECONDS.sleep(2);
                        }catch(Exception e){
                        }

                    }
                }
            }

            private boolean czekajNaTekst(WebElement element) {
                return Pattern.matches("\\d+|<\\d+", element.getText());
            }
        });
        return foo;
    }



    }

