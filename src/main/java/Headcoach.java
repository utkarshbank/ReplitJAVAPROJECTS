import java.util.Scanner;

public class Headcoach extends Coaches {
  Scanner input = new Scanner(System.in);
  //gets the salary from the coaches class
  double coachessalary = super.getSalary();
  public Headcoach(String name) {
    // gets name of coach from the coaches class
    super(name);
    }
  public void setStatsc(String name) {
    //sets coaches salary and adds names to the addCoach Array
    super.addCoach(name);
    coachessalary += 1000000.0;
    System.out.println("Coaches Salary: " + coachessalary);
    System.out.println("Your coach is: " + name);
      
    }
}