package Frontend.Steps.Pages

import org.hamcrest.MatcherAssert
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebDriverException
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory

class SuccesCreateServerPage(private val driver: WebDriver) {
    @FindBy(xpath = "//*[@id=\"scalet_created_modal\"]/div[1]/div[2]/div/div")
    private val successMessageText: WebElement? = null

    @FindBy(xpath = "//*[@id=\"scalet_created_modal\"]/div[3]/button[1]")
    private val returnToMainPageButton: WebElement? = null

    @FindBy(xpath = "//*[@id=\"scalet_created_modal\"]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div[1]")
    private val loginText: WebElement? = null

    @FindBy(xpath = "//*[@id=\"scalet_created_modal\"]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div[2]")
    private val passwordText: WebElement? = null

    fun checkSuccessText(){
        println("Проверяем, что на странице есть текст \"Сервер устанавливается\"")
        try {
            MatcherAssert.assertThat("на странице нет текста \"Сервер устанавливается\"",
                    successMessageText?.text.toString() == "Сервер устанавливается")
        }
        catch (e: WebDriverException) {
            Thread.sleep(100000)
            MatcherAssert.assertThat("на странице нет текста \"Сервер устанавливается\"",
                    successMessageText?.text.toString() == ("Сервер устанавливается"))
        }
    }

    fun loginText() : WebElement?{
        return loginText
    }

    fun passwordText() : WebElement?{
        return passwordText
    }

    fun clickReturnToMainPageButton(){
        try {
            returnToMainPageButton?.click()
        }
        catch (e: WebDriverException) {
            Thread.sleep(1000)
            returnToMainPageButton?.click()
        }
    }
    init {
        PageFactory.initElements(driver, this)
    }

}