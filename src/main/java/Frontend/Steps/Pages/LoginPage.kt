package Frontend.Steps.Pages

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory
import kotlin.math.log

class LoginPage(private val driver: WebDriver) {
    @FindBy(xpath = "//*[@id=\"login-user\"]/div/form/div[3]/div[1]/input")
    private val loginField: WebElement? = null

    @FindBy(xpath = "//*[@id=\"login-user\"]/div/form/div[3]/div[2]/div[1]/input")
    private val passwordField: WebElement? = null

    @FindBy(xpath = "//*[@id=\"login-user\"]/div/form/div[3]/div[3]/button")
    private val loginButton: WebElement? = null

    fun open(){
        driver.get("https://vscale.io/panel")
    }

    fun fillLogin(login: String){
        loginField!!.sendKeys(login)
    }

    fun fillPassword(password: String){
        passwordField!!.sendKeys(password)
    }

    fun clickLoginButton(){
        loginButton?.click()
    }


    init {
        PageFactory.initElements(driver, this)
    }
}