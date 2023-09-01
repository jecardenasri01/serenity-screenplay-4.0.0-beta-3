package stepdefinitions;

import net.serenitybdd.core.annotations.events.BeforeScenario;
import net.serenitybdd.screenplay.actions.Open;
import serenityestructura.serenity.task.Pag_InicioGoogle;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class steps_busquedagoogle {
    @BeforeScenario
    public void startsPage() {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("jeisson");
        theActorInTheSpotlight().attemptsTo(Open.url("https://www.google.cl/"));
    }

    @Given("^usuario realiza busqueda en navegador google de (.*)$")
    public void usuario_realiza_busqueda_en_navegador_google_de(String cancionbuscada) {
        theActorInTheSpotlight().attemptsTo(Pag_InicioGoogle.busquedaCancionesGoogle(cancionbuscada));

    }
    @When("^accede a youtube")
    public void accede_a_la_seccion_de_certificados_y_ve_los_filtros_de_necesidades() {
    }
    @Then("^revisa nombre de cancion sea (.*)$")
    public void revisa_nombre_de_cancion_sea (String cancionencontrada) {
    }

}
