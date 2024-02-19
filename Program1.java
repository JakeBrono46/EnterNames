import java.util.*;
import java.io.*;

public class Program1 {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(System.in);
		PrintWriter outfile = new PrintWriter("output.txt");
		Formatter table = new Formatter();
		
		//Program asks how many names are to be entered
		System.out.print("How many names to be entered? ");
		int numName = scan.nextInt();
		System.out.println();
		
		String fname[] = new String[numName], lname[] = new String[numName], name[] = new String[numName];
		int age[] = new int[numName];
		
		//Table Header
		table.format("%-15s %-2s\n", "NAME", "AGE");
		table.format("--------------------\n");
		
		//Loop goes for however many names were requested
		for(int i = 0; i < numName; i++) {
			
			//User enters info
			System.out.print("Enter Name and Age: ");
			fname[i] = scan.next();
			lname[i] = scan.next();
			age[i] = scan.nextInt();
			System.out.println();
								
			name[i] = fname[i] + " " + lname[i];
			
			//Info is printed to external file
			table.format("%-15s %-2s\n", name[i], age[i]);
		}
		
		
		outfile.print(table);
		outfile.close();
		
		System.out.println(table);
		System.out.println("Info printed to file!");
		
	}

}
