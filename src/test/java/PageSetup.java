import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageSetup {
    //slowko kluczowe w Java: final
    //typy proste (mala litera) vs typy obiektowe (wielka litera)

    // pola,zmienne
    String projectLocation = System.getProperty("user.dir");
    ChromeDriver driver;

   @BeforeEach
    public void setup() {
        System.setProperty("webdriver.chrome.driver", projectLocation + "/dodatkowe zasoby projektu/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://ultimateqa.com/simple-html-elements-for-automation/");
    }

        // istnieje różnica pomiędzy driver.close a driver.quit
        @AfterEach
        public void teardown(){
           // driver.close();
        }
}
