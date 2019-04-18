package controller;

import java.util.Hashtable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import model.User;
import service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	UserService us;
	
	@RequestMapping("/all")
	public Hashtable<String,User> getAll(){
		return us.getAll();
	}
	
	//@RequestMapping("{id}")
	@GetMapping("/{id}")
	public User getUserByTC(@PathVariable("id") String id) {
		return us.getUser(id);
	}
	
	@RequestMapping(value="/requestTransfer")
	public boolean addMoneyPost(@RequestParam(value="id") String id , @RequestParam(value="base") String base, @RequestParam(value="amount") double amount) {
		return us.addMoney(id, base, amount);
	}
	
	@PostMapping("/employees")
	public void newUser(@RequestBody User newUser) {
		us.addUser(newUser);
	}
	
}
