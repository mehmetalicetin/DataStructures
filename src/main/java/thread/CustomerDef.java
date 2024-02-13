package thread;

import java.util.ArrayList;
import java.util.List;

public class CustomerDef {
	List<Customer> customers = new ArrayList<>();
	public Customer customer(String name, int age){
		return Customer.customerOf(name, age);
	}

	public void add(Customer customer){
		customers.add(customer);
	}

	public void add(String name, int age){
		customers.add(customer(name, age));
	}
}
