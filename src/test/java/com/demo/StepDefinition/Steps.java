package com.demo.StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Steps {

    WebDriver driver;

    @Given("^Open the Firefox and launch the application$")
    public void openTheFirefoxAndLaunchTheApplication() {
        driver = WebDriverManager.chromedriver().create();
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/v4");
    }

    @When("^Enter the Username and Password$")
    public void enterTheUsernameAndPassword() {
        driver.findElement(By.name("uid")).sendKeys("username12");
        driver.findElement(By.name("password")).sendKeys("password12");
    }

    @Then("^Reset the credential$")
    public void resetTheCredential() {
        driver.findElement(By.name("btnReset")).click();
    }
}