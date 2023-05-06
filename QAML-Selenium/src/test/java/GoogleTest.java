import Steps.GoogleSteps;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest{
    private WebDriver webDriver = getWebDriver();
    private GoogleSteps googleSteps = new GoogleSteps(webDriver);

    @Test
    public void openGoogleTest(){
        googleSteps.abrirPaginaGoogle();
        String urlActual = googleSteps.getURLActual();
        System.out.println("La url actual es " + urlActual);
        Assert.assertEquals(urlActual, "https://www.google.com/");
    }

    @Test
    public void titleGoogleTest(){
        googleSteps.abrirPaginaGoogle();
        String tituloActualGoogle = googleSteps.getTituloActual();
        String tituloEspereadoGoogle = "Google";
        System.out.println("El titulo de la pagina es" + tituloActualGoogle);
        Assert.assertEquals(tituloActualGoogle,tituloEspereadoGoogle);

    }

    @Test
    public void imprimirCodigoFuenteGoogle(){
        googleSteps.abrirPaginaGoogle();
        String codigoFuenteGoogle = googleSteps.getCodigoFuente();
        System.out.println("El codigo fuente es" + codigoFuenteGoogle);
        //Assert.assertTrue(codigoFuenteGoogle.contains(" "));
        // no supe como hacer el assert aqui porque el codigo fuente estaba muy largo para compararlo :P

    }


    @Test
    public void metodoNavigateTest(){
        String urlExpected = "https://www.google.com/";
        googleSteps.abrirPaginaGoogle();
        String urlActual = googleSteps.getURLActual();
        googleSteps.imprimir(urlActual);
        Assert.assertEquals(urlActual,urlExpected);

        String tituloExpectedFace = "Facebook - Inicia sesión o regístrate";
        googleSteps.abrirPaginaFacebook();
        String facebookTitulo = googleSteps.getTituloActual();
        googleSteps.imprimir(facebookTitulo);
        Assert.assertEquals(facebookTitulo, tituloExpectedFace);

        googleSteps.navegarPaginaESPN();
        String urlESPN = googleSteps.getURLActual();
        String urlEsperada = "https://www.espn.com.mx/";
        googleSteps.imprimir(urlESPN);
        Assert.assertEquals(urlESPN,urlEsperada);

        webDriver.navigate().back();
        googleSteps.imprimir(facebookTitulo);
        Assert.assertEquals(facebookTitulo, tituloExpectedFace);

        googleSteps.finalizarWebDriver();
    }
}
