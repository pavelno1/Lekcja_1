package nowe_pierdolety;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Paweł on 2017-08-12.
 */
public class main {
    private static final String SYSTEM_PROPERTY_KEY = "webdriver.chrome.driver";
    private static final String SYSTEM_PROPERTY_VALUE = "chromedriver.exe";

    private WebDriver drajwer;
    private MainPage mainPage;
    private Podstrona strona_druga;

    @Before
    public void setUp(){
        System.setProperty(SYSTEM_PROPERTY_KEY, SYSTEM_PROPERTY_VALUE);
        drajwer=new ChromeDriver();
        mainPage= PageFactory.initElements(drajwer, MainPage.class);
        strona_druga= PageFactory.initElements(drajwer, Podstrona.class);
    }

    @Test
    public void showZadanie1(){
        drajwer.get("https://testingcup.pgs-soft.com/");
        Assert.assertEquals(mainPage.assertzadanie2(), true);
        mainPage.klikaj_tam_gdzie_chcesz();
//        drajwer.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String wartosc="10";
        strona_druga.wpisuj(wartosc);

    }
    @After
    public void close (){

        drajwer.close();
    }
}