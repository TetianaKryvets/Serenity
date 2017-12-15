package GoogleTests.SerenityExample;
/**
 * User: tetiana.kryvets
 * Date: 12/4/2017
 */

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

@RunWith(SerenityRunner.class)
public class GoogleSerenityTest {

    @Managed(driver = "chrome")
    WebDriver driver;

    String className, firstLink;


    @Steps
    GoogleSerenitySteps serenity_steps;

    @Test
    @Title("Open the first founded link and check that link is correct")
    public void GoogleSerenityTest() {
        serenity_steps.open();
        getDriver().manage().window().maximize();
        serenity_steps.search_by_value("qa fest");
        firstLink = serenity_steps.find_the_first_link();
        serenity_steps.link_should_be_opened();
    }
}
