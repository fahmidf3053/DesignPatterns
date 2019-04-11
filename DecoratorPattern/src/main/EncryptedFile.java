package main;

public class EncryptedFile extends Decorator {
IFile iFile;
	
	public EncryptedFile(IFile iFile) {
		super(iFile);
	}
	
	public void readFile() {
		System.out.println("preparing for encrypt reading....");		
		iFile.readFile();
	}
	
	public void writeFile() {
		iFile.writeFile();		
		System.out.println("encrypt Writing....");	
	}

}
