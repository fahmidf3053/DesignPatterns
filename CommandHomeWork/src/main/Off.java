package main;

public class Off implements ICom{
	DevI device;
	public Off(DevI device)
	{
		this.device = device;
	}
	
	@Override
	public void execute() {
		System.out.println("Power is off");
		
	}

	@Override
	public void undo() {
		System.out.println("Power is on");
	}
	
	@Override
	public void redo() {
		execute();
	}
}
