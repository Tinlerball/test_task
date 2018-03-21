import Frontend.Steps.LoginSteps
import Frontend.Steps.Pages.DeletePage
import Frontend.Steps.Pages.ServerPage
import Frontend.Steps.Pages.SuccesCreateServerPage
import Frontend.Steps.ServerSteps
import org.testng.annotations.Test

import java.lang.Thread.sleep

class test : TestBase() {
    @Test
    fun createServer() {
        val loginSteps = LoginSteps(driver!!)
        val serverPage = ServerPage(driver!!)
        val successCreateServerPage = SuccesCreateServerPage(driver!!)
        val serverSteps = ServerSteps(driver!!)
        val deletePage = DeletePage(driver!!)

        loginSteps.login("", "")
        serverPage.clickCreateServerButton()
        serverPage.clickSubmitCreateButton()
        successCreateServerPage.checkSuccessText()
        serverSteps.checkLoginAndPassword()
        successCreateServerPage.clickReturnToMainPageButton()
        serverSteps.checkStatusServer("Устанавливается")
        sleep(3000)
        serverPage.refresh()
        serverSteps.checkStatusServer("Запущен")
        serverPage.clickServer()
        serverPage.deleteServer()
        deletePage.clickAcceptCheckBox()
        deletePage.fillServerName()
        deletePage.deleteServer()
        serverSteps.checkStatusServer("Удалён")
        serverPage.refresh()
        serverSteps.checkThatZeroServers()
    }
}