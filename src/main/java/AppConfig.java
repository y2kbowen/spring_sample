import com.y2kbowen.repository.CustomerRepository;
import com.y2kbowen.repository.HibernateCustomerRepositoryImpl;
import com.y2kbowen.service.CustomerService;
import com.y2kbowen.service.CustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.y2kbowen"})
public class AppConfig {


  //  @Bean(name="customerService")
  //  public CustomerService getCustomerService() {
        // CustomerServiceImpl service = new CustomerServiceImpl(getCustomerRepository());

       // CustomerServiceImpl service = new CustomerServiceImpl();
        // service.setCustomerRepository(getCustomerRepository());
      //  return service;

   // }

//    @Bean(name="customerRepository")
    // public CustomerRepository getCustomerRepository() {
//        return new HibernateCustomerRepositoryImpl();
    //}

}
