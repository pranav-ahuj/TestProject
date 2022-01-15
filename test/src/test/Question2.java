package test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Question2 {

	public static void main(String[] args) throws IOException {


		String TestFile = "D:\\Assignment2\\start_assignment.log";	
	     FileReader FR = new FileReader(TestFile);
		  BufferedReader BR = new BufferedReader(FR);
		  String Content = "";
		  
		  while((Content = BR.readLine())!= null){
			   System.out.println(Content);
			 
			  }
		  
		  
		  if((BR.readLine().equals("beginning of assignment"))){
		   System.out.println("The string is present");
		  
    }
		  Pattern p = Pattern.compile("required_pattern");  
		  Matcher m = p.matcher("as");  
		  boolean b = m.matches();  
		
		  BR.close();
		  
		  String TestFile1 = "D:\\Assignment2\\Logs\\required_pattern_00.File";
		  if((BR.readLine().equals("assignment_completed"))){
			   System.out.println("The string is present");
			  
	    } 

	}
}
