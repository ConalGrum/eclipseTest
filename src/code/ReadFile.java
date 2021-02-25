package code;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class ReadFile {
  public static void main(String[] args) {
    try {
    	//my file path is on desktop, not suitable but just a demo
      File myObj = new File("C:\\Users\\Conal.Grumley\\Desktop\\javareadfile.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
    	  
    	     String[] tokens = myReader.nextLine().split(":");
    	        String last = tokens[tokens.length - 1];
    	        System.out.println(last);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }

}
