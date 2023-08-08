package steps;

import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageobject.LocalizadoresDemoblazeCarrito;

import java.util.concurrent.TimeUnit;


public class PageObjetoDemoblaseCarrito {

    LocalizadoresDemoblazeCarrito localizadoresDemoblazeCarrito;

    public void iniciarPagina() throws InterruptedException {
        localizadoresDemoblazeCarrito.open();
}

    public void TituloPagina(){
        String tituloactual=    localizadoresDemoblazeCarrito.tituloPagina.getText();
        Assert.assertEquals("PRODUCT STORE", tituloactual);

    }
    public void AgregarProductoCategoriaTefono() throws InterruptedException {

        localizadoresDemoblazeCarrito.categoriaTelefono.click();
        localizadoresDemoblazeCarrito.ImagenCategoriaTelefono.click();
        localizadoresDemoblazeCarrito.BotonAgregarAlCarrito.click();
        ThucydidesWebDriverSupport.getDriver().navigate().refresh();}

    public void validacionAgragarProductoTelefono() throws InterruptedException {
        localizadoresDemoblazeCarrito.Carro.click();
        localizadoresDemoblazeCarrito.ValidarimagenEnCarrito.containsText("samsung galaxy s6");

    }
    public void AgregarProductoCategoriaOrdenadores() throws InterruptedException {

        localizadoresDemoblazeCarrito.categoriOrdenadores.click();
        try {
            //Ponemos a "Dormir" el programa durante los ms que queremos
            Thread.sleep(3*100);
        } catch (Exception e) {
            System.out.println(e);
        }
        localizadoresDemoblazeCarrito.ImagenCategoriaOrdenadores.click();
        localizadoresDemoblazeCarrito.BotonAgregarAlCarritoOrdenadores.click();
        ThucydidesWebDriverSupport.getDriver().navigate().refresh();}

    public void validarAgregarProductoOrdenadores(){
        localizadoresDemoblazeCarrito.Carro.click();
        localizadoresDemoblazeCarrito.ValidarimagenEnCarrito.containsText("sony vaio i56");


    }
    public void AgregarProductoCategoriamonitores() throws InterruptedException {

        localizadoresDemoblazeCarrito.categoriMonitores.click();
        try {
            //Ponemos a "Dormir" el programa durante los ms que queremos
            Thread.sleep(3*100);
        } catch (Exception e) {
            System.out.println(e);
        }
        localizadoresDemoblazeCarrito.ImagenCategoriamonitore.click();
        localizadoresDemoblazeCarrito.BotonAgregarAlCarritomonitores.click();
        ThucydidesWebDriverSupport.getDriver().navigate().refresh();}

    public void validarAgregarProductoMonitores(){
        localizadoresDemoblazeCarrito.Carro.click();
        localizadoresDemoblazeCarrito.ValidarimagenEnCarrito.containsText("Apple monitor 24");


    }



}
