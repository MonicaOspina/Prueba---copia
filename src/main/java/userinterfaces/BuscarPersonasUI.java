package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BuscarPersonasUI {
    public static final Target PAGINA_PRINCIPAL = Target.the("Pagina principal").located(By.xpath("//button[@class='modal-prehome-fenix-header-info-button-home btn-modal']"));
    public static final Target NUESTRAS_MARCAS = Target.the("Nuestars Marcas").located(By.xpath( "(//li[@class='items-level-one'])[2]"));
    public static final Target BANCOLOMBIA = Target.the("Bancolombia").located(By.xpath("(//a[contains(text(), 'Bancolombia')])[2]"));
    public static final Target PERSONAS = Target.the("personas").located(By.xpath("//a[@id='header-personas']"));
    public static final Target SOLICITAR_PRODUCTOS = Target.the("solicitar productos").located(By.xpath("//a[@id='header-solicitud-productos']"));
    public static final Target INVERSIONES = Target.the("solicitar productos").located(By.xpath("//a[@id='filtro-inversiones' and contains(text(), 'Inversiones')]"));
    public static final Target FLECHA = Target.the("flecha").located(By.xpath("//span[@class='icon-arrow2-down icon-bco posicion-filtro pr-2 active']"));
    public static final Target MONTO_MINIMO = Target.the("monto mínimo").located(By.xpath("//a[contains(text(), 'Monto mínimo de $500.000')]"));
    public static final Target CONOCE_MAS = Target.the("conoce mas").located(By.xpath("(//a[contains(text(), 'Conoce más')])[1]"));
    public static final Target DOCUMENTOS = Target.the("documentos").located(By.xpath("//a[@href= '#tab4']"));
    public static final Target PDF = Target.the("pdf").located(By.xpath("//button[@class= 'c-download-rules']"));
}
