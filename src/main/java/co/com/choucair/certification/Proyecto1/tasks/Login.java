package co.com.choucair.certification.Proyecto1.tasks;

import co.com.choucair.certification.Proyecto1.userinterface.ChoucairLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


public class Login implements Task {
    public static Login onThePage() {
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ChoucairLoginPage.LOGIN_BUTTON),
                Enter.theValue("1095820788").into(ChoucairLoginPage.INPUT_USER),
                Enter.theValue("Choucair2020*").into(ChoucairLoginPage.INPUT_PSSWD),
                Click.on(ChoucairLoginPage.ENTER_BUTTON)
        );
    }
}