package stepdefinitions;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.Request;
import net.serenitybdd.screenplay.rest.interactions.Post;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

public class AutorizedStep {



    @Given("el usuario carga la informacion de la url")
    public void elUsuarioCargaLaInformacionDeLaUrlHttpsDemoqaComAccountV1Authorized(Request request) {
        theActorInTheSpotlight().remember("request",request);
    }
    @When("el ingresa los datos")
    public void elIngresaLosDatosPruebaServicioYPrueba123() {
        Request requestAut = theActorInTheSpotlight().recall("request");

        theActorInTheSpotlight().attemptsTo(Post.to(requestAut.getUrl()).with(request -> request
                .contentType("application/json; charset=utf-8")
                .body(requestAut.getAuthorizationBody())
                .relaxedHTTPSValidation()));

    }
    @Then("el obtiene una respuesta exitosa")
    public void elObtieneUnaRespuestaExitosa() {
        Request requestAut = theActorInTheSpotlight().recall("request");
        theActorInTheSpotlight().should(seeThatResponse("mensaje", response -> response.statusCode(Integer.parseInt(requestAut.getCode()))));
    }
}
