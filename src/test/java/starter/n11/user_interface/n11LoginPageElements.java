package starter.n11.user_interface;

import net.serenitybdd.screenplay.targets.Target;

public class n11LoginPageElements {

    public static Target EMAIL_FIELD = Target.the("search field").locatedBy("#email");
    public static Target PASSWORD_FIELD = Target.the("search field").locatedBy("#password");
    public static Target LOGIN_BUTTON = Target.the("search field").locatedBy("#loginButton");
}
