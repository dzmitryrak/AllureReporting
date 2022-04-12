package tests.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import steps.GoogleSteps;

@Listeners(TestListener.class)
public class BaseTest {
    
    public WebDriver driver;
    protected GoogleSteps steps;
    
    @BeforeMethod(description = "Opening Browser")
    public void createDriver(ITestContext context) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
/*        options.addArguments("--remote-debugging-port=9222");
        options.addArguments("no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("start-maximized"); // open Browser in maximized mode
        options.addArguments("disable-infobars"); // disabling infobars
        options.addArguments("--disable-extensions"); // disabling extensions
        options.addArguments("--disable-gpu"); // applicable to windows os only*/
        driver = new ChromeDriver(options);
        steps = new GoogleSteps(driver);
        context.setAttribute("driver", driver);
    }
    
    @AfterMethod (alwaysRun = true, description = "Closing Browser")
    public void closeDriver() {
        if(driver != null) {
            driver.quit();
        }
    }
}
