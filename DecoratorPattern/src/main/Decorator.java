package main;

public abstract class Decorator implements IFile{
	IFile iFile;
	
	public Decorator(IFile iFile) {
		this.iFile=iFile;
	}
}
