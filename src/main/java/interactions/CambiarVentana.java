package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

import java.util.Set;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class CambiarVentana implements Interaction {

    public static CambiarVentana uno() {
        return Tasks.instrumented(CambiarVentana.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String currentWindow = getDriver().getWindowHandle();
        Set<String> allWindows = getDriver().getWindowHandles();
        for (String window : allWindows) {
            if (!window.contentEquals(currentWindow)) {
                getDriver().switchTo().window(window);
                break;
            }
        }
    }
}
