Feature: El cliente visualiza listado de trabajadores
  Como cliente quiero visualizar la lista de los trabajadores en la plataforma para conocer información
  Scenario: Listado de trabajadores con éxito
    Given el cliente navega por la aplicación
    When el cliente busque la sección de trabajadores
    Then el cliente visualiza la lista de los trabajadores

  Scenario: Listado vacío de trabajadores
    Given el cliente navega por la aplicación
    When el cliente busque la sección de trabajadores
    And no exista ningún registro de trabajadores
    Then el cliente no visualiza ningún resultado de búsqueda

  Scenario: Listado de trabajadores sin conexión a internet
    Given el cliente navega por la aplicación
    When el cliente busque la sección de trabajadores
    And el cliente no cuente con conexión a internet
    Then el cliente no visualiza ningún dato


