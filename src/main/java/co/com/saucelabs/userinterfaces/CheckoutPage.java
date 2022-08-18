package co.com.saucelabs.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckoutPage {
    public static final Target BTN_CHECKOUT = Target.the("Button to checkut").located(By.xpath("//android.view.ViewGroup[@content-desc=\"test-CHECKOUT\"]/android.widget.TextView"));
    public static final Target TXT_NAME = Target.the("Name Input").located(By.xpath("//android.widget.EditText[@content-desc=\"test-Nombre\"]"));
    public static final Target TXT_LAST_NAME = Target.the("Lastname Input").located(By.xpath("//android.widget.EditText[@content-desc=\"test-Apellido\"]"));
    public static final Target TXT_POST_CODE = Target.the("Post Code Input").located(By.xpath("//android.widget.EditText[@content-desc=\"test-Código postal\"]"));
    public static final Target BTN_CONTINUE = Target.the("Button to Continue").located(By.xpath("//android.view.ViewGroup[@content-desc=\"test-CONTINUAR\"]/android.widget.TextView"));
    public static final Target BTN_FINISH = Target.the("Button to Finish").located(By.xpath("//android.view.ViewGroup[@content-desc=\"test-TERMINAR\"]/android.widget.TextView"));

}
