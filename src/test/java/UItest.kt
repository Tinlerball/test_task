import Frontend.Steps.LoginSteps
import Frontend.Steps.ServerSteps
import org.testng.annotations.Test

import java.lang.Thread.sleep

class test : TestBase() {
    @Test
    fun createServer() {
        val serverSteps = ServerSteps(driver!!)
        val loginSteps = LoginSteps(driver!!)

        loginSteps.login("", "")
        sleep(6000)
        serverSteps.createServer()
    }

    @Test
    fun deleteServer(){
        val loginSteps = LoginSteps(driver!!)
        sleep(6000)
        val serverSteps = ServerSteps(driver!!)

        loginSteps.login("39728", "dJLAA0ciiP")
        serverSteps.deleteServer()
    }
}