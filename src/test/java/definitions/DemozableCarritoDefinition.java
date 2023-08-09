package definitions;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.PageObjetoDemoblaseCarrito;

public class DemozableCarritoDefinition {
    @Steps
    PageObjetoDemoblaseCarrito pageObjetoDemoblaseCarrito;

    @Given("^que estoy en la pagina$")
    public void queEstoyEnLaPagina() throws InterruptedException {
        pageObjetoDemoblaseCarrito.iniciarPagina();

    }

    @Then("^puedo validar que estoy en la pagina correcta$")
    public void puedoValidarQueEstoyEnLaPaginaCorrecta() {
        pageObjetoDemoblaseCarrito.TituloPagina();
    }

    @When("^selecciono la categoria telefono y clic en el producto$")
    public void seleccionoLaCategoriaTelefonoYClicEnElProducto() throws InterruptedException {
        pageObjetoDemoblaseCarrito.AgregarProductoCategoriaTefono();

    }

     @Then("^vere en el carrito de compra el producto agregado$")
    public void vereEnElCarritoDeCompraElProductoAgregado() throws InterruptedException {
            pageObjetoDemoblaseCarrito.validacionAgragarProductoTelefono();

    }

    @When("^en la categoria Ordenadores portatiles y clic en el producto$")
    public void enLaCategoriaOrdenadoresPortatilesYClicEnElProducto() throws InterruptedException {
        pageObjetoDemoblaseCarrito.AgregarProductoCategoriaOrdenadores();
    }


    @Then("^en el carrito vere el producto agregado$")
    public void enElCarritoVereElProductoAgregado() {
        pageObjetoDemoblaseCarrito.validarAgregarProductoOrdenadores();
    }

    @When("^en la categoria monitores y clic en el producto$")
    public void enLaCategoriaMonitoresYClicEnElProducto() throws InterruptedException {
        pageObjetoDemoblaseCarrito.AgregarProductoCategoriamonitores();
    }

    @Then("^vere el producto agregado en el carrito$")
    public void vereElProductoAgregadoEnElCarrito() {
        pageObjetoDemoblaseCarrito.validarAgregarProductoMonitores();
    }


    @When("^en la categoria telefono agrego un celuarl al carrito$")
    public void enLaCategoriaTelefonoAgregoUnCeluarlAlCarrito() throws InterruptedException {
        pageObjetoDemoblaseCarrito.AgregarProductoCategoriaTefono();
    }

    @Then("^en el carrito puedo ver el precio a pagar$")
    public void enElCarritoPuedoVerElPrecioAPagar() throws InterruptedException {
        pageObjetoDemoblaseCarrito.ValidacionPreciotelefono();
    }

    @When("^En la  categoria MOnitor agrego un monitor al carrito$")
    public void enLaCategoriaMOnitorAgregoUnMonitorAlCarrito() throws InterruptedException {
        pageObjetoDemoblaseCarrito.AgregarProductoCategoriamonitores();

    }

    @Then("^en el carrito vere el valor total a pagar del monitor$")
    public void enElCarritoVereElValorTotalAPagarDelMonitor() throws InterruptedException {
        pageObjetoDemoblaseCarrito.ValidacionValorTotalMoniotr();
    }
}
