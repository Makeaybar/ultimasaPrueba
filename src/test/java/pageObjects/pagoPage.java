package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import support.util;

public class pagoPage extends util {
    @FindBy(id="card_nmuber") protected WebElement txttargeta;
    @FindBy(id="month") protected WebElement cmbmes;
    @FindBy(id="year") protected WebElement cmbanio;
    @FindBy(id="cvv_code") protected WebElement txtcvv;
    @FindBy(name="submit") protected WebElement btnpagar;

    public pagoPage() {
        PageFactory.initElements(driver,this);
    }
    public void escribirNroTargeta(String texto){
        wait.until(ExpectedConditions.visibilityOf(txttargeta));
        txttargeta.sendKeys(texto);

    }
    public void seleccionarMes(String mes){
        new Select(cmbmes).selectByVisibleText(mes);
    }

    public void seleccionarAnio(String anio){
        new Select(cmbanio).selectByVisibleText(anio);
    }
    public void seleccionarCVV(String texto){
        txtcvv.sendKeys(texto);
    }
    public void clickPagar(){
        btnpagar.click();
    }

}
