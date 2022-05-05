Feature: El trabajador visualiza las solicitudes de trabajo
  Como trabajador quiero visualizar las solicitudes de trabajo para organizar mi tiempo de oficio
  Scenario: El trabajador posee solicitudes de trabajo
    Given el trabajador inició sesión en la aplicación
    When se encuentre en la sección principal
    Then visualizará un listado de solicitudes de trabajo

  Scenario: El trabajador no posee solicitudes de trabajo
    Given el trabajador inició sesión en la aplicación
    When se encuentre en la sección principal
    Then no visualizará solicitudes de trabajo

  Scenario: El trabajador actualiza la sección principal
    Given el trabajador se encuentra en la sección principal
    When actualice la aplicación
    Then visualizará nuevas solicitudes de trabajo