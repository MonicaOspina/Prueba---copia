package tasks;

import interactions.CambiarVentana;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterfaces.BancolombiaHomePage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userinterfaces.BuscarPersonasUI.*;

public class SeleccionarPersonas implements Task{

   private BancolombiaHomePage bancolombiaHomePage;

    public SeleccionarPersonas(BancolombiaHomePage bancolombiaHomePage){
        this.bancolombiaHomePage = bancolombiaHomePage;
    }

    public static SeleccionarPersonas on(BancolombiaHomePage bancolombiaHomePage) {
        return Tasks.instrumented(SeleccionarPersonas.class, bancolombiaHomePage);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(NUESTRAS_MARCAS),
                Click.on(BANCOLOMBIA),
                CambiarVentana.uno(),
                Click.on(PAGINA_PRINCIPAL),
                Click.on(PERSONAS),
                Click.on(SOLICITAR_PRODUCTOS),
                Click.on(INVERSIONES),
                Click.on(FLECHA),
                Click.on(MONTO_MINIMO),
                Click.on(CONOCE_MAS),
                Click.on(DOCUMENTOS),
                Click.on(PDF),
                CambiarVentana.uno()

        );
    }
}
