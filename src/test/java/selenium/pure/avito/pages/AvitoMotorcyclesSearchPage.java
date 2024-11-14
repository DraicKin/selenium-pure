package selenium.pure.avito.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import selenium.pure.page.BasePage;

import java.util.List;

public class AvitoMotorcyclesSearchPage  extends BasePage {
    private final By title = By.xpath("//h1[@data-marker='page-title/text']");
    private final By breadcrumbs = By.xpath("*//div[@data-marker='breadcrumbs']/span");
    public AvitoMotorcyclesSearchPage() {
        waitForVisibilityOfElementLocated(title);
    }

    public List<WebElement> collectBreadcrumbElements() {
        return driver().findElements(breadcrumbs);
    }

    public WebElement getLastBreadcrumb() {
        List<WebElement> breadcrumbElements = collectBreadcrumbElements();
        return breadcrumbElements.get(breadcrumbElements.size()-1);
    }
}
