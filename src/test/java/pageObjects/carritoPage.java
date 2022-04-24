package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import support.util;

public class carritoPage extends util {

    @FindBy(name="quantity") protected WebElement cnbcantidad;
    @FindBy(xpath="//input[@value='Buy Now']") protected WebElement btncomprar;

    public carritoPage() {
        PageFactory.initElements(driver,this);

    }
    public void seleccionarCantidad(String cantidad){
        wait.until(ExpectedConditions.visibilityOf(cnbcantidad));
        new Select(cnbcantidad).selectByVisibleText(cantidad);

        //new Select(cnbcantidad).selectByValue(cantidad);
        //new Select(cnbcantidad).selectByIndex(4);
    }
    public void clickComprar(){
        wait.until(ExpectedConditions.elementToBeClickable(btncomprar));
        btncomprar.click();


    }
}
