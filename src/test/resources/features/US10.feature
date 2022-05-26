Feature: Como cliente quiero visualizar mi perfil para ver los datos que he ingresado.
  Scenario: Visualizacion de datos con exito
    Given el cliente ingresa a la aplicacion
    When el cliente se encuentre en la seccion de su perfil
    Then el cliente visualiza sus datos
    
  Scenario: Visualizacion de datos incorrectos
    Given el cliente ingresa a la aplicacion
    When el cliente se encuentre en la seccion de su perfil
    And el cliente ha ingresado informacion erronea
    Then el cliente visualiza datos incorrectos
    
  Scenario: Visualizacion de datos sin conexion a internet
    Given el cliente ingresa a la aplicacion
    When el cliente se encuentre en la seccion de su perfil
    And el cliente no cuenta con conexion a internet
    Then el cliente no visualiza sus datos