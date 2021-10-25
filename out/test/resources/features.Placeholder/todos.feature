Feature: Area de Todos
  Como usuario que ingresa a un sitio informativo
  nececito poder ingresar a un modulo cualquiera
  para poder visualizar correctamente la informacion requerida


  Background:
    Given el usuario ingresa a la pagina

  Scenario:  visualizar de forma exitoso
    When cuando el usuario quiere ver todas las posibilidades
    Then el usuario debera ver el modulo de Todos

  Scenario: visualizacion no exitosa
    When cuando el usuario realice un accion erronea
    Then el usuario debera ver un mensaje de error

