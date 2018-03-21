package Frontend.Steps

import Frontend.Steps.Pages.DeletePage
import Frontend.Steps.Pages.ServerPage
import Frontend.Steps.Pages.SuccesCreateServerPage
import org.hamcrest.MatcherAssert
import org.hamcrest.MatcherAssert.assertThat
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebDriverException
import java.lang.Thread.sleep

class ServerSteps(driver: WebDriver) {

    var serverPage = ServerPage(driver!!)
    var succesCreateServerPage = SuccesCreateServerPage(driver!!)

    fun checkLoginAndPassword(){
        println("Проверяем, что на странице есть логин и пароль")
        assertThat("Не отображается логин или пароль ", succesCreateServerPage.loginText()?.text != null && succesCreateServerPage.passwordText()?.text != null)
    }

    fun checkStatusServer(status: String){
        println("Проверяем статус сервера")
        try {
            sleep(10000)
            assertThat("Статус сервера не равен \"" + status + "\"", serverPage.statusServer()?.text.toString().equals(status))
        }
        catch (e: WebDriverException) {
            sleep(6000)
            assertThat("Статус сервера не равен \"" + status + "\"", serverPage.statusServer()?.text.toString().equals(status))
        }
    }

    fun checkThatZeroServers(){
        try {
            assertThat("Сервер не удалился", serverPage.zeroServers()!!.isDisplayed)

        }
        catch (e: WebDriverException) {
            sleep(9000)
            assertThat("Сервер не удалился", serverPage.zeroServers()!!.isDisplayed)
        }
    }

}