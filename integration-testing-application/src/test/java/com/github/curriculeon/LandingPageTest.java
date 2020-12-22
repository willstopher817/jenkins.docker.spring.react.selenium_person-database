package com.github.curriculeon;

import com.git_leon.leonium.DirectoryReference;
import com.git_leon.leonium.browsertools.browserhandler.BrowserHandlerInterface;
import com.git_leon.leonium.browsertools.browserhandler.reporting.BrowserHandlerLayeredLogger;
import com.git_leon.leonium.browsertools.factories.BrowserHandlerFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

/**
 * Created by leon on 12/22/2020.
 */
public class LandingPageTest {
    private WebDriver driver;
    private static final String reportName = "Site Traversal Reports";

    @Before
    public void setup() {
        this.driver = BrowserHandlerFactory.CHROME.getDriver();
    }

    private void test(String firstName, String lastName) {
        // given
        BrowserHandlerInterface browserHandler = new BrowserHandlerLayeredLogger(driver, DirectoryReference
                .TARGET_DIRECTORY
                .getFileFromDirectory("Report-" + System.nanoTime() + ".html")
                .getAbsolutePath(),
                "test-" + Long.toHexString(System.nanoTime()));
        browserHandler.getOptions().SCREENSHOT_ON_EVENT.setValue(false);

        String expectedListOutput = firstName.concat(" ").concat(lastName);
        LandingPage landingPage = new LandingPage(browserHandler);

        // when
        landingPage.navigateTo();
        landingPage.sendInputToFirstName(firstName);
        landingPage.sendInputToFirstName(lastName);
        landingPage.clickSubmitButton();

        // then
        Assert.assertTrue(landingPage.validateNameHasBeenInput(expectedListOutput));
    }

    @Test
    public void test1() {
        test("Leon", "Hunter");
    }
}
