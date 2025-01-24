package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static userinterfaces.BuscarProductosUI.VALOR;

public class ValidatePrecio implements Question<String> {
    private String precio;
    public ValidatePrecio(String precio) {
        this.precio = precio;
    }
    public static ValidatePrecio validate(String precio) {
        return new ValidatePrecio(precio);
    }

    @Override
    public String answeredBy(Actor actor) {
        String mensaje = Text.of(VALOR).viewedBy(actor).asString();
        return mensaje;
    }
   /* @Override
    public Boolean answeredBy(Actor actor) {
        //System.out.println(getDriver().getCurrentUrl());
        //System.out.println(BrowseTheWeb.as(actor).getDriver().getCurrentUrl().replace("%C3%B3","ó"));
        System.out.println(BrowseTheWeb.as(actor).getDriver().getCurrentUrl().replace("%C3%B3","ó").contains(precio));
        return BrowseTheWeb.as(actor).getDriver().getCurrentUrl().replace("%C3%B3","ó").contains(precio);
    }*/
}
