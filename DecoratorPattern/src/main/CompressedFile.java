package main;

public class CompressedFile extends Decorator{
	
	IFile iFile;
	
	public CompressedFile(IFile iFile) {
		super(iFile);
	}
	
	public void readFile() {
		System.out.println("preparing for comp reading....");
		
		iFile.readFile();
	}
	
	public void writeFile() {
		iFile.writeFile();
		
		System.out.println("Comp Writing....");
		
		
	}
}
