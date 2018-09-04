package nowe_pierdolety;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Paweł on 2017-08-12.
 */
public class Podstrona {


    @FindBy(xpath="//input[@type='number']")
    private WebElement pole_tekstowe;

    public void wpisuj(String wartosc){

        pole_tekstowe.sendKeys(wartosc);
    }



}
