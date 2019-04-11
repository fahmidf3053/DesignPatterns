package main;

import java.util.List;
import java.util.ArrayList;

public class Subject {
	
	List<User>observer;
	
	public Subject() {
		this.observer = new ArrayList<>();
	}
	
	public void sendNotification(List<User> users) {
		for(User user: users) {
			user.getNotification();
		}
	}
	
	public void Subscribe(User user) {
		observer.add(user);
	}
	
	public void unSubscribe(User user) {
		observer.remove(user);
	}
	
}
