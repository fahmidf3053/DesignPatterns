package main;

public class Tv implements DevI{
	
	public void up()
	{
		System.out.println("Volume increased");
	}
	public void down()
	{
		System.out.println("Volume decreased");
	}
	public void on() {
		System.out.println("Power on");
	}
	public void off()
	{
		System.out.println("Power off");
	}

}
