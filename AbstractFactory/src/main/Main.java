package main;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factory factory = new Factory("Oriental");
		ICountry country= factory.createCountry();
		
		country.createFauna();
		country.createFlora();
	}

}
