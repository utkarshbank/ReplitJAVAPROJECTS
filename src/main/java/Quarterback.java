import java.util.*;

public class Quarterback extends Players {
  //declares field
  private int passingYards;
  private int touchcdownPasses;
  private int interceptions;
  private int rushingYards;
  private Double passAccuracy;

  public Quarterback(String name) {
    super(name);
    passingYards = 0;
    touchcdownPasses = 0;
    interceptions = 0;
    rushingYards = 0;
    passAccuracy = 0.0;
  }

  public void setStats() {
    super.setStats();
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number of passing yards: ");
    passingYards = input.nextInt();
    System.out.println("Enter the number of touchdown passes: ");
    touchcdownPasses = input.nextInt();
    System.out.println("Enter the number of interceptions: ");
    interceptions = input.nextInt();
    System.out.println("Enter the number of rushing yards: ");
    rushingYards = input.nextInt();
    System.out.println("Enter the pass accuracy: ");
    passAccuracy = input.nextDouble();
    System.out.println("Passing Yards: " + this.passingYards + 
    "\nTouchdown Passes: " + this.touchcdownPasses + "\nInterceptions: "
    + interceptions + "\nRushing Yards: " + rushingYards + 
     "\nPass Accuracy: " + passAccuracy);
  }
}