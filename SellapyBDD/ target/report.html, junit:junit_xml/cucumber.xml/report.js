$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AdminLogin.feature");
formatter.feature({
  "line": 1,
  "name": "Sellapy Admin Login",
  "description": "",
  "id": "sellapy-admin-login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Verify the admin login",
  "description": "",
  "id": "sellapy-admin-login;verify-the-admin-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User enters correct URL",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enters correct \"adegbuyifred@gmail.com\" and \"developmentteam\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Click sign In",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User should login successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "AdminLogin.user_enters_correct_URL()"
});
formatter.result({
  "duration": 7762382964,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "adegbuyifred@gmail.com",
      "offset": 21
    },
    {
      "val": "developmentteam",
      "offset": 50
    }
  ],
  "location": "AdminLogin.user_enters_correct_and(String,String)"
});
formatter.result({
  "duration": 498602046,
  "status": "passed"
});
formatter.match({
  "location": "AdminLogin.click_sign_In()"
});
formatter.result({
  "duration": 41003231,
  "status": "passed"
});
formatter.match({
  "location": "AdminLogin.user_should_login_successfully()"
});
formatter.result({
  "duration": 4047204289,
  "status": "passed"
});
formatter.match({
  "location": "AdminLogin.user_close_the_browser()"
});
formatter.result({
  "duration": 153233610,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Verify Add Product feature in backend",
  "description": "",
  "id": "sellapy-admin-login;verify-add-product-feature-in-backend",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "User click on product feature",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "User click on add product",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "User clicks on select categories and choose a category",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User clicks on select subcategories and choose a subcategory",
  "keyword": "And "
});
formatter.match({
  "location": "AdminLogin.user_click_on_product_feature()"
});
formatter.result({
  "duration": 12002660884,
  "status": "passed"
});
formatter.match({
  "location": "AdminLogin.user_click_on_add_product()"
});
formatter.result({
  "duration": 2035641566,
  "status": "passed"
});
formatter.match({
  "location": "AdminLogin.user_clicks_on_select_categories_and_choose_a_category()"
});
formatter.result({
  "duration": 3099860933,
  "status": "passed"
});
formatter.match({
  "location": "AdminLogin.user_clicks_on_select_subcategories_and_choose_a_subcategory()"
});
formatter.result({
  "duration": 2394436651,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 16,
  "name": "Add product fields",
  "description": "",
  "id": "sellapy-admin-login;add-product-fields",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 17,
  "name": "User is already on add product field",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "User enters \"\u003cproductName\u003e\", \"\u003cdescription\u003e\", \"\u003cspecification\u003e\", \"\u003csize\u003e\" and \"\u003ccolor\u003e\"",
  "keyword": "When "
});
formatter.examples({
  "line": 20,
  "name": "",
  "description": "",
  "id": "sellapy-admin-login;add-product-fields;",
  "rows": [
    {
      "cells": [
        "productName",
        "description",
        "specification",
        "size",
        "color"
      ],
      "line": 21,
      "id": "sellapy-admin-login;add-product-fields;;1"
    },
    {
      "cells": [
        "naijashirt",
        "traditional",
        "male fashion",
        "L",
        "White"
      ],
      "line": 22,
      "id": "sellapy-admin-login;add-product-fields;;2"
    },
    {
      "cells": [
        "naijaskirt",
        "traditional",
        "female fashion",
        "M",
        "Red"
      ],
      "line": 23,
      "id": "sellapy-admin-login;add-product-fields;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 22,
  "name": "Add product fields",
  "description": "",
  "id": "sellapy-admin-login;add-product-fields;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 17,
  "name": "User is already on add product field",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "User enters \"naijashirt\", \"traditional\", \"male fashion\", \"L\" and \"White\"",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4
  ],
  "keyword": "When "
});
formatter.match({
  "location": "AdminLogin.user_is_already_on_add_product_field()"
});
formatter.result({
  "duration": 17972169212,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "naijashirt",
      "offset": 13
    },
    {
      "val": "traditional",
      "offset": 27
    },
    {
      "val": "male fashion",
      "offset": 42
    },
    {
      "val": "L",
      "offset": 58
    },
    {
      "val": "White",
      "offset": 66
    }
  ],
  "location": "AdminLogin.user_enters_and(String,String,String,String,String)"
});
formatter.result({
  "duration": 1678400706,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "Add product fields",
  "description": "",
  "id": "sellapy-admin-login;add-product-fields;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 17,
  "name": "User is already on add product field",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "User enters \"naijaskirt\", \"traditional\", \"female fashion\", \"M\" and \"Red\"",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4
  ],
  "keyword": "When "
});
formatter.match({
  "location": "AdminLogin.user_is_already_on_add_product_field()"
});
formatter.result({
  "duration": 17846533470,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "naijaskirt",
      "offset": 13
    },
    {
      "val": "traditional",
      "offset": 27
    },
    {
      "val": "female fashion",
      "offset": 42
    },
    {
      "val": "M",
      "offset": 60
    },
    {
      "val": "Red",
      "offset": 68
    }
  ],
  "location": "AdminLogin.user_enters_and(String,String,String,String,String)"
});
formatter.result({
  "duration": 1460959076,
  "status": "passed"
});
});