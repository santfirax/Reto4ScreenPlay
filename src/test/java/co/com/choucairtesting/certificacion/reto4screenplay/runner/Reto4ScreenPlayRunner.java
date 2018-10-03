package co.com.choucairtesting.certificacion.reto4screenplay.runner;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
@CucumberOptions(features = "src/test/resources/features/reto_4_screenplay.feature",
        glue = "co.com.choucairtesting.certificacion.reto4screenplay.stepdefinitions",
        tags ="@successFullCase" )
@RunWith(CucumberWithSerenity.class)
public class Reto4ScreenPlayRunner {
}
