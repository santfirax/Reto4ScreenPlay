package co.com.choucairtesting.certification.reto4screenplay.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("http://www.choucairtesting.com:18000/MaxTimeCHC/Login.aspx")
public class MaxTime extends PageObject {
    public static final Target USER_FIELD = Target.the("user name field").locatedBy("//*[@id='Logon_v0_MainLayoutEdit_xaf_l30_xaf_dviUserName_Edit_I']");
    public static final Target PASSWORD_FIELD = Target.the("password field").locatedBy("//*[@id='Logon_v0_MainLayoutEdit_xaf_l35_xaf_dviPassword_Edit_I']");
    public static final Target LOG_IN_BUTTON = Target.the("log in button").located(By.id("Logon_PopupActions_Menu_DXI0_T"));
    public static final Target TIME_REPORT = Target.the("time report").locatedBy("//*[@id='Vertical_NC_NB_I0i0_']");
}
