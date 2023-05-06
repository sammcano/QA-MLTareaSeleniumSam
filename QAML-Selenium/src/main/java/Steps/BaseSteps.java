package Steps;
import org.openqa.selenium.WebDriver;


public class BaseSteps {
public WebDriver webDriver;

public BaseSteps(WebDriver driver){
    this.webDriver = driver;
}

public String getURLActual(){
    return webDriver.getCurrentUrl();
}

public String getTituloActual(){
    return webDriver.getTitle();
}

public void cerrarVentana(){
    webDriver.close();
}

public String getCodigoFuente(){
    return webDriver.getPageSource();
}

public void finalizarWebDriver(){
    webDriver.quit();
}

public void imprimir(String cadenaImprimir){
    System.out.println(cadenaImprimir);
}

}
