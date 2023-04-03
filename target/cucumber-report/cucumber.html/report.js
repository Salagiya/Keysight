$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("products.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# It consists of functional test cases in the form of cucumber feature files written in gherkin format"
    }
  ],
  "line": 2,
  "name": "Products and services functionality",
  "description": "As a user I would like to know what products and services Keysight is providing",
  "id": "products-and-services-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 11199650300,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Verify user is able to check all products and services",
  "description": "",
  "id": "products-and-services-functionality;verify-user-is-able-to-check-all-products-and-services",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I am on Home page of Keysight site",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on Products and Services from top tab menu",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I mousehoover on software tab",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click on Test automation software",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I verify \u0027Optimize Test Plans and Increase Test Efficiency\u0027 text",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iAmOnHomePageOfKeysightSite()"
});
formatter.result({
  "duration": 176143800,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnProductsAndServicesFromTopTabMenu()"
});
formatter.result({
  "duration": 601298100,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iMousehooverOnSoftwareTab()"
});
formatter.result({
  "duration": 1155921000,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnTestAutomationSoftware()"
});
formatter.result({
  "duration": 2647437500,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iVerifyOptimizeTestPlansAndIncreaseTestEfficiencyText()"
});
formatter.result({
  "duration": 2041058200,
  "status": "passed"
});
formatter.after({
  "duration": 756535200,
  "status": "passed"
});
});