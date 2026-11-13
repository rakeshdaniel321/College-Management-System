import controllers.CollegeController;
import controllers.FileController;
public class Server {
    public static void main(String[] args) {
        System.out.println("Server Start");
        CollegeController.start();
	FileController.start();
    }
}