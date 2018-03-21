package Frontend.Steps.Pages

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebDriverException
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory
import java.lang.Thread.sleep

class ServerPage(private val driver: WebDriver) {
    @FindBy(xpath = "//*[@id=\"state_base.scalets.list\"]/div[2]/div/div[1]/div/div/div[1]/div[2]/button")
    private val createServerButton: WebElement? = null

    @FindBy(xpath = "//*[@id=\"new-scalet-form\"]/div[4]/div[6]/button[1]")
    private val submitCreateServerButton: WebElement? = null

    @FindBy(xpath = "//*[@id=\"state_base.scalets.list\"]/div[2]/div/div[1]/div/div/div[3]/div[1]/div")
    private val selectServer: WebElement? = null

    @FindBy(xpath = "//*[@id=\"state_base.scalets.id\"]/div[2]/div/div/div/div[2]/div/ul/li[9]")
    private val deleteServerButton: WebElement? = null

    @FindBy(className = "name")
    private val statusServer: WebElement? = null

    @FindBy(xpath = "//*[@id=\"state_base.scalets.list\"]/div[2]/div/div[1]/div/div/div[2]/div")
    private val zeroServers: WebElement? = null

    fun zeroServers(): WebElement? {
        return zeroServers
    }

    fun deleteServer(){
        deleteServerButton?.click()
    }

    fun clickServer(){
        println("Нажимаем на сервер, переходим на страницу с информацией о нём")
        try {
            selectServer?.click()
        }
        catch (e: WebDriverException){
            sleep(1000)
            selectServer?.click()
        }
    }

    fun clickCreateServerButton(){
        println("Кликаем на кнопку создать сервер")
        try {
            createServerButton?.click()
        }
        catch (e: WebDriverException){
            sleep(3000)
            createServerButton?.click()
        }
    }

    fun clickSubmitCreateButton(){
        try {
            submitCreateServerButton?.click()
            println("Подтверждаем конфигурацию")
        }
        catch (e: WebDriverException){
            sleep(3000)
            submitCreateServerButton?.click()
        }
    }

    fun statusServer(): WebElement?{
        return statusServer
    }

    fun refresh(){
        driver.navigate().refresh()
    }

    init {
        PageFactory.initElements(driver, this)
    }
}