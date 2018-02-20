package com.ncr.serenitybdd.steps;

import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import com.ncr.serenitybdd.steps.serenity.EndUserSteps;

public class DefinitionSteps {

    @Steps
    EndUserSteps anna;

    @Given("the user is on the Wikionary home page")
    public void givenTheUserIsOnTheWikionaryHomePage() {
        //anna.is_the_home_page();
    System.out.println("the user is on the Wikionary home page");
    }

    @When("the user looks up the definition of the word '(.*)'")
    public void whenTheUserLooksUpTheDefinitionOf(String word) {
        //anna.looks_for(word);
        System.out.println("the user looks up the definition of the word");
    }

    @Then("they should see the definition '(.*)'")
    public void thenTheyShouldSeeADefinitionContainingTheWords(String definition) {
       // anna.should_see_definition(definition);
        System.out.println("they should see the definition ");
    }

}
