package Frontend.Steps.Pages

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory

class RegistrationPage(private val driver: WebDriver){
    @FindBy(xpath = "//*[@id=\"register-user\"]/div/form/div[2]")
    private val registrationText: WebElement? = null

    @FindBy(xpath = "//*[@id=\"register-user\"]/div/form/div[3]/div[1]/input")
    private val emailField: WebElement? = null

    @FindBy(xpath = "//*[@id=\"register_submit\"]")
    private val registrationButton: WebElement? = null

    @FindBy(xpath = "//*[@id=\"succ_reg_email\"]/div[1]")
    private val successRegistrationText: WebElement? = null

    fun returnRegText():String{
        return registrationText?.text.toString()
    }

    fun returnSuccessRegText():String{
        return successRegistrationText?.text.toString()
    }

    fun fillEmail(email: String){
        emailField!!.sendKeys(email)
    }

    fun clickRegistrationButton(){
        registrationButton?.click()
    }

    init {
        PageFactory.initElements(driver, this)
    }
}