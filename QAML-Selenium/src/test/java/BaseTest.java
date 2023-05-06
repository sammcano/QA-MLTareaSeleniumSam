import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

public class BaseTest {
    private WebDriver webDriver;
    public WebDriver getWebDriver(){
        File ruta = new File("/Users/samanthacanorubio/Downloads/chromedriver_mac_arm64/chromedriver");
        System.setProperty("webDriver.chrome.driver", ruta.getPath());
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("--remote-allow-origins=*");
        webDriver = new ChromeDriver(options);
        return webDriver;
    }
}
