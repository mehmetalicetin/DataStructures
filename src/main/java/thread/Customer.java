package thread;

public class Customer {
	private String name;
	private int age;

	private Address address;

	public static Customer customerOf(String name, int age) {
		Customer customer = new Customer();
		customer.name = name;
		customer.age = age;
		return customer;
	}

	@Override
	public String toString() {
		return "Customer{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
