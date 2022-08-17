package co.com.saucelabs.stepdefinitions;


import co.com.saucelabs.tasks.AddProducts;
import co.com.saucelabs.tasks.Login;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;

import java.util.List;
import java.util.Map;

import static co.com.saucelabs.tasks.Checkout.checkout;
import static co.com.saucelabs.userinterfaces.CheckoutCompletadoPage.*;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class BuyingProductsStepDefinition {

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("that {string} signed-in SwagLabs app")
    public void thatSandraSignedInSwagLabsApp(String actor) {
        theActorCalled(actor).attemptsTo(Login.atSwagLabs());
    }

    @When("He puts in the cart these products")
    public void hePutsInTheCartTheseProducts(List<Map<String, String>> products) {
        theActorInTheSpotlight().attemptsTo(AddProducts.toCart(products));
    }

    @When("He does the checkout of his purchase")
    public void heDoesTheCheckoutOfHisPurchase() {
        theActorInTheSpotlight().attemptsTo(checkout());
    }

    @Then("He should see the message {string}")
    public void heShouldSeeTheMessage(String confirmationMessage) {
        withCurrentActor(Ensure.that(LBL_CHECKOUT_COMPLETE).text().contains(confirmationMessage));
    }
}