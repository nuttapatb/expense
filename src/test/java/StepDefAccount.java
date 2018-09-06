import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class StepDefAccount {

    Account account;
    @Before
    public void init() {
        account = new Account(0,0);

    }

    @Given("a user has (.*) for income")
    public void a_user_has_for_income(double balance){
        account.addIncome(balance);
    }

    @When("I add income amount (.*)")
    public void i_add_income_amount(double balance){
        account.addIncome(balance);
    }

    @Then("I have income amount (.*)")
    public void i_have_income_amount(double balance) {
        assertEquals(balance,account.getBalance());
    }

    @When("I pay a money amount (.*)")
    public void i_pay_money_amount(double newExpense) {
        account.payMoney(newExpense);
    }

    @Then("I have expense amount (.*)")
    public void i_have_expense_amount(double newExpense){
        assertEquals(newExpense,account.getExpense());
    }

    @When("I want to check my current income that is (.*)")
    public void i_want_to_check_my_current_income_that_is(double balance) {
        assertEquals(balance,account.getBalance());
    }

    @Then("System show my income amount (.*)")
    public void system_show_my_income_amount(double balance) {
        assertEquals(balance,account.getBalance());
    }

    @When("I want to check my current expense that is (.*)")
    public void i_want_to_check_my_current_expense_that_is(double newExpense) {
        assertEquals(newExpense,account.getExpense());
    }

    @Then("System show my current expense amount (.*)")
    public void system_show_my_current_expense_amount(double expense) {
        assertEquals(expense,account.getExpense());
    }

    @Then("a user spend (.*) for expense")
    public void a_user_spend_money_for_expense(double expense) {
        account.payMoney(expense);
    }






}
