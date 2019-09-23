$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/CreateAccount.feature");
formatter.feature({
  "line": 2,
  "name": "Create an Account and Add Items to wishlist",
  "description": "As a user\r\nI want to be able to create account and login\r\nSo that I can add items of choice to my wishlist.",
  "id": "create-an-account-and-add-items-to-wishlist",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.before({
  "duration": 1280355,
  "status": "passed"
});
formatter.before({
  "duration": 8882220067,
  "status": "passed"
});
formatter.background({
  "line": 8,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 9,
  "name": "I am on the autoPractice Page",
  "keyword": "Given "
});
formatter.match({
  "location": "CreateAccountSteps.iAmOnTheAutoPracticePage()"
});
formatter.result({
  "duration": 144787271,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Create an Account and Login",
  "description": "",
  "id": "create-an-account-and-add-items-to-wishlist;create-an-account-and-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "I click on the login button",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I enter required details for account creation",
  "rows": [
    {
      "cells": [
        "Field",
        "Value"
      ],
      "line": 14
    },
    {
      "cells": [
        "Customer First Name",
        "customer firstName"
      ],
      "line": 15
    },
    {
      "cells": [
        "Customer Last Name",
        "customer lastName"
      ],
      "line": 16
    },
    {
      "cells": [
        "Customer Password",
        "customer password"
      ],
      "line": 17
    },
    {
      "cells": [
        "Address Line 1",
        "address line1"
      ],
      "line": 18
    },
    {
      "cells": [
        "City",
        "customer city"
      ],
      "line": 19
    },
    {
      "cells": [
        "State",
        "customer state"
      ],
      "line": 20
    },
    {
      "cells": [
        "PostCode",
        "customer postcode"
      ],
      "line": 21
    },
    {
      "cells": [
        "Country",
        "customer country"
      ],
      "line": 22
    },
    {
      "cells": [
        "Mobile Phone",
        "mobile no"
      ],
      "line": 23
    },
    {
      "cells": [
        "Address Alias",
        "address alias"
      ],
      "line": 24
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I should be able to successfully create an account with \"customer firstName\" displayed at the top page",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "I should be navigated to \"my account\" page",
  "keyword": "And "
});
formatter.match({
  "location": "CreateAccountSteps.iClickOnTheLoginButton()"
});
formatter.result({
  "duration": 1376335055,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccountSteps.iEnterRequiredDetailsForAccountCreation(DataTable)"
});
formatter.result({
  "duration": 9438547384,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "customer firstName",
      "offset": 57
    }
  ],
  "location": "CreateAccountSteps.iShouldBeAbleToSuccessfullyCreateAnAccountWithDisplayedAtTheTopPage(String)"
});
formatter.result({
  "duration": 85653293,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "my account",
      "offset": 26
    }
  ],
  "location": "CreateAccountSteps.iShouldBeNavigatedToPage(String)"
});
formatter.result({
  "duration": 8389479,
  "status": "passed"
});
formatter.after({
  "duration": 117069,
  "status": "passed"
});
});