package co.com.choucairtesting.certification.reto4screenplay.questions;

import co.com.choucairtesting.certification.reto4screenplay.userinterface.TimeReport;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Working implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor Santiago) {
        return Text.of(TimeReport.WORKING_DAY_FIELD).viewedBy(Santiago).asString().contains("Laboral");
    }

    public static Working day() {
        return new Working();
    }
}
