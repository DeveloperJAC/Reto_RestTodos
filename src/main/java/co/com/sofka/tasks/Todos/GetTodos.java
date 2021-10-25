package co.com.sofka.tasks.Todos;


import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GetTodos implements Task {

    private final String id;

    public GetTodos(String id) {
        this.id = id;
    }

    public static Performable fromPage(String id) {
        return instrumented(GetTodos.class, id);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Get.resource("/todos"+id)

                        .with(requestSpecification
                                -> requestSpecification.contentType(ContentType.JSON)
                        )
        );
    }
}




