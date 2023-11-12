package step_definitions;

import io.cucumber.java.en.Given;

import support.page_object.CancelledPage;

public class CancelledSteps {
    CancelledPage cancelledPage = new CancelledPage();


    @Given("Grocery order cancelled")
    public void shouldPartialCancelGroceryOrderWithoutDiscountProvisionNegative() {
        cancelledPage.shouldCancelledOrderWithDiscount();
    }

}
