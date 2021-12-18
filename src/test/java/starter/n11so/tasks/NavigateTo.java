package starter.n11so.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import starter.n11.user_interface.n11HomePage;
import starter.n11so.user_interface.n11soLoginPage;

public class NavigateTo {
    public static Performable then11soHomePage() {
        return Task.where("{0} opens the n11 so page",
                Open.browserOn().the(n11soLoginPage.class));
    }
}
