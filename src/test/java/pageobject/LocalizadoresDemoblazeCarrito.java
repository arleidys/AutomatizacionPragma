package pageobject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.demoblaze.com/")
public class LocalizadoresDemoblazeCarrito extends PageObject {

    @FindBy(id = "nava")
    public WebElementFacade tituloPagina;

    @FindBy(xpath = "//div[@class=\"list-group\"]/a[@onclick=\"byCat('phone')\"]")
    public WebElementFacade categoriaTelefono;

    @FindBy(xpath = "//div[@class=\"card-block\"]/h4[@class=\"card-title\"]/a[contains(text(),'Samsung galaxy s6')]")
    public WebElementFacade ImagenCategoriaTelefono;

    @FindBy(xpath = "//div[@class=\"list-group\"]/a[@onclick=\"byCat('notebook')\"]")
    public WebElementFacade categoriOrdenadores;

    @FindBy(xpath = "(//div[@class=\"card-block\"]/h4[@class=\"card-title\"]/a[contains(text(),'')])[1]")
    public WebElementFacade ImagenCategoriaOrdenadores;


    @FindBy(xpath = "//div[@class=\"col-sm-12 col-md-6 col-lg-6\"]/a[@onclick=\"addToCart(1)\"]")
    public WebElementFacade BotonAgregarAlCarrito;

    @FindBy(xpath = "//div[@class=\"list-group\"]/a[@onclick=\"byCat('monitor')\"]")
    public WebElementFacade categoriMonitores;

    @FindBy(xpath = "(//div[@class=\"card-block\"]/h4[@class=\"card-title\"]/a[contains(text(),'')])[1]")
    public WebElementFacade ImagenCategoriamonitore;


    @FindBy(xpath = "//div[@class=\"col-sm-12 col-md-6 col-lg-6\"]/a[@onclick=\"addToCart(10)\"]")
    public WebElementFacade BotonAgregarAlCarritomonitores;

    @FindBy(xpath = "//div[@class=\"col-sm-12 col-md-6 col-lg-6\"]/a[@onclick=\"addToCart(8)\"]")
    public WebElementFacade BotonAgregarAlCarritoOrdenadores;

    @FindBy(id = "cartur")
    public WebElementFacade Carro;

    @FindBy(xpath = "//table[@class =\"table table-bordered table-hover table-striped\" ]/tbody[@id=\"tbodyid\"]")
    public WebElementFacade ValidarimagenEnCarrito;


    @FindBy(xpath = "//h3[@id=\"totalp\"]")
    public  WebElementFacade PrecioTotal;

}
