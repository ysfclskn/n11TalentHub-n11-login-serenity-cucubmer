package starter.cocoads.user_interface;

import net.serenitybdd.screenplay.targets.Target;

public class CocoadsLoginPageElements {
    public static Target EN_FLAG_BUTTON = Target.the("english flag button").locatedBy(".icon_lang.icon_lang-en");
    public static Target EMAIL_FIELD = Target.the("email field").locatedBy("//*[@id=\"client-login\"]/form/div[2]/input");
    public static Target PASSWORD_FIELD = Target.the("password field").locatedBy("//*[@id=\"client-login\"]/form/div[3]/input");
    public static Target LOGIN_BUTTON = Target.the("login button").locatedBy("#client-login>form>button");
}
