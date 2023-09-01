package serenityestructura.utilidades;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;



public  class Dri_Global {

    public Performable ClickEn(Target elemento) {
        return Click.on(elemento);
    }

    public  Performable Escribir(String texto, Target elemento) {
        return Enter.theValue(texto).into(elemento);
    }

    public Boolean answeredBy(Target elemento, Actor actor) {
        Boolean elementorevisar = elemento.resolveFor(actor).isDisplayed();

        return elementorevisar;
    }

}
