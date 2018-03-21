package Frontend.Steps.Pages

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory

class DeletePage(private val driver: WebDriver) {
    @FindBy(xpath = "/html/body/div[1]/div/div/div/form/div[1]/div[3]/div/label")
    private val acceptCheckBox: WebElement? = null

    @FindBy(xpath = "/html/body/div[1]/div/div/div/form/div[1]/captcha/div/div[2]/input")
    private val nameServerField: WebElement? = null

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div/div[2]/div/div[2]")
    private val nameServerText: WebElement? = null

    @FindBy(xpath = "/html/body/div[1]/div/div/div/form/div[2]/button[1]")
    private val deleteServerButton: WebElement? = null

    fun clickAcceptCheckBox(){
        acceptCheckBox!!.click()
    }

    fun fillServerName(){
        nameServerField?.sendKeys(nameServerText?.text.toString())
    }

    fun deleteServer(){
        deleteServerButton?.click()
    }
    init {
        PageFactory.initElements(driver, this)
    }
}