package main;

public class Occidental implements ICountry{
	
	public Flora createFlora() {
		Flora f = new FloraOcci("Occidental flora");
		
		return f;
	}
	
	public Fauna createFauna() {
		Fauna f = new FaunaOcci("Occidental fauna");
		
		return f;
	}
}
