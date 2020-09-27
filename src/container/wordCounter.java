
package container;

import acm.program.*;

import java.awt.FileDialog;
import java.awt.Frame;
import java.io.*;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class wordCounter extends ConsoleProgram {

	private static int lines1 = 0;

	public void run() {

		println("Please select the file you want to check");
		FileDialog dialog = new FileDialog((Frame) null, "Select File to Open");
		dialog.setMode(FileDialog.LOAD);
		dialog.setVisible(true);
		String path = dialog.getDirectory();
		path += dialog.getFile();

		String file = ReadFile(path);
		int wordCount = countWords(file);
		int characterCount = countChar(file);

		println("File: " + dialog.getFile());
		println("Lines = " + lines1);
		println("Words = " + wordCount);
		println("Characters = " + characterCount);

	}

	private static int countChar(String file) {
		// TODO Auto-generated method stub
		String[] st = file.split("\\s*|,|\'");
		return st.length;

	}

	private static int countWords(String file) {
		// TODO Auto-generated method stub
		String[] st = file.split("\\s|,|\'");
		return st.length;
	}

	private static String ReadFile(String path) {
		// TODO Auto-generated method stub
		String data = "";
		try {

			File myObj = new File(path);
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				data += myReader.nextLine();
				lines1++;
			}

			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();

		}
		return data;
	}
}
