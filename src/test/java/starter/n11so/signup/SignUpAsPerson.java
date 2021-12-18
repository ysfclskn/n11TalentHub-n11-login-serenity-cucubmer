package starter.n11so.signup;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.waits.WaitUntilExpectation;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.support.ui.ExpectedConditions;
import starter.n11so.user_interface.n11soLoginPageElements;
import starter.n11so.user_interface.n11soSignupPageElements;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class SignUpAsPerson implements Task {

    private final String username_text;
    private final String password_text;
    private final String email_text;
    private final String storename_text;

    @Step("{0} Signup with username '#username_text' '#email_text' and password '#password_text' and storename '#storename'")
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(n11soLoginPageElements.SIGNUP_BUTTON), // Go to SignUp page
                WaitUntil.the(n11soSignupPageElements.USERNAME_FIELD,isClickable()).forNoMoreThan(3).seconds(), //Wait until for username clickable

                //Type username
                Click.on(n11soSignupPageElements.USERNAME_FIELD),
                SendKeys.of(this.username_text).into(n11soSignupPageElements.USERNAME_FIELD),

                //Type Password
                Click.on(n11soSignupPageElements.PASSWORD_FIELD),
                WaitUntil.the(n11soSignupPageElements.LOADING_GIF,isNotCurrentlyVisible()).forNoMoreThan(2).seconds(),
                SendKeys.of(this.password_text).into(n11soSignupPageElements.PASSWORD_FIELD),


                //Retype Password
                Click.on(n11soSignupPageElements.RE_PASSWORD_FIELD),
                WaitUntil.the(n11soSignupPageElements.LOADING_GIF,isNotCurrentlyVisible()).forNoMoreThan(2).seconds(),
                SendKeys.of(this.password_text).into(n11soSignupPageElements.RE_PASSWORD_FIELD),

                //Type e-mail
                Click.on(n11soSignupPageElements.EMAIL_FIELD),
                WaitUntil.the(n11soSignupPageElements.LOADING_GIF,isNotCurrentlyVisible()).forNoMoreThan(2).seconds(),
                SendKeys.of(this.email_text).into(n11soSignupPageElements.EMAIL_FIELD),

                //Retype e-mail
                Click.on(n11soSignupPageElements.RE_EMAIL_FIELD),
                WaitUntil.the(n11soSignupPageElements.LOADING_GIF,isNotCurrentlyVisible()).forNoMoreThan(2).seconds(),
                SendKeys.of(this.email_text).into(n11soSignupPageElements.RE_EMAIL_FIELD),

                //Type store name
                Click.on(n11soSignupPageElements.STORE_NAME_FIELD),
                WaitUntil.the(n11soSignupPageElements.LOADING_GIF,isNotCurrentlyVisible()).forNoMoreThan(2).seconds(),
                SendKeys.of(this.storename_text).into(n11soSignupPageElements.STORE_NAME_FIELD),

                //Select "Şahıs" user type
                Click.on(n11soSignupPageElements.USERTYPE_BUTTON),

                //Submit SignUP form
                Click.on(n11soSignupPageElements.SIGNUP_BUTTON)


        );



    }

    public SignUpAsPerson(String username_text,String email_text, String password_text,String storename_text){
        this.username_text = username_text;
        this.email_text = email_text;
        this.password_text = password_text;
        this.storename_text = storename_text;

    }



    public static SignUpAsPerson signupThePage(String username_text,String email_text, String password_text, String storename_text) {
        return instrumented(SignUpAsPerson.class
                ,username_text,email_text,password_text,storename_text);
    }



}
