package steps;

import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageobject.LocalizadoresDemoblazeCarrito;

import java.util.concurrent.TimeUnit;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;


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
        try {
            //Ponemos a "Dormir" el programa durante los ms que queremos
            Thread.sleep(3 * 100);
        } catch (Exception e) {
            System.out.println(e);
        }
        getDriver().switchTo().alert().accept();

    }

    public void validacionAgragarProductoTelefono() throws InterruptedException {
        try {
            //Ponemos a "Dormir" el programa durante los ms que queremos
            Thread.sleep(3 * 100);
        } catch (Exception e) {
            System.out.println(e);
        }
       localizadoresDemoblazeCarrito.Carro.click();
        try {
            //Ponemos a "Dormir" el programa durante los ms que queremos
            Thread.sleep(3 * 100);
        } catch (Exception e) {
            System.out.println(e);
        }
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
        try {
            //Ponemos a "Dormir" el programa durante los ms que queremos
            Thread.sleep(3 * 100);
        } catch (Exception e) {
            System.out.println(e);
        }
        getDriver().switchTo().alert().accept();

        }

    public void validarAgregarProductoOrdenadores(){
       localizadoresDemoblazeCarrito.Carro.click();
        try {
            //Ponemos a "Dormir" el programa durante los ms que queremos
            Thread.sleep(3 * 100);
        } catch (Exception e) {
            System.out.println(e);
        }
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
        try {
            //Ponemos a "Dormir" el programa durante los ms que queremos
            Thread.sleep(3 * 100);
        } catch (Exception e) {
            System.out.println(e);
        }
        getDriver().switchTo().alert().accept();

    }

    public void validarAgregarProductoMonitores(){
        try {
            //Ponemos a "Dormir" el programa durante los ms que queremos
            Thread.sleep(3 * 100);
        } catch (Exception e) {
            System.out.println(e);
        }

        localizadoresDemoblazeCarrito.Carro.click();
        try {
            //Ponemos a "Dormir" el programa durante los ms que queremos
            Thread.sleep(3 * 100);
        } catch (Exception e) {
            System.out.println(e);
        }
        localizadoresDemoblazeCarrito.ValidarimagenEnCarrito.containsText("Apple monitor 24");
    }


    public void ValidacionPreciotelefono() throws InterruptedException {
      localizadoresDemoblazeCarrito.Carro.click();
        try {
            //Ponemos a "Dormir" el programa durante los ms que queremos
            Thread.sleep(4 * 100);
        } catch (Exception e) {
            System.out.println(e);
        }

        String precioTotal=    localizadoresDemoblazeCarrito.PrecioTotal.getText();
        Assert.assertEquals("360", precioTotal);

    }
    public void ValidacionValorTotalMoniotr() throws InterruptedException {
        localizadoresDemoblazeCarrito.Carro.click();
        try {
            //Ponemos a "Dormir" el programa durante los ms que queremos
            Thread.sleep(4 * 100);
        } catch (Exception e) {
            System.out.println(e);
        }

        String precioTotalMOnitor=    localizadoresDemoblazeCarrito.PrecioTotal.getText();
        Assert.assertEquals("400", precioTotalMOnitor);

    }


}
