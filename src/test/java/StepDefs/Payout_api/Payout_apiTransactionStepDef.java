package StepDefs.Payout_api;

import StepDefs.BaseStepDef;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Payout_apiTransactionStepDef extends BaseStepDef {


    @When("Verify get balance")
    public void verifyGetBalance() {
        payoutapi.getToken();
        payoutapi.getBalance();
    }
    @When("Verify VPA is required")
    public void verifyVPAIsRequired() {
        payoutapi.getToken();
        payoutapi.verifyVPArequired();
    }

    @When("Verify bank acc number is required")
    public void verifyBankAccNumberIsRequired() {
        payoutapi.getToken();
//        payoutapi.verifyBankAccIfscRequired();
    }

    @When("Verify IMPS payout required fields")
    public void verifyIMPSPayoutRequiredFields() {
        payoutapi.getToken();
        payoutapi.verifyImpsPayoutRequiredFields();
    }

    @When("Send IMPS payout request")
    public void sendIMPSPayoutRequest() {
        payoutapi.sendImpsPayoutRequest();
    }


    @When("Make Transaction Fail Success")
    public void makeTransactionFailSuccess() {
        payoutapi.makeTransactionSuccesFail();
    }

    @Then("Verify Transaction status")
    public void verifyTransactionStatus() {
        payoutapi.verifyTransactionStatus();
    }

    @When("Verify transaction not found")
    public void verifyTransactionNotFound() {
        payoutapi.txnNotFountGetStatus();
    }

    @When("Verify required fields get status")
    public void verifyRequiredFieldsGetStatus() {
        payoutapi.verifyInvalidMid();
    }

    @When("Send UPI payout request")
    public void sendUPIPayoutRequest() {
        payoutapi.sendUpiPayoutRequest();
    }

    @When("Verify Order Id already Exists")
    public void verifyOrderIdAlreadyExists() {
        payoutapi.verifyOrderIdAlreadyExists();
    }
}
