package services;
import java.io.File;
import java.io.IOException;
public class FileService{

File file=new File("C:\\Users\\HP\\Desktop\\java\\payilagam Java\\collegeManagementSysytem\\College-Management-System\\StudentData.txt");

public void CreateFile(){
		try{
		 if (file.createNewFile()) {
                System.out.println("File created successfully!");
            	}
		 else
		 {
                System.out.println("File already exists.");
            }

        	} 
	catch (IOException e)
		 {
           		 System.out.println("An error occurred.");

		}

}

}
