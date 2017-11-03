import java.io.FileInputStream;//import keyword is used to import built-in and user defined package into our java source file. So that our class can refer a class that is in another package by directly 
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {//class name taken as FileCopy

	public static void main(String[] args) throws IOException {//Here public is a access modifier which defines who can access this method
		//Here static a keyword which identifies class related thing
		//void is used to define return type of the method,void means method wont return any value
		//main is name of method
		//declares method String[]
		//String[]args means arguments will be passed into main method and says that main() as a parameter
		String strSourceFile= "E:\\MyFile.txt";
		String strCopyFile="E:\\MyFile1.txt";
		//create FileInputStream object for source file
        FileInputStream fin = new FileInputStream(strSourceFile);
        //create FileOutputStream object for destination file
        FileOutputStream fout = new FileOutputStream(strCopyFile);
       
        byte[] b = new byte[1024];
        int noOfBytes = 0;//initializng
       
        System.out.println("Copying file using streams");//system is used to return code
        //out is a static member
  	//Println is used to print text  and gives output
       
        //read bytes from source file and write to destination file
        while( (noOfBytes = fin.read(b)) != -1 )
        {
                fout.write(b, 0, noOfBytes);
        }
       
        System.out.println("File copied!");//system is used to return code
        //out is a static member
  	//Println is used to print text  and gives output
       
        //close the streams
        fin.close();
        fout.close();  

	}

}