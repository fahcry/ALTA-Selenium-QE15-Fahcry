package org.example.pageObject;

import org.example.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContinuePage extends BasePage {
    public ContinuePage(WebDriver driver) {

        super(driver);
    }
    @FindBy(xpath = "//a[@id='item_4_title_link']")
    private WebElement titleProductSauceLabsBackpack;

    @FindBy(xpath = "//select[@class='product_sort_container']")
    private WebElement SelectFilterZtoA;

    @FindBy(id = "item_3_title_link")
    private WebElement TittleTshirtRed;

    @FindBy(id = "item_2_title_link")
    private WebElement TitleTshirtOnesie;

    @FindBy(id = "add-to-cart-test.allthethings()-t-shirt-(red)")
    private WebElement AddToCartTshirtRed;

    @FindBy(id = "add-to-cart-sauce-labs-onesie")
    private WebElement AddToCartTshirtOnesie;

    @FindBy(id = "shopping_cart_container")
    private WebElement btncart;

    @FindBy(id = "item_2_title_link")
    private WebElement TitleContinueTshirtOnesie;

    @FindBy(id = "item_3_title_link")
    private WebElement TitleContinueTshirtRed;


    @FindBy(id = "remove-test.allthethings()-t-shirt-(red)")
    private WebElement btnRemoveCartTshirtRed;

    @FindBy(id = "continue-shopping")
    private WebElement btnContinueShopping;

    public boolean verifyTitleProductSauceLabsBackpack(){

        return isDisplayed(titleProductSauceLabsBackpack);
    }

    public void setSelectFilterZtoA(String filter){
        selectByVisibleText(SelectFilterZtoA, filter);
    }

    public boolean verifyTshirtRed(){

        return isDisplayed(TittleTshirtRed);
    }
    public boolean verifyTshirtOnesie(){

        return isDisplayed(TitleTshirtOnesie);
    }
    public void clickAddToCartTshirtRed() {
        scrollIntoView(AddToCartTshirtRed);
        waitForElementClickable(AddToCartTshirtRed);
        click(AddToCartTshirtRed);
    }
    public void clickAddToCartTshirtOnesie() {
        scrollIntoView(AddToCartTshirtOnesie);
        waitForElementClickable(AddToCartTshirtOnesie);
        click(AddToCartTshirtOnesie);
    }
    public void clickCart() {
        waitForElementClickable(btncart);
        click(btncart);
    }
    public boolean verifyContinueTshirtRed(){

        return isDisplayed(TitleContinueTshirtRed);
    }
    public boolean verifyContinueTshirtOnesie(){

        return isDisplayed(TitleContinueTshirtOnesie);
    }

    public boolean verifyRemoveButtonDisplayedOnTshirtRed(){
        return isDisplayed(btnRemoveCartTshirtRed);
    }
    public void clickRemoveProductTshirtRed() {
        scrollIntoView(btnRemoveCartTshirtRed);
        waitForElementClickable(btnRemoveCartTshirtRed);
        click(btnRemoveCartTshirtRed);
    }

    public boolean verifyRemovebtnTshirtRed(){
        return !isDisplayed(TittleTshirtRed);
    }

    public void clickContinue(){
        waitForElementClickable(btnContinueShopping);
        click(btnContinueShopping);
    }


}
