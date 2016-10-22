import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mks.service.CustomerService;
import com.mks.service.CustomerServiceImpl;

public class Application {

	public static void main(String[] args) {
		
		ApplicationContext appcontext = new AnnotationConfigApplicationContext(AppConfig.class);
		CustomerService customerService = appcontext.getBean("customerService", CustomerService.class);
		
		System.out.println(customerService.findAll().get(0).getFirstName());
	}

}
