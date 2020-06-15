$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Java Selenium/CucumberFramework/FreeCrmBDDFramework/src/main/java/Features/dealsmapconcept.feature");
formatter.feature({
  "line": 1,
  "name": "Data table using Map Concept in Cucumber",
  "description": "",
  "id": "data-table-using-map-concept-in-cucumber",
  "keyword": "Feature"
});
formatter.before({
  "duration": 11516326600,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Free CRM deal test",
  "description": "",
  "id": "data-table-using-map-concept-in-cucumber;free-crm-deal-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is already on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "user enters the username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 7
    },
    {
      "cells": [
        "buddy6jar@gmail.com",
        "Buddy6jar!"
      ],
      "line": 8
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Click on submit button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user moves to deal pages",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user enters the deal details",
  "rows": [
    {
      "cells": [
        "Title",
        "Probability",
        "Amount"
      ],
      "line": 13
    },
    {
      "cells": [
        "Test1",
        "probability_test1",
        "1001"
      ],
      "line": 14
    },
    {
      "cells": [
        "Test2",
        "probability_test2",
        "1002"
      ],
      "line": 15
    },
    {
      "cells": [
        "Test3",
        "probability_test3",
        "1003"
      ],
      "line": 16
    },
    {
      "cells": [
        "Test4",
        "probability_test4",
        "1004"
      ],
      "line": 17
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "close the deal page",
  "keyword": "Then "
});
formatter.match({
  "location": "dealsWithMapStepDefinition.user_is_already_on_login_page()"
});
formatter.result({
  "duration": 172172400,
  "status": "passed"
});
formatter.match({
  "location": "dealsWithMapStepDefinition.click_on_login_button()"
});
formatter.result({
  "duration": 9289107100,
  "status": "passed"
});
formatter.match({
  "location": "dealsWithMapStepDefinition.user_enters_the_username_and_password(DataTable)"
});
formatter.result({
  "duration": 577935400,
  "status": "passed"
});
formatter.match({
  "location": "dealsWithMapStepDefinition.click_on_submit_button()"
});
formatter.result({
  "duration": 99720900,
  "status": "passed"
});
formatter.match({
  "location": "dealsWithMapStepDefinition.user_moves_to_deal_pages()"
});
formatter.result({
  "duration": 3144755100,
  "status": "passed"
});
formatter.match({
  "location": "dealsWithMapStepDefinition.user_enters_the_deal_details(DataTable)"
});
formatter.result({
  "duration": 3220738800,
  "status": "passed"
});
formatter.match({
  "location": "dealsWithMapStepDefinition.close_the_deal_page()"
});
formatter.result({
  "duration": 33800,
  "status": "passed"
});
formatter.after({
  "duration": 1081301300,
  "status": "passed"
});
});