package main;

public class VolOff implements ICom{
	DevI device;
	public VolOff(DevI device)
	{
		this.device = device;
	}
	
	@Override
	public void execute() {
		device.down();
		
	}

	@Override
	public void undo() {
		device.up();
	}
	
	@Override
	public void redo() {
		execute();
	}
}
