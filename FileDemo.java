import java.io.File;//import keyword is used to import built-in and user defined package into our java source file. So that our class can refer a class that is in another package by directly 
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
//here we are creating the class
public class FileDemo {//class name taken as FileDemo

	public static void main(String[] args) throws IOException {
		//Here public is a access modifier which defines who can access this method
		//Here static a keyword which identifies class related thing
		//void is used to define return type of the method,void means method wont return any value
		//main is name of method
		//declares method String[]
		//String[]args means arguments will be passed into main method and says that main() as a parameter
		//here we are creating the source file and the destination file
		File sourcefile = new File("E:/File/abc.txt");
		File destfile = new File("E:/File/new/bcd.txt");
		//here we are applying the try  catch to handle the exception
		//here we are using the file.copy method to copy the file 
		//from one file to another file

		try {
			Files.copy(sourcefile.toPath(), destfile.toPath(),StandardCopyOption.REPLACE_EXISTING);}
			catch (FileNotFoundException e) {
				e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("File Copied Succesfully");//system is used to return code
        //out is a static member
  	//Println is used to print text  and gives output
	}
	

}
