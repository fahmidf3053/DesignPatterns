package main;

public class Customer {
	private  Notification notification;
	
	public Customer(Notification notification) {
		this.notification=notification;
	}
	
	public void checkCUstomer() {

		notification.printNotification();

	  }
	

}
