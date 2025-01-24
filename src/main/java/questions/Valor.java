package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static userinterfaces.BuscarProductosUI.VALOR;

public class Valor implements Question<String> {
    public static Question<String> mostrado(){
        return new Valor();
    }
    @Override
    public String answeredBy(Actor actor){
        return VALOR.resolveFor(actor).getValue();
    }
}
