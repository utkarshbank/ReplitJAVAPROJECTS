
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Players> team = new ArrayList<Players>();
    boolean done = false;
    while (!done) {
      System.out.println("Enter player name: ");
      String playerName = scanner.nextLine();
      System.out.println("Enter player position: (widreciever, quarterback, runningback, cornerback, linebacker, safety)");
      String playerPosition = scanner.nextLine();
      if (playerPosition.equals("widereciever")) {
        Players player = new Widereciever(playerName);
        player.calculateSalary();
        player.setStats();
        team.add(player);
      } else if (playerPosition.equals("quarterback")) {
        Players player1 = new Quarterback(playerName);
        player1.calculateSalary();
        player1.setStats();
        team.add(player1);
      } else if 
        (playerPosition.equals("runningback")) {
          Players player2 = new Runningback(playerName);
          player2.calculateSalary();
          player2.setStats();
          team.add(player2);
      }else if 
        (playerPosition.equals("safety")) {
          Players player3 = new Safety(playerName);
          player3.calculateSalary();
          player3.setStats();
          team.add(player3);
      } else if 
        (playerPosition.equals("cornerback")) {
          Cornerback player4 = new Cornerback(playerName);
          player4.calculateSalary();
          player4.setStats();
          team.add(player4);
        } else if         
        (playerPosition.equals("linebacker")) {
          Players player5 = new Linebacker(playerName);
          player5.calculateSalary();
          player5.setStats();
          team.add(player5);
        } else{
          System.out.println("yolo");
        }
      System.out.println("Do you want to add another player? (yes/no)");
      String choice = scanner.nextLine();
      if (!choice.equalsIgnoreCase("yes")) {
        done = true;
      }
    }
    System.out.println("Your team consists of the following players:");
    System.out.println(team.toString());
    System.out.println("What is the coaches name: ");
    String namec1 = scanner.nextLine();
    Headcoach coach = new Headcoach(namec1);
    coach.setStatsc(namec1);
    scanner.close();
  }
}