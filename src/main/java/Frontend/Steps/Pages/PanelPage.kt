package Frontend.Steps.Pages

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory

class PanelPage(private val driver: WebDriver) {

    fun open(){
        driver.get("https://vscale.io/login")
    }

    @FindBy(xpath = "//*[@id=\"state_base.scalets.list\"]/div[2]/div/div[1]/div/div/div[1]/div[2]/button")
    private val createServerButton: WebElement? = null

    fun clickCreateServerButton(){
        createServerButton?.click()
    }

    init {
        PageFactory.initElements(driver, this)
    }
}