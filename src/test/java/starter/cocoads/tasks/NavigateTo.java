package starter.cocoads.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import starter.cocoads.user_interface.CococLoginPage;

public class NavigateTo {
    public static Performable theCocoadsLogin() {
        return Task.where("{0} opens the cocoads login page",
                Open.browserOn().the(CococLoginPage.class));
    }
}
