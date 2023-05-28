import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;

//klasa
public class UltimateQATest extends PageSetup {


//metody, funkcje
    // zwracanie wartości funkcji - m.in. void
    @Test
    public void testOne (){
        WebElement buttonUsingId = driver.findElementById( "idExample");
        buttonUsingId.click();

        WebElement buttonSuccessText = driver.findElementByClassName("entry-title");
        assertEquals("Button success", buttonSuccessText.getText());
        

    }


}
