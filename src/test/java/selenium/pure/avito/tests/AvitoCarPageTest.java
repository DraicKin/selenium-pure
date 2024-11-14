package selenium.pure.avito.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import selenium.pure.avito.pages.AvitoCarPage;
import selenium.pure.avito.pages.AvitoMainPage;
import selenium.pure.avito.pages.AvitoMotorcyclesSearchPage;
import selenium.pure.base.BaseTestClass;

import static org.assertj.core.api.Assertions.assertThat;

public class AvitoCarPageTest extends BaseTestClass {
    private AvitoMainPage mainPage;
    private AvitoCarPage carPage;

    @BeforeEach
    void openCarPage() {
        mainPage = new AvitoMainPage();
        carPage = mainPage.clickOnCarRedirectImg();
    }

    @Test
    public void chooseMotorcycles() {
        carPage.scrollToMotorcycles();
        AvitoMotorcyclesSearchPage motoPage = carPage.clickOnMotorcycles();
        assertThat(motoPage.getLastBreadcrumb().getText()).isEqualTo("Мотоциклы");
    }
}
