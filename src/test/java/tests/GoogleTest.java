package tests;

import io.qameta.allure.*;
import org.testng.annotations.Test;
import tests.base.BaseTest;

public class GoogleTest extends BaseTest {

    @Test(description = "Search in Google")
    @Description("Validation of search functionality in Google")
    @Link("https://instagram.com/dmitryrak11")
    @Issue("TMS-123")
    @TmsLink("22")
    public void googleTest() {
        steps.searchForKeyWord(System.getenv("keyword"));
    }
}
