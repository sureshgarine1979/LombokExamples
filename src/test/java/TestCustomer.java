import com.qa.lombok.Customer;
import org.testng.annotations.Test;

public class TestCustomer {
    @Test
    public void printCustomerInfo()
    {
        Customer customer = new Customer("Suresh",45,"Seattle",true,"10-1-1980");
        System.out.println(customer.toString());
        Customer customer1 = new Customer();

        customer1.setName("Ujwal");
        customer1.setAge(15);
        System.out.println(customer1.toString());
    }
}
