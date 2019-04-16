package main;

public class Main {

	public static void main(String[] args) {
		DevI tv = new Tv();
		
		Command command = new Command();
		command.addCommand(new On(tv));
		command.addCommand(new VolUp(tv));
		command.execute();
		command.execute();
		command.undo();
		command.undo();

	}

}
