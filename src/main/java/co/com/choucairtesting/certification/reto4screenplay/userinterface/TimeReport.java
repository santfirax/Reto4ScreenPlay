package co.com.choucairtesting.certification.reto4screenplay.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class TimeReport {

    public static final Target DATE_FIELD = Target.the("date field").locatedBy("//*[@id='Vertical_v1_LE_v2_tccell0_0']/table/tbody/tr/td/span");
    public static final Target WORKING_DAY_FIELD = Target.the("working day field").locatedBy("//*[@id='Vertical_v3_MainLayoutView_xaf_l59_xaf_dviLaboral_View']/tbody/tr/td[2]/label");
    public static final Target NEW_DAY = Target.the("new day").located(By.cssSelector("#Vertical_v3_MainLayoutView_xaf_l103_xaf_dviReporteDetallado_ToolBar_Menu_DXI0_T > a"));
    public static final Target GLASSES_BUTTON = Target.the("glasses button").located(By.cssSelector("#Vertical_v6_MainLayoutEdit_xaf_l128_xaf_dviProyecto_Edit_Find_BImg"));
    public static final Target PROYECT_NAME = Target.the("proyect name field").located(By.xpath("//*[@id='Dialog_v7_LE_v8_tccell1_0']/table/tbody/tr/td/"));
}
