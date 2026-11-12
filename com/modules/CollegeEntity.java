package modules;
public class CollegeEntity {

  private int id;
  private String name;
  private String dept;
  private String role;

    public CollegeEntity(int id, String name, String dept, String role) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.role = role;
    }

    public int getId()      { return id; }
    public String getName() { return name; }
    public String getDept() { return dept; }
    public String getRole()   { return role; }

    public void setName(String name) { this.name = name; }
    public void setDept(String dept) { this.dept = dept; }
    public void setRole(String role)   { this.role = role; }

    @Override
    public String toString() {
        return "{" + id + " - " + name + " - " + dept + " - " + role + "}";
    }
}