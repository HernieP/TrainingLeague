package co.com.cliente.proyecto.test.pages.Registro;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageRegister {

    @FindBy (how = How.ID_OR_NAME,using = "gender-male" )
    private WebElement chkMale;

    @FindBy  (how = How.ID_OR_NAME,using = "FirstName")
    private WebElement inputFirstName;

    @FindBy (how = How.XPATH,using = "/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[2]/span[1]")
    private WebElement spRequired1;

    @FindBy (how = How.ID_OR_NAME,using = "LastName")
    private WebElement txtLastName;

    @FindBy (how = How.XPATH,using = "/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[3]/span[1]")
    private WebElement spRequired2;

    @FindBy (how = How.ID_OR_NAME,using = "DateOfBirthDay")
    private WebElement txtDayOfBirth;

    @FindBy (how = How.ID_OR_NAME,using = "DateOfBirthMonth")
    private WebElement txtMonthOfBirth;

    @FindBy (how = How.ID_OR_NAME,using = "DateOfBirthYear")
    private WebElement txtYearOfBirth;

    @FindBy (how = How.ID_OR_NAME,using = "Email")
    private WebElement txtEmail;

    @FindBy(how = How.XPATH,using = "/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[5]/span[1]")
    private WebElement spRequired3;

    @FindBy (how = How.ID_OR_NAME,using = "Company")
    private WebElement txtCompanyName;

    @FindBy (how = How.ID_OR_NAME,using = "Newsletter")
    private WebElement chNewsletter;

    @FindBy (how = How.ID_OR_NAME,using = "Password")
    private WebElement txtPassword;

    @FindBy (how = How.XPATH,using = "/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[4]/div[2]/div[1]/span[1]")
    private  WebElement spRequired4

    @FindBy (how = How.ID_OR_NAME,using = "ConfirmPassword")
    private WebElement txtConfirmPassword;

    @FindBy (how = How.XPATH,using = "/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[4]/div[2]/div[2]/span[1]")
    private WebElement spRequired5;

    @FindBy (how = How.ID_OR_NAME,using = "register-button")
    private WebElement btnRegister;





}


















