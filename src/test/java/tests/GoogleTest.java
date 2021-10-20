package tests;

import io.qameta.allure.*;
import org.testng.annotations.Test;
import tests.base.BaseTest;

public class GoogleTest extends BaseTest {

    @Test(description = "Search in Google")
    @Description("Validation of search functionality in Google")
    @Link("https://instagram.com/dmitryrak11")
    @Issue("ISSUE-123")
    @TmsLink("TMS-12")
    public void googleTest() {
        steps.searchForKeyWord("TeachMeSkills");
    }
}
