package co.com.choucair.certification.Proyecto1.userinterface;

import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ChoucairLoginPage extends PageObject {
    public static final Target LOGIN_BUTTON = Target.the("button that shows us the form to login").located(By.xpath("//div[@class='d-none d-lg-block']//strong[contains(text(),'Ingresar')]"));
    public static final Target INPUT_USER = Target.the("where do yo write your username").located(By.id("username"));
    public static final Target INPUT_PSSWD = Target.the("where do yo write your password").located(By.id("password"));
    public static final Target ENTER_BUTTON = Target.the("Enter button to login").located(By.xpath("//button[contains(@class,'btn btn-primary')]"));

}
