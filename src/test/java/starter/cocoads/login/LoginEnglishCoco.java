package starter.cocoads.login;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import starter.cocoads.user_interface.CocoadsLoginPageElements;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class LoginEnglishCoco implements Task {
    private final String email_text;
    private final String password_text;

    @Step("{0} Login with email '#email_text' and password '#password_text'")
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(CocoadsLoginPageElements.EN_FLAG_BUTTON,isClickable()).forNoMoreThan(20).seconds(),
                Click.on(CocoadsLoginPageElements.EN_FLAG_BUTTON),
                WaitUntil.the(CocoadsLoginPageElements.EMAIL_FIELD,isClickable()).forNoMoreThan(2).seconds(),
                Click.on(CocoadsLoginPageElements.EMAIL_FIELD),
                SendKeys.of(this.email_text).into(CocoadsLoginPageElements.EMAIL_FIELD),
                Click.on(CocoadsLoginPageElements.PASSWORD_FIELD),
                SendKeys.of(this.password_text).into(CocoadsLoginPageElements.PASSWORD_FIELD),
                Click.on(CocoadsLoginPageElements.LOGIN_BUTTON)
        );



    }

    public LoginEnglishCoco(String email_text, String password_text){
        this.email_text = email_text;
        this.password_text = password_text;

    }



    public static LoginEnglishCoco loginCoco(String email_text, String password_text) {
        return instrumented(LoginEnglishCoco.class
                ,email_text,password_text);
    }
}
