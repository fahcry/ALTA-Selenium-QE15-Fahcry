package org.example.pageObject;

import org.example.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage {
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "first-name")
    private WebElement firstnameCheckout;

    @FindBy(id = "last-name")
    private WebElement lastnameCheckout;

    @FindBy(id = "postal-code")
    private WebElement postalCodeCheckout;

    @FindBy(id = "continue")
    private WebElement btncontinueChekcout;

    @FindBy(id = "finish")
    private WebElement btnfinish;

    @FindBy(xpath = "//h2[@class='complete-header']")
    private WebElement titleThankyouForOrder;

    public void inputFirstnameCheckout(String firstName){
        clear(firstnameCheckout);
        sendKeys(firstnameCheckout, firstName);
    }
    public void inputLastnameCheckout(String lastName){
        clear(lastnameCheckout);
        sendKeys(lastnameCheckout, lastName);
    }
    public void inputPostCodeCheckout(String postCode){
        clear(postalCodeCheckout);
        sendKeys(postalCodeCheckout, postCode);
    }
    public void clickContinueCheckoutButton(){
       waitForElementClickable(btncontinueChekcout);
       click(btncontinueChekcout);
    }
    public void clickFinishButton(){
        waitForElementClickable(btnfinish);
        click(btnfinish);
    }

    public String getTitleThankyouForOrder(){
        return getText(titleThankyouForOrder);
    }
}
