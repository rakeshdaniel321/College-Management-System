package services;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.lang.Integer;
import modules.CollegeEntity;

public class FileService extends CollegeServices{

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

public void ReadAllFile(CollegeServices service){
	
	boolean isFirstLine = true;
	  try {
            Path file= Paths.get("..","StudentData.txt");
            List<String> lines = Files.readAllLines(file);

            for (String line : lines) {
		
 if (isFirstLine) {        
        isFirstLine = false;
    		    continue;
    			}	

             //  System.out.println(line);
	  String[] lineParts =line.split(",");
         int id =Integer.parseInt(lineParts[0]);
         String name = lineParts[1];
            String dept = lineParts[2];
            String role = lineParts[3];
          service.addRecord(new CollegeEntity(id, name, dept, role));
}
        } 
catch (IOException e) {
            System.out.println("File Not redable : " + e.getMessage());
        }
}

}
