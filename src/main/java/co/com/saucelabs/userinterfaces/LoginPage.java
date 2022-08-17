package co.com.saucelabs.userinterfaces;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
    public static final Target TXT_USERNAME = (Target) Target.the("Username Input").locatedForAndroid(By.id("test-Usuario"));
    public static final Target TXT_PASSWORD = Target.the("Password Input").located(By.xpath("test-Contraseña"));
    public static final Target BTN_LOGIN = Target.the("Login Button").located(By.xpath("//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]/android.widget.TextView"));

}
