package co.com.saucelabs.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {

    public static final Target LBL_NAME_PRODUCT = Target.the("Title with the name of the product").located(By.xpath("(//android.widget.TextView[@content-desc=\"test-Titulo de articulo\"])[1]"));

    //public static final Target LBL_NAME_PRODUCT = Target.the("Title with the name of the product").locatedBy("//android.widget.TextView[@text='{0}']");

    //public static final Target LBL_NAME_PRODUCT = Target.the("Title with the name of the product").locatedBy("//*[contains (@text,'{0}') ]");

    //public static final Target LBL_NAME_PRODUCT = Target.the("Title with the name of the product").locatedBy("//*[contains (@text,'{0}') ]");

    //public static final Target LBL_NAME_PRODUCT = Target.the("Title with the name of the product").located(By.xpath("(//android.widget.TextView[@content-desc=\"test-Titulo de articulo\"])[4]"));

    //public static final Target LBL_NAME_PRODUCT = Target.the("Title with the name of the product").located(By.xpath("(//android.widget.TextView[@text=\"Camisa Sauce Labs Bolt\"])"));

    //public static final Target LBL_NAME_PRODUCT = Target.the("Title with the name of the product").located(By.xpath("(//android.widget.TextView[@text=\"'{0}'\"])"));
    //public static final Target LBL_NAME_PRODUCT = Target.the("Title with the name of the product").located(By.xpath("//android.widget.TextView[@text='{0}']"));
}
