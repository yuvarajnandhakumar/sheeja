$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/CreateAccount.feature");
formatter.feature({
  "name": "ThermoFisher",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@createaccfeature"
    }
  ]
});
formatter.scenario({
  "name": "CreateAccount",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@createaccfeature"
    },
    {
      "name": "@createaccountscenario"
    }
  ]
});
formatter.step({
  "name": "click createAccount",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef.click_createAccount()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy12.click(Unknown Source)\r\n\tat commonMethod.CommonAction.click(CommonAction.java:77)\r\n\tat StepDefinition.StepDef.click_createAccount(StepDef.java:16)\r\n\tat ✽.click createAccount(src/test/resources/Feature/CreateAccount.feature:8)\r\n",
  "status": "failed"
});
});