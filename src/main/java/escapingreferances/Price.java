package escapingreferances;

import java.util.HashMap;
import java.util.Map;

public class Price {
  private Map<String, Double> rates;
  private Double value;

  public Price(Double value) {
    this.value = value;
    this.rates = new HashMap<>();
    rates.put("USD", 1d);
    rates.put("GBP",0.6);
    rates.put("EUR", 0.8);
  }

  //TODO: WE appear to be mutating value in a get method.
  public Double convert(String toCurrency){
    if(toCurrency.equalsIgnoreCase("USD")){
      return value;
    }else {
      Double conversion = rates.get("USD") / rates.get(toCurrency);
      value = conversion * value;
      return value;
    }
  }

  //TODO: Definitely an escaping reference.
  public Map<String, Double> getRates() {
    return rates;
  }

  @Override
  public String toString() {
    return "Price{" + "rates=" + rates + ", value=" + value + '}';
  }
}
