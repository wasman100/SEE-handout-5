package container;

import java.awt.FileDialog;
import java.awt.Frame;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import acm.program.*;

public class histogram extends ConsoleProgram{
	
	private static String nine="";
	private static String nineteen="";
	private static String twenty9="";
	private static String thirty9="";
	private static String fourty9="";
	private static String fifty9="";
	private static String sixty9="";
	private static String seventy9="";
	private static String eighty9="";
	private static String ninty9="";
	private static String onehundred="";

	 public void run() {
		 	ArrayList<String> file = new ArrayList<String>();
			println("Please select the file you want to check");
			FileDialog dialog = new FileDialog((Frame)null, "Select File to Open");
		    dialog.setMode(FileDialog.LOAD);
		    dialog.setVisible(true);
		   String path = dialog.getDirectory();
		   path += dialog.getFile();
		   
		    file = ReadFile(path);
		   sortingTheHistogram(file);
		   println("0 - 9:" + nine);
		   println("10 - 19:" + nineteen);
		   println("20 - 29:" + twenty9);
		   println("30 - 39:" + thirty9);
		   println("40 - 49:" + fourty9);
		   println("50 - 59:" + fifty9);
		   println("60 - 69:" + sixty9);
		   println("70 - 79:" + seventy9);
		   println("80 - 89:" + eighty9);
		   println("90 - 99:" + ninty9);
		   println("100:" + onehundred);
		   
	 }
	 
	 private void sortingTheHistogram(ArrayList<String> file) {
		// TODO Auto-generated method stub
		 int grade = -1;
		 String tidy="";
		
		 Collections.sort(file, Collections.reverseOrder());
		 for(int i =0; i<file.size(); i++) {
			 file.get(i);

			 grade = Integer.parseInt(file.get(i));
			 
			 if(grade > 0) {
				 
			 }else if(grade > 100) {
				 
			 }else if(grade < 10) {
				 nine += "*";
			 }else if(grade < 20) {
				 nineteen += "*";
			 }else if(grade < 30) {
				 twenty9 += "*";
			 }else if(grade < 40) {
				 thirty9 += "*";
			 }else if(grade < 50) {
				 fourty9 += "*";
			 }else if(grade < 60) {
				 fifty9 += "*";
			 }else if(grade < 70) {
				 sixty9 += "*";
			 }else if(grade < 80) {
				 seventy9 += "*";
			 }else if(grade < 90) {
				 eighty9 += "*";
			 }else if(grade < 100) {
				 ninty9 += "*";
			 }else {
				 onehundred += "*";
			 }

			
		 }
	}

	private static ArrayList<String> ReadFile(String path) {
			// TODO Auto-generated method stub
		 ArrayList<String> data = new ArrayList<String>();
		 int i = 0;
		try {
				

			      File myObj = new File(path);
			      Scanner myReader = new Scanner(myObj);
			      while (myReader.hasNextLine()) {
			    	  data.add(myReader.nextLine());

			      }

			      myReader.close();
			    } catch (FileNotFoundException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();

			    }
			return data;
		}
	
}
