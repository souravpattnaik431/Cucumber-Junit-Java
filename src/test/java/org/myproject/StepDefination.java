package org.myproject;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objects.Application;

import java.util.List;

public class StepDefination {

    @Given("User is on <application> page")
    public void user_is_on_landing_page(Application application) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User is on page :"+application.getApplicationType());
    }

    @When("User login with username {string} and password {string}")
    public void user_login_with_username_and_password(String userName, String passWord) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User login with "+userName+" and "+passWord);
    }

    @Then("Home page is displayed {string}")
    public void home_page_is_displayed(String string) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Home page displayed "+string);
    }
    @Then("Cards are displayed {string}")
    public void cards_are_displayed(String string) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Cards are displayed "+string);
    }

    @When("User sign up with the following details")
    public void user_sign_up_with_the_following_details(DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        List<List<String>> dataValues= dataTable.asLists();
        System.out.println(dataValues.get(0).get(0));
        System.out.println(dataValues.get(0).get(1));
        System.out.println(dataValues.get(0).get(2));
        System.out.println(dataValues.get(0).get(3));
        System.out.println(dataValues.get(0).get(4));
    }

    @When("User login with username {string} and password {string} parameters")
    public void user_login_with_username_and_password_parameters(String userName, String passWord) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User login with "+userName+" and "+passWord);
    }

    @Given("User is on creditcard Page")
    public void user_is_on_creditcard_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User is on credi card page");
    }
    @When("User selects Axis bak")
    public void user_selects_axis_bak() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User selects axis bank");
    }
    @Then("Transaction perform successfully for axis bank")
    public void transaction_perform_successfully_for_axis_bank() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Transaction performed for axis bank");
    }
    @When("User selects hdfc bak")
    public void user_selects_hdfc_bak() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User selects hdfc bank");
    }
    @Then("Transaction perform successfully for hdfc bank")
    public void transaction_perform_successfully_for_hdfc_bank() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Transaction performed for hdfc bank");
    }

    @Given("User is on System")
    public void user_is_on_system() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User is on System");;
    }
    @When("User selects browser")
    public void user_selects_browser() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User selects browser");
    }

    @Then("Browser opened successfully")
    public void browser_is_opened() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Browser is opened successfully");
    }

    @When("clears browser cookies")
    public void clears_browser_cookies() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("clears browser cookies");
    }
    @Then("it doesn't get hang")
    public void it_doesn_t_get_hang() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("it doesn't get hang");
    }
    @Given("user having valid creditials")
    public void user_having_valid_creditials() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user having valid creditials");
    }
    @Given("user having credit card")
    public void user_having_credit_card() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user having credit card");
    }

    @Given("he doesn't have any credit card")
    public void he_doesn_t_have_any_credit_card() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("he doesn't have any credit card");
    }



    @Given("User is on {application} page")
    public void user_is_on_browser_page(Application application) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user is on :"+application.getApplicationType());
    }
    @When("User added {int} product(s) to cart")
    public void user_product_to_cart(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User added "+ int1);
    }
    @Then("mobile is bought")
    public void mobile_is_bought() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("mobile is bought");


    }






}
