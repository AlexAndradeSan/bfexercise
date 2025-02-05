/*
AlexanderAndrade.Net CONFIDENTIAL

Copyright (c) 2024. All Rights Reserved.

NOTICE: The source code contained or described herein and all documents
related to the source code ("Material") are owned by Alexander Andrade
or its companies, suppliers or licensors.

Dissemination of this information or reproduction of this material
is strictly forbidden unless prior written permission is obtained
from Alexander Andrade.
*/
package net.alexanderandrade.ui.definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import net.alexanderandrade.ui.tasks.HomeTasks;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.jetbrains.annotations.NotNull;

public class SharedStepsDefinitions {
    @Before
    public void setTheStage(Scenario scenario) {
        OnStage.setTheStage(new OnlineCast());
    }

    @After
    public void cleanUpAfterScenario(Scenario scenario) {
        OnStage.drawTheCurtain(); // This will remove the actor from the stage
    }

    @Given("{actor} is on the home page")
    public void theActorIsInTheHomePage(@NotNull Actor actor) {
        actor.wasAbleTo(HomeTasks.openHomePage());
    }
}
