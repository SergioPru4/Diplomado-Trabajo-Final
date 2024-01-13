package product;

import com.aventstack.extentreports.Status;
import org.example.helpers.ScreenShotHelper;
import org.example.pages.HomePage;
import org.example.pages.ProductPage;
import org.example.pages.SeccionPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import setup.BaseTest;

import java.io.IOException;

public class ProductTest extends BaseTest {
    String backPack = "Mochila para Moto Mottion L";
    String backPack2 = "Mochila Tamulo";

    @Test(description = "Buscar un producto y verificar que se encuentre en la busqueda")
    public void searchProduct() throws InterruptedException, IOException {
        //Hacer click en el boton de buscar
        HomePage homePage = new HomePage(driver);
        homePage.clickOnSearch();
        Thread.sleep(3000);
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "Despliega el campo de busqueda");

        //Ingresar el nombre del producto
        homePage.setSearchText(backPack);
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "Se ingresa el nombre del producto");

        //Presionar enter a la busqueda
        homePage.enter();
        Thread.sleep(3000);
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "Se realiza la busqueda");

        //Verificar busqueda
        String searchResult=homePage.getSearchName(backPack);
        Assert.assertEquals(searchResult, backPack);
    }

    @Test(description = "Selecionar una catgoria, ordenarla, buscar un producto, agregarlo al carrito y verificar que se encuentre em el carrito")
    public void productAddCart() throws InterruptedException, IOException {
        //Seleccionar la categoria de mochilas
        HomePage homePage = new HomePage(driver);
        homePage.clickOnSeccion("Mochilas");
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "Se selecciona la categoria de mochilas");

        //Hacer click en el boton de ordenar
        SeccionPage seccionPage = new SeccionPage(driver);
        seccionPage.clickOnSort();

        //Hacer click en la categoria de Z-A
        seccionPage.clickOnCategory("Z - A");
        Thread.sleep(3000);
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "Se ordena los productos de Z-A");

        //Seleccionar una mochila
        ProductPage productPage = new ProductPage(driver);
        productPage.clickOnProduct(backPack2);
        Thread.sleep(3000);
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "Muestra el producto seleccionado");

        //Preciona el boton de agregar al carrito
        productPage.clickOnBuyButton();
        Thread.sleep(3000);
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "Agrega a carrito el producto seleccionado");

        //Cierra el pop up
        productPage.clickOnClose();
        Thread.sleep(3000);

        //Ir a la pagina principal
        homePage.clickOnReturnButton();
        Thread.sleep(3000);
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "Retorna a la pagina principal");

        //Verificar carrito
        homePage.clickOnCart();
        Thread.sleep(3000);
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "Muestra el carrito de compras");

        //Obtener el nombre del producto
        String name = homePage.getCartText();
        Assert.assertTrue(name.contains(backPack2));
    }

    @Test(description = "Seleccionar un producto")
    public void selectProduct() throws InterruptedException, IOException {
        //Seleccionar la categoria de mochilas
        HomePage homePage = new HomePage(driver);
        homePage.clickOnSeccion("Mochilas");
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "Se selecciona la categoria de mochilas");

        //Hacer click en el boton de ordenar
        SeccionPage seccionPage = new SeccionPage(driver);
        seccionPage.clickOnSort();

        //Hacer click en la categoria de Z-A
        seccionPage.clickOnCategory("Z - A");
        Thread.sleep(3000);
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "Se ordena los productos de Z-A");

        //Seleccionar una mochila
        ProductPage productPage = new ProductPage(driver);
        productPage.clickOnProduct(backPack2);
        Thread.sleep(3000);
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "Muestra el producto seleccionado");

        productPage.clickOnBuyButton();

        //Obtener el nombre del producto
        String name = homePage.getCartText();
        Assert.assertTrue(name.contains(backPack2));
    }

    @Test(description = "Seleccionar un producto agregando otras caracteristicas")
    public void selectProductWithMoreThings() throws InterruptedException, IOException {
        String var = "Ropa";
        String clothe = "Camiseta M Dusti";

        //Seleccionar la categoria de ropa
        HomePage homePage = new HomePage(driver);
        homePage.clickOnSeccion(var);
        Thread.sleep(100);
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "Se selecciona la categoria de ropa");

        //Hacer click en el boton de ordenar
        SeccionPage seccionPage = new SeccionPage(driver);
        seccionPage.clickOnSort();

        //Hacer click en la categoria de menor precio
        seccionPage.clickOnCategory("Menor Precio");
        Thread.sleep(3000);
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "Se ordena los productos por menor precio");

        //Seleccionar una prenda
        ProductPage productPage = new ProductPage(driver);
        productPage.clickOnProduct(clothe);
        Thread.sleep(3000);
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "Muestra el producto seleccionado");

        //Seleciona el color
        productPage.clickOnColor();
        Thread.sleep(3000);
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "Muestra el producto seleccionado con el color");

        //Seleciona la talla
        productPage.clickOnSize();
        Thread.sleep(3000);
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "Muestra el producto seleccionado con la talla");

        //Preciona el boton de agregar al carrito
        productPage.clickOnBuyButton();
        Thread.sleep(3000);
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "Agrega a carrito el producto seleccionado");

        //Obtener el nombre del producto
        String name = homePage.getCartText();
        Assert.assertTrue(name.contains(clothe));
    }
}
