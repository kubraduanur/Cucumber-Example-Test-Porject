package step_definitions;

import io.cucumber.java.en.Given;

import support.page_object.DeliveredPage;

public class DeliveredSteps {

    DeliveredPage deliveredPage = new DeliveredPage();


    @Given("Grocery order delivered")
    public void shouldPartialCancelGroceryOrderWithoutDiscountProvisionNegative() {
        deliveredPage.shouldDeliveredOrderWithDiscount();
    }
}
