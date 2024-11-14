package selenium.pure.avito.pages;

import org.openqa.selenium.By;
import selenium.pure.page.BasePage;

public class AvitoCarPage extends BasePage {
    private final By title = By.xpath("//h1[@data-marker='page-title/text']");
    private final By motorCycles = By.xpath("//span[text()='Мотоциклы']");

    public AvitoCarPage() {
        waitForVisibilityOfElementLocated(title);
    }

    public void scrollToMotorcycles() {
        scrollToElementLocated(motorCycles);
    }

    public AvitoMotorcyclesSearchPage clickOnMotorcycles() {
        getElement(motorCycles).click();
        return new AvitoMotorcyclesSearchPage();
    }

}
