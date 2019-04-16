package main;

public class On implements ICom{
	DevI device;
	public On(DevI device)
	{
		this.device = device;
	}

	@Override
	public void execute() {
		System.out.println("Power is on");
		
	}

	@Override
	public void undo() {
		System.out.println("Power is off");
	}
	
	@Override
	public void redo() {
		execute();
	}
}
