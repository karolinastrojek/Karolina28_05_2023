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

    @Test
    public void testTwo() throws InterruptedException {
     WebElement nameTextField = driver.findElementByName("et_pb_contact_name_0");
     nameTextField.sendKeys("Tester");

     WebElement emailTextField = driver.findElementByName("et_pb_contact_email_0");
    emailTextField.sendKeys("tester@tester.com");

    Thread.sleep(2000);

    WebElement emailMeButton = driver.findElementByName("et_builder_submit_button");
    emailMeButton.click();

    Thread.sleep(2000);

    WebElement thanksText = driver.findElementByClassName("et-pb-contact-message");
    assertEquals("Thanks for contacting us", thanksText.getText());
    }

}
