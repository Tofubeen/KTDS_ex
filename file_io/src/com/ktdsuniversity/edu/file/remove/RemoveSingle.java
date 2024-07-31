package com.ktdsuniversity.edu.file.remove;

import java.io.File;

public class RemoveSingle {
	
	public void removeFile(File file) {
		file.delete();
	}

	
	public void removeDir(File dir) {
		dir.delete();
	}
	
	public static void main(String[] args) {
		RemoveSingle removeSingle = new RemoveSingle();
		
		File txtFile = new File("C:\\Users\\User\\Desktop\\java\\java_output.txt");
		removeSingle.removeFile(txtFile);
		
		File dir1 = new File("C:\\Users\\User\\Desktop\\java\\dir");
		removeSingle.removeDir(dir1);
		
		File dir2 = new File("C:\\Users\\User\\Desktop\\java\\java_output.txt");
		removeSingle.removeFile(txtFile);
		
		File dir3 = new File("C:\\Users\\User\\Desktop\\java\\java_output.txt");
		removeSingle.removeFile(txtFile);
		
	}
}
