package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LocationPage extends BasePage {
    public WebElement locationButton() {
        return this.findByXpath("//*[@id='global-site-header']/header/div/div[4]/div[2]");
    }

    public WebElement searchFealdLocation() {
        return this.findByXpath("//input[contains(@class, '_MGeWxP')]");
    }

    public WebElement brovaryLocation() {
        return this.findByXpath("//b[contains(text(), 'Бровари')]/parent::div");
    }

    public WebElement shopInBrovary() {
        return this.findByXpath("(//button[contains(@class, 'btn--flex') and contains(text(), 'Обрати')])[1]");
    }

    public WebElement ElementOnLocationPage() {
        return this.findByXpath("//div[@class='checkout-headline _QZEg4v _rnXwEA']");
    }

    public LocationPage(WebDriver driver) {
        super(driver);
    }

    public void clickLocationButton() {
        locationButton().click();
    }

    public void sendKeysToSearchFealdLocation(String text) {
        this.searchFealdLocation().sendKeys(new CharSequence[]{text});
    }

    public void clickBrovaryLocation() {
        brovaryLocation().click();
    }

    public void clickShopInBrovary() {
        shopInBrovary().click();
    }
}
