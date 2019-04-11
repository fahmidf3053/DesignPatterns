package main;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IFile file = new CompressedFile(new EncryptedFile(new File()));
		file.writeFile();
		//file.readFile();
		
	}

}
