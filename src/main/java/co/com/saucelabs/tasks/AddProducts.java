package co.com.saucelabs.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

import static co.com.saucelabs.userinterfaces.LoginPage.TXT_USERNAME;
import static co.com.saucelabs.userinterfaces.ProductPage.*;
import static co.com.saucelabs.userinterfaces.HomePage.*;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class AddProducts implements Task {

    private List<Map<String, String>> nameProduct;

    public AddProducts(List<Map<String, String>> nameProduct) {

        this.nameProduct = nameProduct;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        IntStream.range(0, nameProduct.size())
                .forEach(
                        (product) ->
                                actor.attemptsTo(
                                        WaitUntil.the(LBL_NAME_PRODUCT,isPresent()).forNoMoreThan(20).seconds(),
                                        Scroll.to(LBL_NAME_PRODUCT),
                                        Click.on(LBL_NAME_PRODUCT),

                                        //Scroll.to(LBL_NAME_PRODUCT.of(nameProduct.get(product).get("products"))),
                                        //Click.on(LBL_NAME_PRODUCT.of(nameProduct.get(product).get("products"))),
                                        Scroll.to(BTN_ADD_TO_CART),
                                        Click.on(BTN_ADD_TO_CART),
                                        Click.on(BTN_BACK_TO_HOME)));
    }

    public static Performable toCart(List<Map<String, String>> nameProduct){
        return instrumented(AddProducts.class, nameProduct);
    }
}
