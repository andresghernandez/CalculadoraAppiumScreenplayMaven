Feature: Realizar Operaciones Calculadora
  Yo como usuario de la aplicacion calculadora
  deseo realizar operaciones matematicas
  para validar su respuesta

  @operacionesCalculadora
  Scenario Outline: Realizar Operaciones Calculadora
    Given que Nicolas ingresa a la aplicacion de la calculadora <Fila>
      | Ruta Excel                         | Pestaña                |
      | src/test/resources/data/Datos.xlsx | OperacionesMatematicas |
    When realiza operaciones matematicas
    Then puede validar el resultado obtenido

    Examples:
      | Fila |
      |    1 |