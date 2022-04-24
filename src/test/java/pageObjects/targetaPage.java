package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;


public class targetaPage extends util {
    public static String nro_targeta;
    public static String cvv;
    public static String mes;
    public static String anio;

    @FindBy(xpath = "//*[contains(text(),'Card Number:')]") protected WebElement lnlNroTargeta;
    @FindBy(xpath = "//*[contains(text(),'CVV:')]") protected WebElement lnlcvvTargeta2;
    @FindBy(xpath = "//*[contains(text(),'Exp:')]") protected WebElement lnlexpTargeta3;

    public targetaPage() {
        PageFactory.initElements(driver,this);
    }

    public void obtenerNroTargeta(){
        wait.until(ExpectedConditions.visibilityOf(lnlNroTargeta));
        String texto =lnlNroTargeta.getText();
        System.out.println(texto);
        nro_targeta=texto.replace("Card Number:- ","");
        System.out.println(nro_targeta);
    }
    public void obtenerCVV(){
        String texto =lnlcvvTargeta2.getText();
        System.out.println(texto);
        cvv=texto.replace("CVV:-","");
        System.out.println(cvv);
    }
    public void obtenerFecha(){
        String texto =lnlexpTargeta3.getText();
        String fecha[] =texto.replace("Exp:-","").split("/");
        mes = fecha[0];
        anio =fecha[1];
        System.out.println(mes);
        System.out.println(anio);

    }
}
