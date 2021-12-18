package starter.n11so.user_interface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class n11soSignupPageElements {
    public static Target USERNAME_FIELD = Target.the("Username").locatedBy("#usernameInputText");
    public static Target PASSWORD_FIELD = Target.the("Password").locatedBy("#passwordInputText");
    public static Target RE_PASSWORD_FIELD = Target.the("Password Retype").locatedBy("#passwordRetypeInputText");
    public static Target EMAIL_FIELD  = Target.the("Email").locatedBy("#emailInputText");
    public static Target RE_EMAIL_FIELD  = Target.the("Re-email").locatedBy("#emailRetypeInputText");
    public static Target STORE_NAME_FIELD = Target.the("Store Name").locatedBy("//*[@id=\"nicknameInputText\"]");
    public static Target USERTYPE_BUTTON = Target.the("Usertype Button").locatedBy("//label[contains(text(),'Şahıs')]");
    public static Target SIGNUP_BUTTON = Target.the("Signup Button").locatedBy("#j_id277_j_id_dm");
    public static Target LOADING_GIF = Target.the("loading").locatedBy("#dialogLoading");
    public static Target ERR_TEXT = Target.the("Error Message").locatedBy("//span[contains(text(),'Lütfen sözleşmeyi kabul ettiğinizi onaylayın.')]");

}
