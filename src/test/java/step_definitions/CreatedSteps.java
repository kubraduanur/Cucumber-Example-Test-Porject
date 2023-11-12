package step_definitions;



import io.cucumber.java.en.Given;
import mpapi.test.BaseTest;
import support.page_object.CreatedPage;


public class CreatedSteps extends BaseTest {

    CreatedPage createdPage = new CreatedPage();


    @Given("Grocery order created")
    public void shouldPartialCancelGroceryOrderWithoutDiscountProvisionNegative() {
        createdPage.shouldCreatedOrderWithDiscount();
    }

}
