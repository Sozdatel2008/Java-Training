package task9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MyFileNumberReader {

// Write a program that reads integers from the file tab.txt (you should create it beforehand)
// into a collection; the integers are separated by arbitrary whitespace. Among the stored
// values, find the maximum value and all indices in the collection where that value occurs.
// The program should print to the console:
// • in the first line — all numbers, separated by spaces,
// • in the second line — the maximum value,
// • in the third line — the indices at which the maximum value appears in the collection.
// Example for a file containing the numbers:
// 1 5 5 3
// -1 2 5 4
// We will obtain the following output on the console:
// 1 5 5 3 -1 2 5 4
// 5
// 1 2 6

    public static void main(String[] args) {
       ArrayList<Integer> numbers = new ArrayList<>();
       //reading the file
       try(Scanner scanner = new Scanner(new File("tab.txt"))){
            while(scanner.hasNextInt()){
                numbers.add(scanner.nextInt());
            }
       } catch(FileNotFoundException e){
            System.out.println("File is not found! Try to relocate it, if you have one.");
            return;
       }
       //printing numbers
       for(int num : numbers){
            System.out.print(num + " ");
       }
       System.out.println();

       //finding and printing the max value
       int max = numbers.get(0);
       for(int num : numbers){
        if(num > max) max = num;
       }
       
       System.out.println(max);

       //find indices of max
        for(int i = 0; i < numbers.size(); i++){
            if(numbers.get(i) == max){
                System.out.print(i + " ");
            }
        }       
    }
}
