package service;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.stream.Stream;
import org.springframework.stereotype.Service;
import model.User;

@Service
public class UserService {

	Hashtable<String,User> users = new Hashtable<String,User>();
	
	public UserService(){
		User u = new User();
		u.setName("Ozgur Can");
		u.setSurname("Erdogan");
		u.setAmount(130000.0);
		u.setTcID("20759830666");
		users.put(u.getTcID(), u);
		
		u = new User();
		u.setName("Caner");
		u.setSurname("Dogan");
		u.setAmount(130000.0);
		u.setTcID("20759830668");
		users.put(u.getTcID(), u);
	}
	public User getUser(String id) {
		
		if(users.containsKey(id))
			return users.get(id);
		else 
			return null;

	}
	public Hashtable<String,User> getAll() {
		return users;
	}
}
