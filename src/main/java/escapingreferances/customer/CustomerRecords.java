package escapingreferances.customer;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CustomerRecords implements Iterable{
  private Map<String, Customer> records;

  public CustomerRecords() {
    this.records = new HashMap<>();
  }

  public void addCustomer(Customer customer){
    this.records.put(customer.getName(), customer);
  }

  public Map<String, Customer> getCustomers(){
    return Collections.unmodifiableMap(this.records);
  }
  @Override
  public Iterator iterator() {
    return records.values().iterator();
  }

  public CustomerReadOnly getCustomerByName(String name){
    return this.records.get(name);
  }
}
