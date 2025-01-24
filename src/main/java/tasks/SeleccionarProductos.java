package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterfaces.ComprasHomePage;

import static userinterfaces.BuscarProductosUI.*;

public class SeleccionarProductos implements Task{
   private ComprasHomePage comprasHomePage;
    public SeleccionarProductos(ComprasHomePage  comprasHomePage){
        this.comprasHomePage = comprasHomePage;
    }
    public static SeleccionarProductos on(ComprasHomePage comprasHomePage) {
        return Tasks.instrumented(SeleccionarProductos.class, comprasHomePage);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PRIMER_PRODUCTO),
                Click.on(SEGUNDO_PRODUCTO),
                Click.on(CARRITO_COMPRAS),
                Click.on(ELIMINAR_PRODUCTO)

       );
    }
}
