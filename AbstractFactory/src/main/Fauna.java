package main;

public abstract class Fauna {
	String s;
	
	public Fauna(String s) {
		this.s=s;
	}
	
	abstract public void grow();
}
