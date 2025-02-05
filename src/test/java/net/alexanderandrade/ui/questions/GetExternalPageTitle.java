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
package net.alexanderandrade.ui.questions;

import net.alexanderandrade.ui.ui.ExternalPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class GetExternalPageTitle implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(ExternalPage.PAGE_TITLE).answeredBy(actor);
    }

    public static GetExternalPageTitle mainTitle() {
        return new GetExternalPageTitle();
    }
}
