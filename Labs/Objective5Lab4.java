import java.util.Scanner;

public class Objective5Lab4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter a number: ");
    int userNum = scanner.nextInt();
    int x = userNum % 2;
    if(x == 0) {
      System.out.println("The number is even");
    }
    else if (x != 0){
      System.out.println("The number is odd");
    }
  scanner.close();
  }
}
