package controllers;
import java.io.File;
import services.FileService;
public class FileController{
public static void start(){

	FileService service =new FileService();
	 service.CreateFile();
}
}