package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BuscarProductosUI {

    public static final Target PRIMER_PRODUCTO = Target.the("PRIMER PRODUCTO").located(By.xpath( "//*[@id='content']/ul/li[1]/a[2]"));
    public static final Target SEGUNDO_PRODUCTO = Target.the("SEGUNDO PRODUCTO").located(By.xpath( "//*[@id='content']/ul/li[4]/a[2]"));
    public static final Target CARRITO_COMPRAS = Target.the("CARRITO COMPRAS").located(By.xpath("//*[@id='wpmenucartli']/a/span[2]"));
    public static final Target ELIMINAR_PRODUCTO = Target.the("ELIMINAR PRODUCTOS").located(By.xpath("//*[@id='page-34']/div/div[1]/form/table/tbody/tr[1]/td[1]/a"));
    public static final Target VALOR = Target.the("VALOR").located(By.xpath("//*[@id='page-34']/div/div[1]/div[2]/div/table/tbody/tr[3]/td/strong/span"));


}
