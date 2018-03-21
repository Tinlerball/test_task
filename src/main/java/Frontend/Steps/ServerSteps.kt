package Frontend.Steps

import Frontend.Steps.Pages.DeletePage
import Frontend.Steps.Pages.ServerPage
import org.openqa.selenium.WebDriver
import java.lang.Thread.sleep

class ServerSteps(driver: WebDriver) {

    var serverPage = ServerPage(driver!!)
    var deletePage = DeletePage(driver!!)
    fun createServer(){
        serverPage.clickCreateServerButton()
        sleep(10000)
        serverPage.clickSubmitCreateButton()
    }

    fun deleteServer(){
        serverPage.clickServer()
        sleep(10000)
        serverPage.deleteServer()
        sleep(10000)
        deletePage.clickAcceptCheckBox()
        sleep(10000)
        deletePage.fillServerName()
        sleep(10000)
        deletePage.deleteServer()
    }
}