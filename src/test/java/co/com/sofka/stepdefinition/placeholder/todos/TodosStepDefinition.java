package co.com.sofka.stepdefinition.placeholder.todos;

import co.com.sofka.models.Todos;
import co.com.sofka.questions.ResponseCode;
import co.com.sofka.tasks.Todos.GetTodos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import net.serenitybdd.screenplay.rest.abilities.CallAnApi;



import static co.com.sofka.util.Title.TITLE1;
import static co.com.sofka.util.Title.TITLE3;

import static javax.servlet.http.HttpServletResponse.SC_NOT_FOUND;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;
import static javax.servlet.http.HttpServletResponse.SC_OK;


import net.serenitybdd.screenplay.Actor;



import static co.com.sofka.questions.GetTodosQuestion.getTodosQuestion;
import static co.com.sofka.util.Title.*;



public class TodosStepDefinition {

    private static final String restApiUrl="https://jsonplaceholder.typicode.com";
    Actor jose ;
    Todos data ;
    Todos data2;

    @Given("el usuario ingresa a la pagina")
    public void elUsuarioIngresaALaPagina() {
        jose = Actor.named("Jose the actor")
                .whoCan(CallAnApi.at(restApiUrl));

        jose.attemptsTo(
                GetTodos.fromPage("")
        );
        jose.should(
                seeThat("El codigo de respuesta ", ResponseCode.was(),equalTo(SC_OK))
        );
    }

    @When("cuando el usuario quiere ver todas las posibilidades")
    public void cuandoElUsuarioQuiereVerTodasLasPosibilidades() {
        data =  getTodosQuestion().answeredBy(jose)
                .getData().stream()
                .filter(x->x.getId()==1).findFirst()
                .orElse(null);

        data2 = getTodosQuestion().answeredBy(jose)
                .getData().stream()
                .filter(x->x.getUserId()==3).findFirst()
                .orElse(null);
        jose.should(
                seeThat("Usuaruo  no nulo", act -> data,notNullValue())
        );
    }

    @Then("el usuario debera ver el modulo de Todos")
    public void elUsuarioDeberaVerElModuloDeTodos(){
        jose.should(
                seeThat("el primer titulo del primer usuario ", act -> data.getTitle(),equalTo(TITLE1.getValue()))
        );
        jose.should(
                seeThat("el primer titulo del usuario 3 " , act->data2.getTitle(),equalTo(TITLE3.getValue()))
        );
    }

    @When("cuando el usuario realice un accion erronea")
    public void cuandoElUsuarioRealiceUnAccionErronea() {
        Actor jose = Actor.named("Jose the actor")
                .whoCan(CallAnApi.at(restApiUrl));
        jose.attemptsTo(
                GetTodos.fromPage("18")
        );
    }

    @Then("el usuario debera ver un mensaje de error")
    public void elUsuarioDeberaVerUnMensajeDeError() {
        jose.should(
                seeThat("El mensaje de error ", ResponseCode.was(),equalTo(SC_NOT_FOUND))

        );
    }

}
