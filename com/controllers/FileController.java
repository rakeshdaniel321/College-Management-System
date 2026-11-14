package controllers;
import services.CollegeServices;
import modules.CollegeEntity;
import java.io.File;
import services.FileService;
public class FileController  {
public static void start(){

	FileService service =new FileService();
	 service.CreateFile();
	service.ReadAllFile( service);
	service.viewAll();
}
}