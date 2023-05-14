import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;
import org.junit.Assert;



@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/Features", glue= {"StepDefinitions"})
public class Test_Runner {
	
	 private String input;
	    private String output;

	    @Given("I have a string {string}")
	    public void iHaveAString(String input) {
	        this.input = input;
	    }

	    @When("I reverse the string")
	    public void iReverseTheString() {
	        StringBuilder builder = new StringBuilder(input);
	        output = builder.reverse().toString();
	    }

	    @Then("I should get {string}")
	    public void iShouldGet(String expectedOutput) {
	        Assert.assertEquals(expectedOutput, output);
	    }

}
