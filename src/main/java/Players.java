import java.util.*;
class Players extends NFLEmployees {
  private String position;
  public Players(String name) {
    super.addPlayer(name);
  }
  public void calculateSalary() {
    Scanner input = new Scanner(System.in);
    boolean answer = true;
    //sets currentSalary to the salary in NFLEmployees
    double currentSalary = super.getSalary();
    while (answer) {
      System.out.println(" What players are on your team: Are they on offense or defense?");
      String ans = input.next();
      if (ans.equals("offense")) {
        //If player is this position hen it will substrat or add that much from the salary in NFLEmployees.
        System.out.println("What position does he play? (widereciever, runningback, quarterback(Again))");
        this.position = input.next();
        if(position.equals("widereciever")){
          currentSalary -= 600000.0; 
        } else if (position.equals("runningback")) {
          currentSalary -= 800000.0; 
        } else if (position.equals("quarterback")) {
          currentSalary += 6500000.0; 
        }
      } if (ans.equals("defense")) {
        System.out.println("What position does he play? (cornerback, linebacker, safety(Again))");
        this.position = input.next();
        if(position.equals("joe")){
          
        } else if (position.equals("cornerback")) {
          currentSalary -= 500000.0; 
        } else if (position.equals("linebacker")) {
          currentSalary -= 700000.0; 
        } else if (position.equals("safety")) {
          currentSalary -= 600000.0; 
        }
      }
      System.out.println("Salary: $" + currentSalary);
      answer = false;
      //ends loop
    }
  }
  public void setStats() {
    System.out.println("Setting player stats...");
  }
}

