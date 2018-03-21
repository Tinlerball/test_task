package Frontend.Steps

import Frontend.Steps.Pages.LoginPage
import org.openqa.selenium.WebDriver
import java.lang.Thread.sleep


class LoginSteps (driver: WebDriver) {
    var loginPage = LoginPage(driver!!)

    fun login(login: String, password: String){
        loginPage.open()
        loginPage.fillLogin(login)
        loginPage.fillPassword(password)
        loginPage.clickLoginButton()
    }

}
