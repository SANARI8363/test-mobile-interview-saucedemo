package co.com.saucelabs.userinterfaces;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductPage {

    public static final Target BTN_ADD_TO_CART = Target.the("Button Add Product to Cart").located(By.id("test-ADD TO CART"));
    public static final Target BTN_BACK_TO_HOME= Target.the("Button Back to the Home").located(By.id("test-BACK TO PRODUCTS"));
    public static final Target BTN_OPEN_SHOP_CART= Target.the("Button Cart").located(By.id("test-Cart"));
}
