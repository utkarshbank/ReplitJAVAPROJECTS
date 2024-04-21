import java.util.*;

public class Runningback extends Players {
  private int rushingYards;
  private int carriespergame;
  private int touchdowns;

  public Runningback(String name) {
    super(name);
    carriespergame= 0;
    touchdowns = 0;
    rushingYards = 0;
  }

  public void setStats() {
    super.setStats();
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number of touchdown: ");
    touchdowns = input.nextInt();
    System.out.println("Enter the number of carries per game: ");
    carriespergame = input.nextInt();
    System.out.println("Enter the number of rushing yards: ");
    rushingYards = input.nextInt();
    System.out.println( "Rushing Yards: " + this.rushingYards +
    "\nTouchdowns: " + this.touchdowns + "\nCarries Per Game: "
        + carriespergame);
  }
}