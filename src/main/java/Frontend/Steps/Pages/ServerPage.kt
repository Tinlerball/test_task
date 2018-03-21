package Frontend.Steps.Pages

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory

class ServerPage(private val driver: WebDriver) {
    @FindBy(xpath = "//*[@id=\"state_base.scalets.list\"]/div[2]/div/div[1]/div/div/div[1]/div[2]/button")
    private val createServerButton: WebElement? = null

    @FindBy(xpath = "//*[@id=\"new-scalet-form\"]/div[4]/div[6]/button[1]")
    private val submitCreateServerButton: WebElement? = null

    @FindBy(xpath = "//*[@id=\"state_base.scalets.list\"]/div[2]/div/div[1]/div/div/div[3]/div[1]/div")
    private val selectServer: WebElement? = null

    @FindBy(xpath = "//*[@id=\"state_base.scalets.id\"]/div[2]/div/div/div/div[2]/div/ul/li[9]")
    private val deleteServerButton: WebElement? = null

    fun deleteServer(){
        deleteServerButton?.click()
    }

    fun clickServer(){
        selectServer?.click()
    }

    fun clickCreateServerButton(){
        createServerButton?.click()
    }

    fun clickSubmitCreateButton(){
        submitCreateServerButton?.click()
    }

    init {
        PageFactory.initElements(driver, this)
    }
}