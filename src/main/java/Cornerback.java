import java.util.*;

public class Cornerback extends Players {
  private int tackles;
  private int interceptions;
  private int patdowns;
  
  public Cornerback(String name) {
    super(name);
    interceptions = 0;
    tackles = 0;
    patdowns = 0;
  }  
  public void setStats() {
    super.setStats();
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number of tackles: ");
    tackles = input.nextInt();
    System.out.println("Enter the number of interceptions: ");
    interceptions = input.nextInt();
    System.out.println("Enter the number of patdowns");
    patdowns = input.nextInt();
    System.out.println("tackles: " + this.tackles + 
    "\ninterceptions: " + this.interceptions + "\npatdowns: " + patdowns);
  }
}