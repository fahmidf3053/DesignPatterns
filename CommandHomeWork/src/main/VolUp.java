package main;

public class VolUp implements ICom{
	DevI device;
	public VolUp(DevI device)
	{
		this.device = device;
	}
	
	@Override
	public void execute() {
		
		device.up();
	}

	@Override
	public void undo() {
		
		device.down();
	}
	
	@Override
	public void redo() {
		execute();
	}
}
