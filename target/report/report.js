$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:features/test.feature");
formatter.feature({
  "name": "A description",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "A scenario",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User navigate to \"http://automationpractice.com/\" using \"\u003cbrowser\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "User selects a \"\u003ccategory\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User select a \"\u003ctype of dress\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User select a new \"\u003cdress\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User add \"\u003cdress\u003e\" to cart",
  "keyword": "And "
});
formatter.step({
  "name": "User checks the purchase in the cart",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "browser",
        "category",
        "type of dress",
        "dress"
      ]
    },
    {
      "cells": [
        "CHROME",
        "DRESSES",
        "EVENING DRESSES",
        "Printed Dress"
      ]
    }
  ]
});
formatter.scenario({
  "name": "A scenario",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User navigate to \"http://automationpractice.com/\" using \"CHROME\"",
  "keyword": "Given "
});
formatter.match({
  "location": "HomepageStep.java:24"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User selects a \"DRESSES\"",
  "keyword": "When "
});
formatter.match({
  "location": "DressesStep.java:11"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select a \"EVENING DRESSES\"",
  "keyword": "And "
});
formatter.match({
  "location": "TypeOfDressesStep.java:12"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select a new \"Printed Dress\"",
  "keyword": "And "
});
formatter.match({
  "location": "ChoiceDressesStep.java:11"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User add \"Printed Dress\" to cart",
  "keyword": "And "
});
formatter.match({
  "location": "AddToCartStep.java:11"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User checks the purchase in the cart",
  "keyword": "Then "
});
formatter.match({
  "location": "ShoppingCartSummaryStep.java:11"
});
formatter.result({
  "status": "passed"
});
});