package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import questions.ValidatePrecio;
import tasks.OpenTheBrowser;


import tasks.SeleccionarProductos;
import userinterfaces.ComprasHomePage;


import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


public class ComprasStepDefinitions {
    private ComprasHomePage comprasHomePage;

  // @Managed(driver = "firefox")
    //private WebDriver herBrowser;
  @Managed(uniqueSession = true)
  private WebDriver driver;
    private Actor Monica = Actor.named("Monica");


    @Before
    public void configuracionInicial() {
              Monica.can(
                BrowseTheWeb.with(driver));
    }
        @Given("^que Moni esta en la pagina de compras$")
    public void queMoniEstaEnLaPaginaDeCompras()  {
       Monica.wasAbleTo(OpenTheBrowser.on(comprasHomePage));
    }


    @When("^ella solicita productos$")
    public void ellaSolicitaProductos()  {
    Monica.attemptsTo(SeleccionarProductos.on(comprasHomePage));
    }

    /*@Then("^ella valida el precio sea menor a 400$")
    public void ellaValidaPrecioMenor400i() {
           Monica.should(seeThat(
                   TheTarget.textValuesOf(VALOR),equals(Target.the("Valor"))));
    }*/
   /* @Then("^ella valida el precio sea menor a 400$")
    public void ellaValidaPrecioMenor400j() {
        Monica.should(seeThat(Valor.mostrado(),("₹183.60")));

   */

    @Then("^ella valida el precio sea menor a 400$")
    public void ellaValidaPrecioMenor400() {
        Monica.should(seeThat(ValidatePrecio.validate("₹183.60")));

    }
}
