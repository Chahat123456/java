package classtest;
import java.util.Random;
import java.util.Scanner;

public class class_test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String USER = "user";
        String PASS = "nepal123";
        System.out.print("Enter username: ");
        String username = scan.nextLine();
        System.out.print("Enter password: ");
        String password = scan.nextLine();
        if (username.equals(USER) && password.equals(PASS)) {
            System.out.println("Welcome To The Program");
            System.out.println("What do you want to do today?");
            System.out.println("1.Calculator");
            System.out.println("2.Simple Interest Calculator");
            System.out.println("3.Checking Vowel or Consonant");
            System.out.println("4.Guessing Game");
            int whichtool = scan.nextInt();

            switch (whichtool) {
                case 1:
                    System.out.println("Calculator");
                    System.out.print("Enter Operation (+,-,*,/): ");
                    String operation = scan.next();
                    System.out.print("First Number: ");
                    double firstn = scan.nextDouble();
                    System.out.print("Second Number: ");
                    double secondn = scan.nextDouble();
                    double num1, num2;
                    double great = Math.max(firstn, secondn);
                    if (great == firstn) {
                        num1 = firstn;
                        num2 = secondn;
                    } else if (great == secondn) {
                        num2 = firstn;
                        num1 = secondn;
                    } else {
                        num1 = firstn;
                        num2 = secondn;
                    }

                    switch (operation) {
                        case "+":
                            System.out.println("The sum is: " + (firstn + secondn));
                            break;
                        case "-":
                            System.out.println("The difference is: " + (num1 - num2));
                            break;
                        case "*":
                            System.out.println("The result is: " + (num1 * num2));
                            break;
                        case "/":
                            System.out.println("The division is: " + (num1 / num2));
                            break;

                        default:
                            System.out.println("Operation Invalid");
                    }
                    break;

                case 2:
                    System.out.println("Simple Interest Calculator");
                    System.out.println("Enter Principle: ");
                    double principle = scan.nextDouble();
                    System.out.println("Enter Time");
                    double time = scan.nextDouble();
                    System.out.println("Enter Rate");
                    double rate = scan.nextDouble();

                    double si = (principle * time * rate) / 100;
                    System.out.println("SI is " + si);

                    break;

                case 3:
                    System.out.println("You choose Vowel Consonant Check");
                    System.out.println("Enter a character");
                    String character = scan.next().toLowerCase();
                    switch (character) {
                        case "a", "e", "i", "o", "u":
                            System.out.println("Vowel");
                            break;
                        default:
                            System.out.println("Consonant");
                            break;
                    }


                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;

                case 4:
                    Random random = new Random();
                    int targetNumber = random.nextInt(11);

                    System.out.println("You Choose Guessing Game!");

                        System.out.print("Enter your guess (0-10): ");
                        int guess = scan.nextInt();
                        if (guess == targetNumber) {
                            System.out.println("Correct");
                            break;

                        } else {
                            System.out.println("Wrong");
                        }
                        break;



            }}
        else{
                System.out.println("Invalid Login");
            }
        }
    }