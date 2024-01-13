package help;

import com.aventstack.extentreports.Status;
import org.example.helpers.ScreenShotHelper;
import org.example.pages.HelpPage;
import org.example.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import setup.BaseTest;

import java.io.IOException;

public class HelpTest extends BaseTest {
    @Test(description = "Seleccionar el apartado de preguntas frecuentes")
    public void helpSection() throws InterruptedException, IOException {
        //Hacer click en el boton de ayuda
        HomePage homePage = new HomePage(driver);
        homePage.clickOnHelpSection();
        Thread.sleep(3000);
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "Se despliega el apartado de ayuda");

        //Comprobar texto
        HelpPage helpPage = new HelpPage(driver);
        Assert.assertEquals(helpPage.getHelpText(), "¿Necesitas ayuda?");
    }
}
