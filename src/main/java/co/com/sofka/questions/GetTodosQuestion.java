package co.com.sofka.questions;



import co.com.sofka.models.Todos;
import co.com.sofka.models.Dat;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;


import java.util.Arrays;
import java.util.List;

import static net.serenitybdd.rest.SerenityRest.lastResponse;


public class GetTodosQuestion implements Question {
    @Override
    public Dat answeredBy(Actor actor) {
        List<Todos> listaTodos = Arrays.asList(lastResponse().getBody().as(Todos[].class));
        Dat dat = new Dat();
        dat.setDat(listaTodos);
        return dat;
    }

    public static GetTodosQuestion getTodosQuestion() {
        return new GetTodosQuestion();
    }
}
