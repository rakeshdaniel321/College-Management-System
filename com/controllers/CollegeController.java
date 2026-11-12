package controllers;
import modules.CollegeEntity;
import services.CollegeServices;

public class CollegeController {

    public static void start() {
        CollegeServices service = new CollegeServices();

        service.addRecord(new CollegeEntity(1, "Rakesh", "Computer Science", "Students"));
        service.addRecord(new CollegeEntity(2, "Niju", "Mathematics","PROFESSOR"));
        service.addRecord(new CollegeEntity(3, "Priya", "Administration","staff"));
        service.addRecord(new CollegeEntity(4, "Lakshmi", "Management", "PRINCIPAL"));

        System.out.println("\n--- All Records ---");
        service.viewAll();

        service.updateRecord(new CollegeEntity(2, "Niju", "Physics", "PROFESSOR"));
        System.out.println("\n--- After Update ---");
        service.viewAll();

     // service.removeRecord(3);
        //System.out.println("\n--- After Remove ---");
        //service.viewAll();
    }
}