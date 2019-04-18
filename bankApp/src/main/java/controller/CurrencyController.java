package controller;

import java.io.IOException;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import model.Currency;
import service.CurrencyService;;


@RestController
@RequestMapping("/currency")
public class CurrencyController {
	
	@Autowired
	CurrencyService cs;
	
	@GetMapping("/{base}")
	@CrossOrigin(origins = "http://localhost:3000")
	public Currency getCurrencyResults(@PathVariable("base") String base) throws IOException {
		return cs.getCurrencies(base);
	}
}
