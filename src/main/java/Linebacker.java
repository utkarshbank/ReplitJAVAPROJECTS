import java.util.*;

public class Linebacker extends Players {
  private int tackles;
  private int interceptions;
  private int patdowns;
  private int forcedfumble;
  
  public Linebacker(String name) {
    //default constructor and calls super name to get name from the player class
    super(name);
    interceptions = 0;
    tackles = 0;
    patdowns = 0;
    forcedfumble = 0;
  }
  public void setStats() {
    //Gets setStats method from the Players class
    super.setStats();
    //Asks for stats(user input)
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number of tackles: ");
    tackles = input.nextInt();
    System.out.println("Enter the number of interceptions: ");
    interceptions = input.nextInt();
    System.out.println("Enter the number of patdowns");
    patdowns = input.nextInt();
    System.out.println("Enter the number of forcedfumbles");
    forcedfumble = input.nextInt();
    System.out.println("tackles: " + this.tackles + "\ninterceptions: " + this.interceptions + "\npatdowns: " + patdowns + "\nforced fumble: " + forcedfumble);
  }
}