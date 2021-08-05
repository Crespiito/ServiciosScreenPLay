Feature: administrar el proceso de generacion de token, creacion, autenticacion, consulta y eliminacion de cuentas
  Yo Como usuario de Tools QA
  quiero administrar el proceso de generacion de token, creacion, autenticacion, consulta y eliminacion de cuentas
  para validar el consumo exitoso de un servicio

  @ObtenerToken
  Scenario Outline: ObtenerToken exitosa de una cuenta
    Given el usuario carga la informacion de la url
      |url   | usuario   | contrasena   | respuestaEsperada |
      |<url> | <usuario> | <contrasena> | <respuestaEsperada>|
    When el ingresa los datos para Obtener Token
    Then el obtiene una respuesta de generacion de token exitosa
    Examples: Datos de autenticacion
      | url                                      | usuario        | contrasena | respuestaEsperada |
      | /Account/v1/GenerateToken | PruebaServicio | Prueba123* | 200               |
      | /Account/v1/GenerateToken | PruebaServicio | Prueba123* | 200               |