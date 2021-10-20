package pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.*;
import org.testng.Assert;

@Log4j2
class BasePage {

    WebDriver driver;
    
    BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement findElement(By locator) {
        try {
            return driver.findElement(locator);
        } catch (NoSuchElementException ex) {
            Assert.fail("Элемент не найден по локатору " + locator);
            log.error(ex.getLocalizedMessage());
        }
        return null;
    }
}
