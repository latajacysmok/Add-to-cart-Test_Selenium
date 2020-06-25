package com.addToCart;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty","html:target/report"}, features = "classpath:features", glue = "com.addToCart.step"
//        ,dryRun = false
)

public class RunTest {
}
