$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Ecentennial Login feature file",
  "description": "",
  "id": "ecentennial-login-feature-file",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3995493588,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Validate login credentials",
  "description": "",
  "id": "ecentennial-login-feature-file;validate-login-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Ecentennial"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user launch ecentennial",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters credentials",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user logged into the site",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginGlue.login()"
});
formatter.result({
  "duration": 1287055389,
  "status": "passed"
});
formatter.match({
  "location": "LoginGlue.enterCredential()"
});
formatter.result({
  "duration": 1202003937,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 34998,
  "status": "passed"
});
});