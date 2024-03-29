package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AuthorizationPage extends BasePage {
    protected String PHONE_NUMBER = "958925913";
    protected String PASSWORD = "Bytccf17";

    public WebElement loginInputField() {
        return this.findByXpath("//input[contains(@class, 'epicentr-nuxt-components-ui-form-input__field__input')]");
    }

    public WebElement passwordInputField() {
        return this.findByXpath("//input[contains(@class, 'epicentr-nuxt-components-ui-form-password__field__input')]");
    }

    public WebElement authorizationButton() {
        return this.findByXpath("//button[@class='epicentr-nuxt-components-ui-button__button epicentr-nuxt-components-ui-button__button--blue epicentr-nuxt-components-forms-auth__send']");
    }

    public WebElement ElementOnAuthorizationPage() {
        return this.findByXpath("//ul[@class=\"epicentr-nuxt-components-ui-menu__menu__list\"]");
    }

    public AuthorizationPage(WebDriver driver) {
        super(driver);
    }

    public void sendKeysToLoginInputField() {
        loginInputField().sendKeys(new CharSequence[]{this.PHONE_NUMBER});
    }

    public void sendKeysToPasswordInputField() {
        passwordInputField().sendKeys(new CharSequence[]{this.PASSWORD});
    }

    public void clickAuthorizationButton() {
        authorizationButton().click();
    }
}
