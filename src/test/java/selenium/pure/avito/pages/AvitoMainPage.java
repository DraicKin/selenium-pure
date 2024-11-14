package selenium.pure.avito.pages;

import org.openqa.selenium.By;
import selenium.pure.page.BasePage;

public class AvitoMainPage extends BasePage {

    private final By redirectToCarsImg = By.xpath("//img[@data-marker='visual-rubricator/image-Авто']");

    public AvitoCarPage clickOnCarRedirectImg() {
        getElement(redirectToCarsImg).click();
        return new AvitoCarPage();
    }
}
