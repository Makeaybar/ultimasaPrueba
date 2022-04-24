package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class confirmacionPage extends util {
    @FindBy(xpath = "//*[text()='Order ID']//preceding:: h2")protected WebElement lblmensaje;
    @FindBy(xpath ="//*[text()='Order ID']//following::strong[1]" )protected WebElement lblcodigo;

    public confirmacionPage() {
        PageFactory.initElements(driver,this);

    }

    public void validarMensaje(String mensaje){
        wait.until(ExpectedConditions.visibilityOf(lblmensaje));
        Assert.assertEquals(mensaje,lblmensaje.getText());

        }
        public void mostrarCodigo(){
        System.out.println(lblcodigo.getText());
        }
    }

