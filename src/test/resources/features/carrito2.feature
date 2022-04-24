# language: es

  Característica: funcionalidad del carrito de compra version 2
@regresion
    Escenario:compra de un producto version 2
      Dado que la web esta operativa
      Cuando  se generar el numero de targeta
      Y seleciona la cantidad "1"
      Y  realiza la compra del producto
      E ingresa los datos dela targeta
      Y pagar el producto
      Entonces  validar el mensaje de pago "Payment successfull!"

@smoke
    Esquema del escenario: :compra de un producto con varias cantidades version 2
      Dado que la web esta operativa
      Cuando  se generar el numero de targeta
      Y seleciona la cantidad "<cantidad>"
      Y  realiza la compra del producto
      E ingresa los datos dela targeta
      Y pagar el producto
      Entonces  validar el mensaje de pago "<mensaje>"
      Ejemplos: tabla  de cantidades
      |cantidad|mensaje|
      |2|Payment successfull!|
      |3|Payment successfull!|
      |7|Payment fail|



