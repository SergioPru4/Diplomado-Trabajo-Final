package seccion;

import com.aventstack.extentreports.Status;
import org.example.helpers.ScreenShotHelper;
import org.example.pages.HomePage;
import org.example.pages.SeccionPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import setup.BaseTest;

import java.io.IOException;


public class SeccionTest extends BaseTest {

    @Test(description = "Seleccionar la seccion de mochilas")
    public void seccionBackPack() throws InterruptedException, IOException {
        String var = "Mochilas";

        //Seleccionar la categoria de mochilas
        HomePage homePage = new HomePage(driver);
        homePage.clickOnSeccion(var);
        Thread.sleep(100);
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "Se selecciona la categoria de mochilas");

        //Hacer click en el boton de ordenar
        SeccionPage seccionPage = new SeccionPage(driver);
        seccionPage.clickOnSort();

        //Hacer click en la categoria de Z-A
        seccionPage.clickOnCategory("Z - A");
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "Se ordena los productos de la Z-A");

        //Obtener el nombre de la categoria
        String categoryName = seccionPage.getCategoryName(var);
        Assert.assertEquals(categoryName, var);
    }

    @Test(description = "Seleccionar la seccion de accesorios")
    public void seccionAccessories() throws InterruptedException, IOException {
        String var = "Accesorios";

        //Seleccionar la categoria de accesorios
        HomePage homePage = new HomePage(driver);
        homePage.clickOnSeccion(var);
        Thread.sleep(100);
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "Se selecciona la categoria de accesorios");

        //Hacer click en el boton de ordenar
        SeccionPage seccionPage = new SeccionPage(driver);
        seccionPage.clickOnSort();

        //Hacer click en la categoria de mayor precio
        seccionPage.clickOnCategory("Mayor Precio");
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "Se ordena los productos por mayor precio");

        //Obtener el nombre de la categoria
        String categoryName = seccionPage.getCategoryName(var);
        Assert.assertEquals(categoryName, var);
    }

    @Test(description = "Seleccionar la seccion de ropa")
    public void seccionClothes() throws InterruptedException, IOException {
        String var = "Ropa";

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
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "Se ordena los productos por menor precio");

        //Obtener el nombre de la categoria
        String categoryName = seccionPage.getCategoryName(var);
        Assert.assertEquals(categoryName, var);
    }
    @Test(description = "Seleccionar la seccion de viaje")
    public void seccionJourney() throws InterruptedException, IOException {
        String var = "Viaje";

        //Seleccionar la categoria de viaje
        HomePage homePage = new HomePage(driver);
        homePage.clickOnSeccion(var);
        Thread.sleep(100);
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "Se selecciona la categoria de viaje");

        //Hacer click en el boton de ordenar
        SeccionPage seccionPage = new SeccionPage(driver);
        seccionPage.clickOnSort();

        //Hacer click en la categoria de mejores valoraciones
        seccionPage.clickOnCategory("Mejores valoraciones");
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "Se ordena los productos por mejores valoraciones");

        //Obtener el nombre de la categoria
        String categoryName = seccionPage.getCategoryName(var);
        Assert.assertEquals(categoryName, var);
    }
    @Test(description = "Seleccionar la seccion de bolsos")
    public void seccionHandbags() throws InterruptedException, IOException {
        String var = "Bolsos";

        //Seleccionar la categoria de bolsos
        HomePage homePage = new HomePage(driver);
        homePage.clickOnSeccion(var);
        Thread.sleep(100);
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "Se selecciona la categoria de bolsos");

        //Hacer click en el boton de ordenar
        SeccionPage seccionPage = new SeccionPage(driver);
        seccionPage.clickOnSort();

        //Hacer click en la categoria por fecha de lanzamiento
        seccionPage.clickOnCategory("Fecha de lanzamiento");
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "Se ordena los productos por fecha de lanzamiento");

        //Obtener el nombre de la categoria
        String categoryName = seccionPage.getCategoryName(var);
        Assert.assertEquals(categoryName, var);
    }

}
