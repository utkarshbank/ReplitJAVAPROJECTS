import java.util.*;

public class Safety extends Players {
  private int tackles;
  private int interceptions;

  public Safety(String name) {
    super(name);
    interceptions = 0;
    tackles = 0;
  }

  public void setStats() {
    super.setStats();
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number of tackles: ");
    tackles = input.nextInt();
    System.out.println("Enter the number of interceptions: ");
    interceptions = input.nextInt();
    System.out.println("tackles: " + this.tackles + "\ninterceptions: " + this.interceptions);
  }
}