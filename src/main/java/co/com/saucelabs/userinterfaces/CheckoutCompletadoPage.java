package co.com.saucelabs.userinterfaces;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckoutCompletadoPage {
    public static final Target LBL_CHECKOUT_COMPLETE = Target.the("Title Checkout Complete").located(By.xpath("//android.widget.ScrollView[@content-desc=\"test-CHECKOUT: COMPLETADO!\"]/android.view.ViewGroup/android.widget.TextView[1]"));
}
