# language: es
  @primerafuncionalidad
  Característica: funcionalidad del carrito de compra
@smoke
    Escenario:compra de un producto
      Dado que la web esta operativa
      Cuando  se generar el numero de targeta
      Y seleciona la cantidad "5"
      Y  realiza la compra del producto
      E ingresa los datos dela targeta
      Y pagar el producto
      Entonces  validar el mensaje de pago "Payment successfull!"

@regresion
    Esquema del escenario: :compra de un producto con varias cantidades
      Dado que la web esta operativa
      Cuando  se generar el numero de targeta
      Y seleciona la cantidad "<cantidad>"
      Y  realiza la compra del producto
      E ingresa los datos dela targeta
      Y pagar el producto
      Entonces  validar el mensaje de pago "<mensaje>"
      Ejemplos: tabla  de cantidades
      |cantidad|mensaje|
      |4|Payment successfull!|
      |6|Payment successfull!|
      |8|Payment fail|



