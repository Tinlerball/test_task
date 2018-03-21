import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.testng.annotations.AfterTest
import java.util.concurrent.TimeUnit
import org.testng.annotations.BeforeTest
import java.net.URI


abstract class TestBase {

    lateinit var driver: WebDriver
        private set

    @BeforeTest
    fun setup() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\mikhailovra\\Downloads\\test\\drivers\\" + "chromedriver.exe")
        driver = ChromeDriver()
        driver?.manage()?.timeouts()?.implicitlyWait(10, TimeUnit.SECONDS)
//        driver?.manage()?.window()?.maximize()
    }

    @AfterTest
    fun driverClose() {
        driver?.close();
    }
}