package GoogleTests.SerenityExample;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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





//    public String clickOnTheFirstPicture() {
//        WebElement firstPictureButton = BaseTests.driver.findElement(By.xpath("(//div[@class='rg_bx rg_di rg_el " +
//                "ivg-i']/a[@class='rg_l'])[1]"));
//        firstPictureButton.click();
//        return firstPictureButton.getAttribute("href");
//    }
//
//    public String openInNewWindow() throws InterruptedException {
//        WebElement firstPictureButton = BaseTests.driver.findElement(By.xpath("(//div[@class='rg_bx rg_di rg_el " +
//                "ivg-i']/a[@class='rg_l'])[1]"));
//
//        Actions newAction = new Actions(BaseTests.driver);
//        newAction.keyDown(Keys.SHIFT).click(firstPictureButton).keyUp(Keys.SHIFT).build().perform();
//
//        String classValue = firstPictureButton.getAttribute("href");
//        return classValue;
//    }
//
//    public void switchToNewWindow() {
//        // Store the current window handle
//        String winHandleBefore = BaseTests.driver.getWindowHandle();
//        // Perform the click operation that opens new window
//
//        // Switch to new window opened
//        for(String winHandle : BaseTests.driver.getWindowHandles()){
//            BaseTests.driver.switchTo().window(winHandle);
//        }

        // Perform the actions on new window

    
}
