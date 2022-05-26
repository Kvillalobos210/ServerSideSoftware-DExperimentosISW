Feature: El cliente contrata a un trabajador
  Como cliente quiero contratar a un trabajador para arreglar el desperfecto de mi hogar.
  Scenario: El cliente contrata a un trabajador con éxito
    Given el cliente navega por la aplicación
    When el cliente se encuentre en la sección de trabajadores
    Then el cliente contrata a un trabajador de su preferencia

  Scenario: El cliente contrata a un trabajador sin mucha información de su desperfecto
    Given el cliente navega por la aplicación
    When el cliente se encuentre en la sección de trabajadores
    And el cliente no tenga información relevante de su desperfecto
    Then el cliente no contrata a un trabajador

  Scenario: El cliente contrata a un trabajador sin conexión a internet
    Given el cliente navega por la aplicación
    When el cliente se encuentre en la sección de trabajadores
    And el cliente no cuente con conexión a internet
    Then el cliente no contrata a un trabajador