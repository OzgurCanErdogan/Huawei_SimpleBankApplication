package service;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.ObjectWriter;
import model.Currency;
import model.Exchange;

@Service
public class CurrencyService {

	ObjectMapper mapper = new ObjectMapper();
	
	public Currency getCurrencies(String base) throws IOException {
		Currency result = mapper.readValue(new URL("https://api.exchangeratesapi.io/latest?base="+base), Currency.class);
		Exchange[] temp = new Exchange[33];
		int i =0;
		String[] rateBase = new String[33];
	    double[] rateRate = new double[33];
		for(String key: result.getRates().keySet()) {
			rateBase[i] = key;
			rateRate[i] = result.getRates().get(key);
			i++;
		}
		i=0;
		result.setRateBase(rateBase);
		result.setRateRate(rateRate);
		//result.setMoneyType(temp);
		return result;
	}
	
}
