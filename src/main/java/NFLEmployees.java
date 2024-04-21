import java.util.ArrayList;
import java.util.Scanner;

public class NFLEmployees {
  //Sets up fields salary and playerName ArrayList
  private double salary;
  private ArrayList<String> playersName;

  public NFLEmployees(int s) {
    this.salary = s;
  }

  public NFLEmployees() {
    //initalizes salary;
    this.salary = 4600000.0;
  }

  public double getSalary() {
    //return salary
    return salary;
  }

  public void addPlayer(String name) {
    //creates playerName ArryList and adds name to it
    playersName = new ArrayList<>();
    playersName.add(name);
  }

  public ArrayList<String> getPlayers() {
    return playersName;
  }

  public void calculateSalary() {
    System.out.println("This is the calcSal in the NFLEmployees.");
  }

}
