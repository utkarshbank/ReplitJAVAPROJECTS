import java.util.*;

public class Widereciever extends Players {
  private int recievingyards;
  private int touchcdowns;
  private int receptions;

  public Widereciever(String name) {
    super(name);
    receptions= 0;
    touchcdowns = 0;
    recievingyards = 0;
  }

  public void setStats() {
    super.setStats();
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number of receptions: ");
    receptions = input.nextInt();
    System.out.println("Enter the number of touchdowns: ");
    touchcdowns = input.nextInt();
    System.out.println("Enter the number of recieving yards: ");
    recievingyards = input.nextInt();
    System.out.println("receptions: " + this.receptions +
  "\nTouchdowns: " + this.touchcdowns + "\nRecieving Yards: "
  + recievingyards);
  }
}