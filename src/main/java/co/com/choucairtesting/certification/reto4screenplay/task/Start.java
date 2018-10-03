package co.com.choucairtesting.certification.reto4screenplay.task;

import co.com.choucairtesting.certification.reto4screenplay.model.LoginInformation;
import co.com.choucairtesting.certification.reto4screenplay.userinterface.MaxTime;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;

import java.util.List;

public class Start implements Task {
    public Start(List<LoginInformation> loginInformation) {
        this.loginInformation = loginInformation;
    }

    private List<LoginInformation> loginInformation;
    private MaxTime maxTime = new MaxTime();

    @Override
    public <T extends Actor> void performAs(T Santiago) {
        Santiago.attemptsTo(Open.browserOn(maxTime));
        Santiago.attemptsTo(Enter.theValue(loginInformation.get(0).getUser()).into(MaxTime.USER_FIELD));
        Santiago.attemptsTo(Enter.theValue(loginInformation.get(0).getPassword()).into(MaxTime.PASSWORD_FIELD));
        Santiago.attemptsTo(Click.on(MaxTime.LOG_IN_BUTTON));
        //Santiago.attemptsTo(Click.on(MaxTime.TIME_REPORT));
    }

    public static Start maxTime(List<LoginInformation> loginInformation) {
       return Tasks.instrumented(Start.class,loginInformation);
    }
}
