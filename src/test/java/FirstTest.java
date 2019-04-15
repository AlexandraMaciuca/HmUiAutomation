import com.sun.org.glassfish.gmbal.Description;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;
import static utils.Constants.*;

public class FirstTest {
    private WebDriver driver;

    @Before
    @Description("Setup Chrome driver")
    public void setup(){
        // setup chrome driver
        System.setProperty(CHROME_DRIVER, PATH_TO_CHROME_DRIVER);
        driver = new ChromeDriver();

        // go to h&m page
        driver.navigate().to(BASE_URI);
    }

    @Test
    public void testOne(){
        // test code will be added here
    }

    @After
    public void teardown() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }
}
