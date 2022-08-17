package co.com.saucelabs.tasks;

import co.com.devco.automation.mobile.actions.Scroll;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.saucelabs.userinterfaces.HomePage.*;
import static co.com.saucelabs.userinterfaces.ProductPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddProduct implements Task {
    private String nameProduct;

    public AddProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.untilVisibleTarget(LBL_NAME_PRODUCT.of(nameProduct)),
                Click.on(LBL_NAME_PRODUCT.of(nameProduct)),
                Scroll.untilVisibleTarget(BTN_ADD_TO_CART),
                Click.on(BTN_ADD_TO_CART));
    }

    public static Performable toTheCart(String nameProduct){
        return instrumented(AddProduct.class, nameProduct);
    }
}