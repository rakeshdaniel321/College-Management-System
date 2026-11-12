package services;
import modules.CollegeEntity;
import java.util.ArrayList;

public class CollegeServices 
{
    private ArrayList<CollegeEntity> list  = new ArrayList<>();

    public boolean addRecord(CollegeEntity record)
 {
        return list.add(record);
    }


 public void viewAll()
 {

        if (list.isEmpty())
 {
            System.out.println("No records found");
            return;
        }

        for (CollegeEntity record : list) {
            System.out.println(record);
        }
    }


    public CollegeEntity findById(int id) {
        for (CollegeEntity record : list) {
            if (record.getId() == id) return record;
        }
        return null;
    }

 
    public ArrayList<CollegeEntity> findByName(String name)
 {
        ArrayList<CollegeEntity> result = new ArrayList<>();
        for (CollegeEntity record : list) 
{
            if (record.getName().equalsIgnoreCase(name)) result.add(record);
        }
        return result;
    }



    public boolean updateRecord(CollegeEntity updated) {
        CollegeEntity existing = findById(updated.getId());
        if (existing == null) return false;
        existing.setName(updated.getName());
        existing.setDept(updated.getDept());
        existing.setRole(updated.getRole());
        return true;
    }

    // Remove
  //  public boolean removeRecord(int id) {
    //    CollegeEntity existing = findById(id);
      //  return existing != null && list.remove(existing);
   // }


}