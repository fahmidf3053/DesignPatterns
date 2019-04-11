package main;

public class Oriental implements ICountry{
	
	public Flora createFlora() {
		Flora f = new FloraOrien("Oriental flora");
		
		return f;
	}
	
	public Fauna createFauna() {
		Fauna f = new FaunaOrien("Oriental fauna");
		
		return f;
	}
	

}
