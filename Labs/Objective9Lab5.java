import java.util.Scanner;

public class Objective9Lab5 {

  public static void main(String[] args) {
    Scanner kb = new Scanner (System.in);
		boolean keepGoing = true;
		int choice;
		double answer = 0.0;

    System.out.println("Please give me a number.");
    double num1 = kb.nextInt();
    System.out.println("Please give me another number.");
    double num2 = kb.nextInt();

		while (keepGoing) {
			printMenu();
			System.out.print("Which would you like to do? ");
			choice = kb.nextInt();

			switch (choice) {
        case 1:
          double sum = findSum(num1, num2);
          System.out.println(num1+" + "+num2+" = "+sum);
          break;
        case 2:
          double average = findAverage(num1, num2);
          System.out.println("The average of " +num1+ " and "+num2+ " is: "+average);
          break;
        case 3:
          double tax = calcTax(num1, num2);
          System.out.println("The amount in tax to be collected from a purchase of "+num1+" and "+num2+" is: "+tax);
          break;
        case 4:
          System.out.println("You've chosen to quit.");
          break;
          case 5:
            System.out.println("Invalid entry.  Please try again");
            break;

		}

  }
	}

	 public static void printMenu() {
		System.out.println();
		System.out.println("========= MENU =========");
		System.out.println("|                      |");
		System.out.println("|   1. Add Numbers     |");
		System.out.println("|   2. Find Average    |");
		System.out.println("|   3. Calculate Tax   |");
		System.out.println("|   4. Exit            |");
		System.out.println("|                      |");
		System.out.println("========================");
		System.out.println();
	}

	public static double findSum(double num1, double num2) {
		double sum = num1 + num2;
		return sum;
	}
  public static double findAverage(double num1, double num2) {
		double average = ((num1 + num2)/2);
		return average;
  }
  public static double calcTax(double num1, double num2) {
		double tax = (num1 + num2)*0.0831;
		return tax;
  }


}
