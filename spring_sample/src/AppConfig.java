import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.mks.service.CustomerService;
import com.mks.service.CustomerServiceImpl;

@Configuration
@ComponentScan({"com.mks"})
public class AppConfig {

	@Bean(name = "customerService")
	@Scope("singleton")
	public CustomerService getCustomerService() {

		CustomerServiceImpl customerService = new CustomerServiceImpl();
		//customerService.setCustomerRepository(getCustomerRepository());
		return customerService;
	}
	
	/*@Bean(name = "customerRepository")
	public CustomerRepository getCustomerRepository() {

		CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();

		return customerRepository;
	}*/
}
