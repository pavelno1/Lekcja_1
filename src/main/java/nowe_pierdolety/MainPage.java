package nowe_pierdolety;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Paweł on 2017-08-12.
 */
public class MainPage {
    @FindBy(xpath="//h2[text()='Zadanie 1']")

    private WebElement zadanie2;

        public boolean assertzadanie2() {

            return zadanie2.isDisplayed();

        }

        public void klikaj_tam_gdzie_chcesz(){
        zadanie2.click();
    }




}
