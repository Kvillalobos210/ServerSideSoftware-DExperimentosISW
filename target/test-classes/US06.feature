Feature: El cliente visualiza las citas que ha reservado
  Como cliente quiero visualizar las citas que he reservado para tener un control de ellas
  Scenario: Visualización de citas con éxito
    Given el cliente navega por la aplicación
    When el cliente se encuentre en la sección de inicio
    Then el cliente visualiza sus citas

  Scenario: Visualización nula de citas
    Given el cliente navega por la aplicación
    When el cliente se encuentre en la sección de inicio
    And el cliente no tenga citas hechas
    Then el cliente no visualiza sus citas

  Scenario: Visualización de citas sin conexión a internet
    Given el cliente navega por la aplicación
    When el cliente se encuentre en la sección de inicio
    And el cliente no cuente con conexión a internet
    Then el cliente no visualiza sus citas