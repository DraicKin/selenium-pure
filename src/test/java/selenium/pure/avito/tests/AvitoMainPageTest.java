package selenium.pure.avito.tests;

import io.qameta.allure.Allure;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import selenium.pure.avito.pages.AvitoMainPage;
import selenium.pure.base.BaseTestClass;

import static org.assertj.core.api.Assertions.assertThat;

public class AvitoMainPageTest extends BaseTestClass {
    private AvitoMainPage mainPage;

    @BeforeEach
    void openMainPage() {
        mainPage = new AvitoMainPage();
    }

    @Test
    public void clickingOnCarsImgRedirectsToCarItemsPage(){
        mainPage.clickOnCarRedirectImg();
        String currentUrl = mainPage.getCurrentUrl();
        Allure.step(String.format("Current url is %s", currentUrl));
        assertThat(currentUrl).contains("transport");
    }

}
