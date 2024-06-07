package step_definitions;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pageObject.ContinuePage;
import org.openqa.selenium.WebDriver;

public class ContinueSteps {

    private final WebDriver driver = Hooks.driver;

    ContinuePage continueSteps = new ContinuePage(driver);

    @And("Click button filter and set Z to A {string}")
    public void clickButtonFilterAndSetZToA(String filterZtoA) {
        continueSteps.setSelectFilterZtoA(filterZtoA);

    }

    @And("Verify the product Tshirt Red is Displayed")
    public void verifyTheProductTshirtRedIsDisplayed() {
        continueSteps.verifyTshirtRed();
        continueSteps.verifyTshirtOnesie();
    }

    @And("Click add to cart Tshirt Red")
    public void clickAddToCartTshirtRed() {
        continueSteps.clickAddToCartTshirtRed();

    }

    @And("Click add to cart Tshirt Onesie")
    public void clickAddToCartTshirtOnesie() {
        continueSteps.clickAddToCartTshirtOnesie();
    }

    @Then("Verify the product Tshirt Red & Onesie on the checkout page")
    public void verifyTheProductTshirtRedOnesieOnTheCheckoutPage() {
        continueSteps.verifyContinueTshirtRed();
        continueSteps.verifyContinueTshirtOnesie();
    }

    @And("Remove button on the Tshirt Red")
    public void removeButtonOnTheTshirtRed() {
        continueSteps.clickRemoveProductTshirtRed();
    }

    @Then("CLick Continue Shopping button")
    public void clickContinueShoppingButton() {
        continueSteps.clickContinue();
    }
}
