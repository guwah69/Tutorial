package com.cucumber.ShopTest;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(
		format = {"pretty", "html:target/html/"},
		features = "src/test/resource",
		tags = {" @signin"})
public class RunnerTest {

}
