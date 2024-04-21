import java.util.ArrayList;

public class Coaches extends NFLEmployees {
  //declares fields
  private double salaryc;
  private ArrayList<String> coachesName = new ArrayList<>();
  public Coaches(String name) {
    //sets the average salry and adds coaches name 
    addPlayer(name);
    coachesName.add(name);
    this.salaryc = 5000000.0;
    }
  public double getSalary() {
  // returns salary
    return salaryc;
    }
  public void addCoach(String name) {
    //Adds coaches name to array list
    coachesName.add(name);
    }
}