package service;

import java.io.File;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.stream.Stream;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

import model.User;


@Service
public class UserService {

	Hashtable<String,User> users = new Hashtable<String,User>();

	
	public UserService(){
		User u = new User();
		u.setName("Ozgur Can");
		u.setSurname("Erdogan");
		u.setTcID("20759830666");
		u.addCurrency("TRY", 130000.0);
		u.addCurrency("USD", 1300.0);
		users.put(u.getTcID(), u);
		
		u = new User();
		u.setName("Caner");
		u.setSurname("Dogan");
		u.setTcID("20759830668");
		u.addCurrency("TRY", 130000.0);
		users.put(u.getTcID(), u);
		
	}
	public User getUser(String id) {
		
		if(users.containsKey(id))
			return users.get(id);
		else 
			return null;

	}
	public boolean addMoney(String id, String base, double amount) {
		if(users.containsKey(id)) {
			users.get(id).addCurrency(base, amount);
			return true;
		}
		else 
			return false;
	}
	public Hashtable<String,User> getAll() {
		return users;
	}
	public void addUser(User temp) {
		users.put(temp.getTcID(), temp);
	}
	
	
}
