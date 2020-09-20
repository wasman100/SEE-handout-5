package container;

import java.util.ArrayList;

import acm.program.*;

public class uniqueName extends ConsoleProgram  {
	public void run() {
		
		ArrayList<String> Names = new ArrayList<String>();
		Names=nameGenerator();
		println("Unique name list contains:");
		singleLineList(Names);
	}

	private void singleLineList(ArrayList<String> names) {
		// TODO Auto-generated method stub
		for(int i =0; i<names.size(); i++) {
			println(names.get(i));
		}
	}

	private ArrayList<String> nameGenerator() {
		String name ="";
		ArrayList<String> Names = new ArrayList<String>();
		do {
			name = readLine("Enter name: ");
			if(!Names.contains(name)) {
				Names.add(name);
			}
		}while(!(name.equals("")));
		return Names;
	}

}
