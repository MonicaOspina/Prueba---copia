package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import tasks.OpenTheBrowser;


import tasks.SeleccionarPersonas;
import userinterfaces.BancolombiaHomePage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


public class BancolombiaStepDefinitions {

    private BancolombiaHomePage bancolombiaHomePage;

    @Managed(driver = "chrome")

    private WebDriver herBrowser;
    private Actor Monica = Actor.named("Monica");



    @Before
    public void setUp(){

        Monica.can(BrowseTheWeb.with(herBrowser));
    }



    @Given("^que Moni esta en la pagina de Bancolombia$")
    public void queMoniEstaEnLaPaginaDeBancolombia()  {
         Monica.wasAbleTo(OpenTheBrowser.on(bancolombiaHomePage));
    }


    @When("^ella solicita una inversion$")
    public void ellaSolicitaUnaInversion()  {
        Monica.attemptsTo(SeleccionarPersonas.on(bancolombiaHomePage));

    }

    @Then("^ella valida el pdf generado$")
    public void ellaValidaElPdfGenerado() {

    }
}
