$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/feature/Tags.feature");
formatter.feature({
  "line": 1,
  "name": "Amazon test",
  "description": "",
  "id": "amazon-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 235474,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "I log in to amazon",
  "description": "",
  "id": "amazon-test;i-log-in-to-amazon",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@regression"
    },
    {
      "line": 3,
      "name": "@Smoke"
    },
    {
      "line": 3,
      "name": "@e2e"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on amazon",
  "keyword": "Given "
});
formatter.match({
  "location": "TagsStepDef.i_am_on_amazon()"
});
formatter.result({
  "duration": 234450183,
  "status": "passed"
});
formatter.after({
  "duration": 58897,
  "status": "passed"
});
formatter.before({
  "duration": 89955,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "I select and Item",
  "description": "",
  "id": "amazon-test;i-select-and-item",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@regression"
    },
    {
      "line": 7,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I select an item",
  "keyword": "Given "
});
formatter.match({
  "location": "TagsStepDef.i_select_an_item()"
});
formatter.result({
  "duration": 61175,
  "status": "passed"
});
formatter.after({
  "duration": 39352,
  "status": "passed"
});
formatter.before({
  "duration": 73308,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "I add another item",
  "description": "",
  "id": "amazon-test;i-add-another-item",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@Smoke"
    },
    {
      "line": 11,
      "name": "@e2e"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "I add another item",
  "keyword": "Given "
});
formatter.match({
  "location": "TagsStepDef.i_add_another_item()"
});
formatter.result({
  "duration": 54474,
  "status": "passed"
});
formatter.after({
  "duration": 36809,
  "status": "passed"
});
formatter.before({
  "duration": 71964,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "I change quantity",
  "description": "",
  "id": "amazon-test;i-change-quantity",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@Smoke"
    },
    {
      "line": 15,
      "name": "@e2e"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "I change quanity",
  "keyword": "Given "
});
formatter.match({
  "location": "TagsStepDef.i_change_quanity()"
});
formatter.result({
  "duration": 79116,
  "status": "passed"
});
formatter.after({
  "duration": 108053,
  "status": "passed"
});
formatter.before({
  "duration": 77423,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "I add my address",
  "description": "",
  "id": "amazon-test;i-add-my-address",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@e2e"
    },
    {
      "line": 19,
      "name": "@regresison"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "I add my address",
  "keyword": "Given "
});
formatter.match({
  "location": "TagsStepDef.i_add_my_address()"
});
formatter.result({
  "duration": 75057,
  "status": "passed"
});
formatter.after({
  "duration": 55503,
  "status": "passed"
});
formatter.before({
  "duration": 84900,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "I pay for it",
  "description": "",
  "id": "amazon-test;i-pay-for-it",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 23,
      "name": "@e2e"
    },
    {
      "line": 23,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "I pay for it",
  "keyword": "Given "
});
formatter.match({
  "location": "TagsStepDef.i_pay_for_it()"
});
formatter.result({
  "duration": 79403,
  "status": "passed"
});
formatter.after({
  "duration": 64761,
  "status": "passed"
});
});