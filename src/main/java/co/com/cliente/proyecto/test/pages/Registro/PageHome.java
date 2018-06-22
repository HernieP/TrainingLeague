package co.com.cliente.proyecto.test.pages.Registro;

import co.com.cliente.proyecto.test.business.InternalAction;
import org.openqa.selenium.By;
import org.openqa.selenium.HasCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageHome {

    @FindBy (how = How.XPATH, using = "/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")
    private WebElement btnRegister;


    public void clickRegister(InternalAction internalAction) {
       try {
           if (internalAction.isElementPresent(btnRegister)) ;

           internalAction.click(btnRegister);
       }catch (Exception e){

           System.out.println("EL elemento no esta presente y deberia estarlo");
           internalAction.closeAndQuitTest();
       }
    }
}
