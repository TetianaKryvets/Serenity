package GoogleTests.SerenityExample;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.junit.Assert.assertEquals;

/**
 * User: tetiana.kryvets
 * Date: 12/4/2017
 */
public class GoogleSerenitySteps extends ScenarioSteps{
    private String link;
    public GoogleSerenityPages serenity_pages;

    @Step()
    public void open() {
        serenity_pages.open();
    }

    @Step("Search by enterred value")
    public void search_by_value(String search_value) {
        serenity_pages.searchFor(search_value);
    }

    @Step("Find the first link in search result and return link")
    public String find_the_first_link() {
        return serenity_pages.selectTheFirstLink();
    }

    @Step("FInd the first link using FIndBys")
    public String find_the_first_link_using_arraylist(String title) {
        return serenity_pages.selectTheFirstLinkUsingArrayOfLinks(title);
    }

    @Step("Verify that opened link is the first link in Search result")
    public void link_should_be_opened() {
        assertEquals("Opened link is incorrect", find_the_first_link(), getDriver().getCurrentUrl());
    }
}
