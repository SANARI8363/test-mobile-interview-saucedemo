package co.com.saucelabs.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {
    public static final Target LBL_NAME_PRODUCT = Target.the("Title with the name of the product")
            .locatedBy("//android.widget.TextView[@text='{0}']");
}
