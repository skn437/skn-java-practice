package com.main;

//Hello
import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    //* Double To Int Conversion
    double num1 = 5.8;
    int num2 = (int) num1;

    System.out.println("Double To Int Conversion: " + num2);

    //* Division Between Int And Double/Float Always Gives Double
    double number1 = 12.8;
    int number2 = 6;

    System.out.println("Division: " + number1 / number2);

    //* String Methods
    String name = "SKN is SKN";

    System.out.printf("Length: %d", name.length());

    System.out.printf("\nEmpty: %b", name.isEmpty());

    System.out.printf("\nUpper: %s", name.toUpperCase());

    System.out.printf("\nLower: %s\n", name.toLowerCase());

    String objectString1 = new String("skn");
    String objectString2 = new String("skn");
    String objectString3 = new String("SKN");

    System.out.println(objectString1 == objectString2); // Returns False
    System.out.println(objectString1.equals(objectString2)); // Returns True
    System.out.println(objectString3.equalsIgnoreCase(objectString2)); // Returns True

    System.out.println(String.format("Format Method: %s", objectString3));
    System.out.println(objectString3.replace("KN", "KY"));

    String string1 = "I am SKN";

    System.out.println(string1.contains("am")); // Returns True
    System.out.println(string1.contains("Am")); // Returns False

    //* User Input
    //? To use "Scanner", you have to import java.util.Scanner
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter A String: ");
    String userInput = scanner.nextLine(); // .nextLine() method takes <enter> as input

    System.out.printf("Hello %s, how old are you? ", userInput);
    int age = scanner.nextInt(); // .nextInt() doesn't take <enter> as input, but keeps it in buffer, which will cause bug

    System.out.printf("Your age is %d\n", age);
    scanner.nextLine(); // This line exists to solve <enter> buffer created by .nextInt() before this. It will clean that.

    System.out.print("Messaage: ");
    String hello = scanner.nextLine(); // This input statement won't trigger if there is .nextInt() before this.

    System.out.printf("Greetings %s\n", hello);

    // To Avoid .nextInt(), .nextDouble(), .nextFloat() methods' <enter> buffering, you can instead use .nextLine() and parse them.

    System.out.print("Enter A Double: ");
    double double1 = Double.parseDouble(scanner.nextLine());

    System.out.printf("You Entered: %f", double1);

    scanner.close(); // You have to close Scanner instance at the end or there will be resource leak
  }
}
