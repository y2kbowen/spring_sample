import com.y2kbowen.service.CustomerService;
import com.y2kbowen.service.CustomerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        CustomerService service = appContext.getBean("customerService",CustomerService.class);

        System.out.println(service.findAll().get(0).getFirstname());

    }
}
