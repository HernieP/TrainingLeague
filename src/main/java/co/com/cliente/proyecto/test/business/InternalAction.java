package co.com.cliente.proyecto.test.business;

import co.com.sofka.test.gui.GeneralActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class InternalAction extends GeneralActions {

    public InternalAction(String carpeta) {
        super(carpeta);
    }

    public void selectOpcionListVisibleText(WebElement element, String visibleText) {
        Select selectBox = new Select(element);
        selectBox.selectByVisibleText(visibleText);
        this.manageTakeScreenshot();
    }
}
