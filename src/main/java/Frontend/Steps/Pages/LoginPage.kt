package Frontend.Steps.Pages

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebDriverException
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory
import java.lang.Thread.sleep

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
        println("Вводим логин " + login)
        try {
            loginField!!.sendKeys(login)
        }
        catch (e: WebDriverException) {
            sleep(1000)
            loginField!!.sendKeys(login)
        }
    }

    fun fillPassword(password: String){
        println("Вводим пароль " + password)
        try {
            passwordField!!.sendKeys(password)
        }
        catch (e: WebDriverException) {
            sleep(1000)
            passwordField!!.sendKeys(password)
        }
    }

    fun clickLoginButton(){
        println("Кликаем на кнопку войти")
        try {
            sleep(3000)
            loginButton?.click()
        }
        catch (e: WebDriverException) {
            sleep(1000)
            loginButton?.click()
        }
    }


    init {
        PageFactory.initElements(driver, this)
    }
}