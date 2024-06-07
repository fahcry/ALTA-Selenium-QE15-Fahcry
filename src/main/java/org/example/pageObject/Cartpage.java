package org.example.pageObject;

import org.example.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Cartpage extends BasePage {
    public Cartpage(WebDriver driver){

        super(driver);
    }

    @FindBy(id = "checkout")
    private WebElement btnCheckout;

    public void clickCheckout(){
        waitForElementClickable(btnCheckout);
        click(btnCheckout);
    }
}
