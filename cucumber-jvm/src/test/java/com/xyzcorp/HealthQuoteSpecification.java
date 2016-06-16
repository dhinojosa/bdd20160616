package com.xyzcorp;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class HealthQuoteSpecification {
    Prospect prospect;
    int calculatedRisk;

    @Given("^a prospect$")
    public void a_prospect() throws Throwable {
        prospect = new Prospect();
    }

    @When("^all the factors are taken into consideration$")
    public void all_the_factors_are_taken_into_consideration() throws Throwable {
        calculatedRisk = prospect.getRisk();
    }

    @Then("^the quote risk should be (\\d)$")
    public void the_quote_risk_should_be(int risk) throws Throwable {
       assertEquals(risk, calculatedRisk);
    }

    @And("^a birth date of (\\d+)-(\\d+)-(\\d+)$")
    public void a_birth_date(int year, int month, int day) throws Throwable {
        prospect.setBirthDate(year, month, day);
    }

    @And("^a current date of (\\d+)-(\\d+)-(\\d+)$")
    public void a_current_date(int year, int month, int day) throws Throwable {
        prospect.setCurrentDate(year, month, day);
    }

    @And("^the health risk list is empty$")
    public void the_health_risk_list_is_empty() throws Throwable {
        //Nothing will be added
        //prospect.setHealthRisk(new ArrayList());
    }

    @And("^the health risk includes (.*)$")
    public void the_health_risk_includes(List<String> healthRisks) throws Throwable {
        throw new PendingException();
    }

    @And("^is an active smoker$")
    public void is_an_active_smoker() throws Throwable {
        throw new PendingException();
    }
}
