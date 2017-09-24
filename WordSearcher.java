package exampleOf_FileOutputStream;
import java.io.*;
public class WordSearcher {
	 			public void search(String filePath, String searchedExpression)  throws IOException  {
			InputStream f= new FileInputStream(filePath);
			int charsQauntity=f.available();             //getting quantity of characters of the file
		   char charsOfFile[]= new char[charsQauntity];
		   int l=searchedExpression.length();    // l is the length of the searched 
		  for (int i=0; i<charsQauntity; i++){
			                                               charsOfFile[i]= (char) f.read();   // creating the massive from chars of the file
			                                             //  System.out.print(charsOfFile[i]);
		   			                                                                           }
		   				f.close();
		   				for (int i=0; i<charsQauntity-l+1; i++) {
		   														char currentChars[]=new char[l];
		   					                                    for (int j=0; j<l; j++){
		   					                                    	                    currentChars[j]=charsOfFile[i+j]; 
		   					                                                           }
		   					                                    String currentString = new String(currentChars);     
		   					                                 //   System.out.println(currentString);
		   					                                    if(currentString.equals(searchedExpression)){
		   					                                    	System.out.println("found a new matching, at the char"+i);
		   					                                    }
		   				}
	 			}
}

		   			