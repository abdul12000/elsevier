$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("create_account.feature");
formatter.feature({
  "line": 1,
  "name": "As a user I want to create a new account for mendeley.com",
  "description": "",
  "id": "as-a-user-i-want-to-create-a-new-account-for-mendeley.com",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6691665333,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I am on the Create account page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I click create account link",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefintion.i_am_on_the_Create_account_page()"
});
formatter.result({
  "duration": 5389150256,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefintion.i_click_create_account_link()"
});
formatter.result({
  "duration": 172200521,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Create a new account with correct details - happy path",
  "description": "",
  "id": "as-a-user-i-want-to-create-a-new-account-for-mendeley.com;create-a-new-account-with-correct-details---happy-path",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@AutomatedScenario"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "I enter valid details as follows",
  "rows": [
    {
      "cells": [
        "field",
        "value"
      ],
      "line": 11
    },
    {
      "cells": [
        "email_address",
        "aaa20298bbbccc212@yahoo.com"
      ],
      "line": 12
    },
    {
      "cells": [
        "firstname",
        "Paul"
      ],
      "line": 13
    },
    {
      "cells": [
        "lastname",
        "Lambert"
      ],
      "line": 14
    },
    {
      "cells": [
        "password",
        "paullambert123"
      ],
      "line": 15
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I click continue button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I select a Field of study from the drop down",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I select an Academic status from the drop down",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I click on Create account button",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "\"Mendeley Feed\" page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefintion.i_enter_correct_details_as_follows(DataTable)"
});
formatter.result({
  "duration": 1573983987,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefintion.i_click_continue_button()"
});
formatter.result({
  "duration": 42649028,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefintion.i_select_a_Field_of_study_from_the_drop_down()"
});
formatter.result({
  "duration": 772396646,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefintion.i_select_an_Academic_status_from_the_drop_down()"
});
formatter.result({
  "duration": 153123235,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefintion.i_click_on_Create_account_button()"
});
formatter.result({
  "duration": 54663748,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mendeley Feed",
      "offset": 1
    }
  ],
  "location": "Stepdefintion.page_is_displayed(String)"
});
formatter.result({
  "duration": 6278027587,
  "status": "passed"
});
formatter.after({
  "duration": 4459092899,
  "status": "passed"
});
});