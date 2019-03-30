import com.y2kbowen.service.CustomerService;
import com.y2kbowen.service.CustomerServiceImpl;

public class Application {

    public static void main(String[] args) {
        CustomerService service = new CustomerServiceImpl();


        System.out.println(service.findAll().get(0).getFirstname());

    }
}
