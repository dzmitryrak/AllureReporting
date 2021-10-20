package steps;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import pages.GooglePage;

@Log4j2
public class GoogleSteps {
    private GooglePage page;

    public GoogleSteps(WebDriver driver) {
        page = new GooglePage(driver);
    }
    
    @Step("Searching for '{keyword}' in Google")
    public GoogleSteps searchForKeyWord(String keyword) {
        log.info(String.format("Searching for '%s' in Google", keyword));
        page
                .openPage()
                .inputKeyWord(keyword)
                .search();
        return this;
    }
}
