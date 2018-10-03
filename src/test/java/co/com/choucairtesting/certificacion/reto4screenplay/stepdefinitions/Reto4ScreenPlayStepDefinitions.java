package co.com.choucairtesting.certificacion.reto4screenplay.stepdefinitions;

import co.com.choucairtesting.certification.reto4screenplay.model.LoginInformation;
import co.com.choucairtesting.certification.reto4screenplay.model.ReportData;
import co.com.choucairtesting.certification.reto4screenplay.task.Report;
import co.com.choucairtesting.certification.reto4screenplay.task.Start;
import co.com.choucairtesting.certification.reto4screenplay.util.Reto4Actor;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

public class Reto4ScreenPlayStepDefinitions extends Reto4Actor {
    @Given("^Santiago as a test analyst$")
    public void santiago_as_a_test_analyst(List<LoginInformation> loginInformation)  {
        getSantiago().wasAbleTo(Start.maxTime(loginInformation));

    }

    @When("^Santiago wants to perform the report of his activies of Maxtime$")
    public void santiago_wants_to_perform_the_report_of_his_activies_of_Maxtime(List<ReportData> reportData) {
        getSantiago().attemptsTo(Report.newActivitiesOfTheDay(reportData));
    }

    @Then("^to fullfill the task that his must carry out daily$")
    public void to_fullfill_the_task_that_his_must_carry_out_daily()  {

    }
}
