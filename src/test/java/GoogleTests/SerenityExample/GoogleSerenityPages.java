package GoogleTests.SerenityExample;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

/**
 * User: tetiana.kryvets
 * Date: 12/4/2017
 */
@DefaultUrl("http://www.google.com")
public class GoogleSerenityPages extends PageObject {

    String first_link;

    @FindBy(name = "q")
    WebElementFacade searchField;

    @FindBy(xpath = "(//div/h3/a)[1]")
    WebElementFacade resultedLink;

    public void searchFor(String entityName) {
        searchField.typeAndEnter(entityName);
    }

    public String selectTheFirstLink() {
        first_link = resultedLink.getAttribute("href");
        resultedLink.click();
        return first_link;
    }



}
