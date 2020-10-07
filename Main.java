import java.util.Scanner;

/**
 * Counts uo by twos and always starts at an even number
 * @author Cole Girling
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //scanner for user input
    Scanner input = new Scanner(System.in);

    //ask the user for a starting number
    System.out.println("What number do you want to begin counting from?");
    int userStartNumber = input.nextInt();

    //ask the user for an end number
    System.out.println("What number do you want to end counting at?");
    int userEndNumber = input.nextInt();

    //if the starting number is odd this will add 1 to it
    if(userStartNumber % 2 == 1){
      userStartNumber++;
    }

    //loop will run while i is equal to or less than the userEndNumber
    for(int i = userStartNumber; i <= userEndNumber; i += 2){
      //prints i to the screen
      System.out.println(i);
    }
    
  }
}
