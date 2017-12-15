package GoogleTests.SerenityExample;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

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

    @FindBys(@FindBy(xpath="//div/h3/a"))
    List<WebElementFacade> lintOfLinks;

    public void searchFor(String entityName) {
        searchField.typeAndEnter(entityName);
    }

    public String selectTheFirstLink() {
        first_link = resultedLink.getAttribute("href");
        resultedLink.click();
        return first_link;
    }

    public String selectTheFirstLinkUsingArrayOfLinks(String entityName) {
        String elementText, foundedItem = "";
        Iterator it = new Iterator() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Object next() {
                return null;
            }
        };

        elementText = lintOfLinks.stream().map(WebElementFacade::getText).toString();
        while (it.hasNext()) {
            if (elementText.equals(entityName)) {
                foundedItem = elementText;
            }

        }

        //WebElementFacade firstLink = lintOfLinks.get(0);
        return foundedItem;
    }



}
