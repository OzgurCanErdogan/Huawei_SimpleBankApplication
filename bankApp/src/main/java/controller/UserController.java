package controller;

import java.util.Hashtable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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
	
	@RequestMapping("{id}")
	public User getUserByTC(@PathVariable("id") String id) {
		return us.getUser(id);
	}
	
}
