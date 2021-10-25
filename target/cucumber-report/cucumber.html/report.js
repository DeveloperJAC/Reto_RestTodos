$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features.Placeholder/todos.feature");
formatter.feature({
  "name": "Area de Todos",
  "description": "  Como usuario que ingresa a un sitio informativo\n  nececito poder ingresar a un modulo cualquiera\n  para poder visualizar correctamente la informacion requerida",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "el usuario ingresa a la pagina",
  "keyword": "Given "
});
formatter.match({
  "location": "co.com.sofka.stepdefinition.placeholder.todos.TodosStepDefinition.elUsuarioIngresaALaPagina()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "visualizar de forma exitoso",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "cuando el usuario quiere ver todas las posibilidades",
  "keyword": "When "
});
formatter.match({
  "location": "co.com.sofka.stepdefinition.placeholder.todos.TodosStepDefinition.cuandoElUsuarioQuiereVerTodasLasPosibilidades()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "el usuario debera ver el modulo de Todos",
  "keyword": "Then "
});
formatter.match({
  "location": "co.com.sofka.stepdefinition.placeholder.todos.TodosStepDefinition.elUsuarioDeberaVerElModuloDeTodos()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: \nExpected: \"fugiat veniam minus\"\n     but: was \"aliquid amet impedit consequatur aspernatur placeat eaque fugiat suscipit\"\r\n\tat net.serenitybdd.screenplay.ErrorTally.throwSummaryExceptionFrom(ErrorTally.java:36)\r\n\tat net.serenitybdd.screenplay.ErrorTally.reportAnyErrors(ErrorTally.java:30)\r\n\tat net.serenitybdd.screenplay.Actor.should(Actor.java:316)\r\n\tat co.com.sofka.stepdefinition.placeholder.todos.TodosStepDefinition.elUsuarioDeberaVerElModuloDeTodos(TodosStepDefinition.java:74)\r\n\tat ✽.el usuario debera ver el modulo de Todos(file:///C:/Users/Usuario/IdeaProjects/restTodos/serviciosrest/src/test/resources/features.Placeholder/todos.feature:12)\r\n",
  "status": "failed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "el usuario ingresa a la pagina",
  "keyword": "Given "
});
formatter.match({
  "location": "co.com.sofka.stepdefinition.placeholder.todos.TodosStepDefinition.elUsuarioIngresaALaPagina()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "visualizacion no exitosa",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "cuando el usuario realice un accion erronea",
  "keyword": "When "
});
formatter.match({
  "location": "co.com.sofka.stepdefinition.placeholder.todos.TodosStepDefinition.cuandoElUsuarioRealiceUnAccionErronea()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "el usuario debera ver un mensaje de error",
  "keyword": "Then "
});
formatter.match({
  "location": "co.com.sofka.stepdefinition.placeholder.todos.TodosStepDefinition.elUsuarioDeberaVerUnMensajeDeError()"
});
formatter.result({
  "status": "passed"
});
});