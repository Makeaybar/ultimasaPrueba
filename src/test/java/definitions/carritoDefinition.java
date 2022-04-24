package definitions;

import io.cucumber.java.es.*;
import pageObjects.*;

import java.io.IOException;

import static support.util.evidencias;

public class carritoDefinition {
    menuPage menu;
    targetaPage targeta;
    carritoPage carrito;
    pagoPage pago;
    confirmacionPage confirmacion;

    public carritoDefinition() {
        menu = new menuPage();
        targeta =new targetaPage();
        carrito= new carritoPage();
        pago= new pagoPage();
        confirmacion = new confirmacionPage();
    }

    @Dado("que la web esta operativa")
    public void queLaWebEstaOperativa() {
        Hooks.driver.get("https://demo.guru99.com/payment-gateway/purchasetoy.php");

    }

    @Cuando("se generar el numero de targeta")
    public void seGenerarElNumeroDeTargeta() throws IOException {
        menu.clickGenerarTargeta();
        menu.ventanaActiva();
        targeta.obtenerNroTargeta();
        targeta.obtenerCVV();
        targeta.obtenerFecha();
        evidencias();
        targeta.ventanaInicial();
    }

    @Y("seleciona la cantidad {string}")
    public void selecionaLaCantidad(String cantidad) throws IOException {
        carrito.seleccionarCantidad(cantidad);
        evidencias();


    }

    @Y("realiza la compra del producto")
    public void realizaLaCompraDelProducto() {
        carrito.clickComprar();
    }

    @E("ingresa los datos dela targeta")
    public void ingresaLosDatosDelaTargeta() throws IOException {
        pago.escribirNroTargeta(targetaPage.nro_targeta);
        seleccionaElMes(targetaPage.mes);
        seleccionaElAño(targetaPage.anio);
        pago.seleccionarCVV(targetaPage.cvv);
        evidencias();
        

    }

    @Y("pagar el producto")
    public void pagarElProducto() {
        pago.scrollVertical();
        pago.clickPagar();
    }

    @Entonces("validar el mensaje de pago {string}")
    public void validarElMensajeDePago(String mensaje) throws IOException {
        confirmacion.validarMensaje(mensaje);
        evidencias();
        confirmacion.mostrarCodigo();
    }

    @Y("selecciona el mes {string}")
    public void seleccionaElMes(String mes) {
        pago.seleccionarMes(mes);
    }

    @Y("selecciona el año {string}")
    public void seleccionaElAño (String anio) {
        pago.seleccionarAnio(anio);
    }

    @Entonces("validar el mensaje del cuadro de dialogo {string}")
    public void validarElMensajeDelCuadroDeDialogo(String msj) {
        pago.obtenerTextoDialogo(msj);
        pago.aceptarDialogo();

    }
}
