package co.com.saucelabs.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class Purchase implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return LBL_CHECKOUT_COMPLETE.resolveFor(actor).isVisible();
    }

    public static Purchase isSuccesful(){
        return new Purchase();
    }
}
