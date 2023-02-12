package assignment9.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import assignment9.resource.Customer;

public class test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(config.class);
		
		Customer obj =context.getBean("customer",Customer.class);
		obj.signUp();
		System.out.println(obj);

	}
}
