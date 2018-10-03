package co.com.choucairtesting.certification.reto4screenplay.task;

import co.com.choucairtesting.certification.reto4screenplay.model.ReportData;
import co.com.choucairtesting.certification.reto4screenplay.questions.Working;
import co.com.choucairtesting.certification.reto4screenplay.userinterface.TimeReport;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static java.lang.Thread.sleep;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.List;

public class Report implements Task {
    private List<ReportData> reportData;

    public Report(List<ReportData> reportData) {
        this.reportData = reportData;
    }

    public static Report newActivitiesOfTheDay(List<ReportData> reportData) {
        return Tasks.instrumented(Report.class,reportData);
    }

    @Override
    public <T extends Actor> void performAs(T Santiago) {
        try {

            sleep(7000);
            Santiago.attemptsTo(Click.on(TimeReport.DATE_FIELD));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Santiago.should(seeThat(Working.day()));
        Santiago.attemptsTo(Click.on(TimeReport.NEW_DAY));
        Santiago.attemptsTo(Click.on(TimeReport.GLASSES_BUTTON));
        Santiago.attemptsTo(Click.on(TimeReport.PROYECT_NAME));
        //Santiago.attemptsTo(Enter.theValue(reportData.get(0).getProyectName()).into(TimeReport.PROYECT_NAME).thenHit(Keys.ENTER));
    }
}
