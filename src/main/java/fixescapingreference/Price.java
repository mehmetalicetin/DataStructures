package fixescapingreference;

import java.util.Collection;
import java.util.Collections;
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

  public Double convert(String toCurrency){
    if(toCurrency.equalsIgnoreCase("USD")){
      return value;
    }else {
      Double conversion = rates.get("USD") / rates.get(toCurrency);
      return conversion * value;
    }
  }

  public Double getRates(String toCurrency) {
    return rates.get(toCurrency);
  }

  @Override
  public String toString() {
    return "Price{" + "rates=" + rates + ", value=" + value + '}';
  }
}
