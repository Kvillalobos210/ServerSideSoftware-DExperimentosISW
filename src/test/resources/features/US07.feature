Feature: El cliente visualiza una cita a detalle
  Como cliente quiero visualizar detalles de una cita para revisar los datos de la misma
  Scenario: Visualización de detalles de la cita
    Given el cliente navega por la aplicación
    When el cliente se encuentre en la sección de descripción de una cita
    Then el cliente visualiza detalles de esa cita

  Scenario: Visualización nula de detalles de la cita
    Given el cliente navega por la aplicación
    When el cliente se encuentre en la sección de descripción de una cita
    And el cliente no tenga una cita hecha
    Then el cliente no visualiza detalles de esa cita

  Scenario: Visualización de detalles de la cita
    Given el cliente navega por la aplicación
    When el cliente se encuentre en la sección de descripción de una cita
    And el cliente no cuente con conexión a internet
    Then el cliente no detalles de su cita