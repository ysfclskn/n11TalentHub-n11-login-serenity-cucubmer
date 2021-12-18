package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import starter.n11.login.LoginAsUser;
import starter.n11so.signup.SignUpAsPerson;
import starter.n11so.tasks.NavigateTo;
import starter.n11so.user_interface.n11soSignupPageElements;

public class N11soSignupDefinitions {
    Actor actor = Actor.named("patikabootcampers");

    @Managed
    WebDriver webDriver;
    @Given("user launch browser and open the login page")
    public void userLaunchBrowserAndOpenTheLoginPage() {
        actor.can(BrowseTheWeb.with(webDriver));
        actor.wasAbleTo(NavigateTo.then11soHomePage());

    }
    @When("user signed in selleroffice with valid credentials")
    public void userSignedInSellerofficeWithValidCredentials() {
        actor.attemptsTo(SignUpAsPerson.signupThePage("ysfclskn","ysfclskn94@gmail.com","yusuf","YSFmystore"));
    }



    @Then("user signed in selleroffice successfully")
    public void userSignedInSellerofficeSuccessfully() {

        actor.attemptsTo(
                Ensure.that(n11soSignupPageElements.ERR_TEXT).hasText("Lütfen sözleşmeyi kabul ettiğinizi onaylayın.")

        );

    }
}
