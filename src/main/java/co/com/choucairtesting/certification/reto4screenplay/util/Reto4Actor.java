package co.com.choucairtesting.certification.reto4screenplay.util;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class Reto4Actor {
    @Managed(driver="chrome")
    private WebDriver hisBrowser;
    private Actor Santiago = Actor.named("Santiago");

    public WebDriver getHisBrowser() {
        return hisBrowser;
    }

    public Actor getSantiago() {
        return Santiago.whoCan(BrowseTheWeb.with(hisBrowser));
    }
}
