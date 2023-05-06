package Steps;
import org.openqa.selenium.WebDriver;

public class GoogleSteps extends BaseSteps{
    public GoogleSteps (WebDriver driver){
        super(driver);
    }

    public void abrirPaginaGoogle(){
        webDriver.get("https://www.google.com");
        imprimir("Navegando a Google");
    }

    public void abrirPaginaFacebook(){
        webDriver.navigate().to("https://www.facebook.com/");
        imprimir("Navegando a Facebook");
    }

    public void navegarPaginaESPN(){
        webDriver.navigate().to("https://www.espn.com.mx/");
        imprimir("Navegando a ESPN");
    }

}
