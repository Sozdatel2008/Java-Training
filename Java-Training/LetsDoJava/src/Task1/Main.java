package Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Write a program reading in a loop single digits until a negative number is entered.
        // Then it prints two numbers: one contains the digits that have been entered as its
        // consequtive digits from left to right, and in the other the order of digits is opposite.
        // For example, if digits entered were 3 0 2 5 -1, then the two numbers should be 3025
        // and 5203.
        Scanner scanner = new Scanner(System.in);
        int realNumber = 0;
        int inverseNumber = 0;
        int inverseCounter = 1;
        while (true) { 
            //int previousNumber = 0;
            System.out.println("Write your number (negative to finish the programm) –> ");
            int n = scanner.nextInt();
            
            if(n < 0){
                scanner.close();
                System.out.println("First number -> " + realNumber);
                System.out.println("Second number (inverse) -> " + inverseNumber);
                break;
            } else {
                realNumber = realNumber * 10 + n;
                inverseNumber = n * inverseCounter + inverseNumber;
                inverseCounter = inverseCounter * 10;
            }
        }
    }
}
