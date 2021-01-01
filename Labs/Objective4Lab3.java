import java.util.Scanner;

public class Objective4Lab3 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("How old are you?");
    int age = input.nextInt();
    int currentYear = 2021;
    int birthYear = (2021 - age);


    System.out.println("You were born in " + birthYear);
  }
}
