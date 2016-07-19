$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("loginuser.feature");
formatter.feature({
  "id": "login-user",
  "description": "",
  "name": "Login User",
  "keyword": "Feature",
  "line": 1
});
formatter.background({
  "description": "",
  "name": "",
  "keyword": "Background",
  "line": 3,
  "type": "background"
});
formatter.step({
  "name": "I am on the Home page",
  "keyword": "Given ",
  "line": 4
});
formatter.step({
  "name": "click my Account button",
  "keyword": "When ",
  "line": 5
});
formatter.step({
  "name": "I see a welcome message",
  "keyword": "Then ",
  "line": 6
});
formatter.match({
  "location": "commonStep.I_am_on_the_Home_page()"
});
formatter.result({
  "duration": 17425289451,
  "status": "passed"
});
formatter.match({
  "location": "commonStep.click_my_Account_button()"
});
formatter.result({
  "duration": 3139633459,
  "status": "passed"
});
formatter.match({
  "location": "commonStep.I_see_a_welcome_message()"
});
formatter.result({
  "duration": 1068577315,
  "status": "passed"
});
formatter.scenario({
  "id": "login-user;user-should-log-in-successfully;;2",
  "tags": [
    {
      "name": "@signin",
      "line": 8
    }
  ],
  "description": "",
  "name": "User should log in successfully",
  "keyword": "Scenario Outline",
  "line": 18,
  "type": "scenario"
});
formatter.step({
  "name": "I enter maxwell174@gmail.com in email field",
  "keyword": "When ",
  "line": 10,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "I enter password123 in password field",
  "keyword": "And ",
  "line": 11,
  "matchedColumns": [
    1
  ]
});
formatter.step({
  "name": "I click Login button",
  "keyword": "And ",
  "line": 12
});
formatter.step({
  "name": "I am logged in",
  "keyword": "Then ",
  "line": 13
});
formatter.step({
  "name": "I log out",
  "keyword": "And ",
  "line": 14
});
formatter.match({
  "arguments": [
    {
      "val": "maxwell174@gmail.com",
      "offset": 8
    }
  ],
  "location": "loginuserStep.enterUsername(String)"
});
formatter.result({
  "duration": 1402604006,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "password123",
      "offset": 8
    }
  ],
  "location": "loginuserStep.enterPassword(String)"
});
formatter.result({
  "duration": 354847320,
  "status": "passed"
});
formatter.match({
  "location": "loginuserStep.I_click_Login_button()"
});
formatter.result({
  "duration": 3493046799,
  "status": "passed"
});
formatter.match({
  "location": "loginuserStep.I_am_logged_in()"
});
formatter.result({
  "duration": 2073957148,
  "status": "passed"
});
formatter.match({
  "location": "commonStep.I_log_out()"
});
formatter.result({
  "duration": 723893934,
  "status": "passed"
});
});