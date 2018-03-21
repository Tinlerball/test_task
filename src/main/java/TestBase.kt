import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.testng.annotations.AfterTest
import java.util.concurrent.TimeUnit
import org.testng.annotations.BeforeTest

abstract class TestBase {

    lateinit var driver: WebDriver
        private set

    @BeforeTest
    fun setup() {
        System.setProperty("webdriver.chrome.driver",
                "drivers\\chromedriver.exe")
        driver = ChromeDriver()
        driver?.manage()?.timeouts()?.implicitlyWait(10, TimeUnit.SECONDS)
    }

    @AfterTest
    fun driverClose() {
        driver?.close()
    }
}